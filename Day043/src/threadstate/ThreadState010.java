package threadstate;

class Todo010 extends Thread{
	String todo;
	public Todo010() {
		super();
		todo = "";
	}
	public Todo010(String todo) {
		super();
		this.todo = todo;
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(todo+i);
			try {Thread.sleep((long)(Math.random()*1000));}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}


public class ThreadState010 {
	public static void main(String[] args) {
		System.out.println("===== MAIN START!");
		Todo010 todo = new Todo010("JAVA STUDY");
		todo.setDaemon(true);
		todo.start();
		try {Thread.sleep(3000);} catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("===== MAIN END!");
	}

}
