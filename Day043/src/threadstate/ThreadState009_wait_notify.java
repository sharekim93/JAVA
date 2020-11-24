package threadstate;

class Todo009 extends Thread{
	String todo;
	public Todo009() {
		super();
		todo = "";
	}
	public Todo009(String todo) {
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
		System.out.println(Thread.currentThread().getName() +" 작업완료!");
		notify();
	}
		
}

public class ThreadState009_wait_notify {
	public static void main(String[] args) {
		Todo009 todo	=	new Todo009("첫째 : ");todo.start();
		Todo009 todo2	=	new Todo009("둘째 : ");todo2.start();
		synchronized(todo){
			System.out.println("Todo009 완료될 때까지 기다립니다.");
			try {todo.wait();} catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("Main Done");
	}

}
