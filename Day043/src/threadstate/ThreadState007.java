package threadstate;

class Todo007 extends Thread{
	String todo;
	public Todo007() {super();}
	public Todo007(String todo) {
		super();
		this.todo = todo;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(todo+i);
			try {Thread.sleep((long)(Math.random()*3000));}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	
}

public class ThreadState007 {
	public static void main(String[] args) {
		Todo007	todo1	=	new Todo007("\t01");
		Todo007 todo2	=	new Todo007("\t\t02");
		Todo007 todo3	=	new Todo007("\t\t\t03");
		
		todo1.setPriority(Thread.MAX_PRIORITY);
		todo2.setPriority(Thread.MIN_PRIORITY);
		todo3.setPriority(5);
		
		System.out.println("Priority of todo1 : "+todo1.getPriority());
		System.out.println("Priority of todo2 : "+todo2.getPriority());
		
		todo1.start();
		todo2.start();
		todo3.start();
	}

}
