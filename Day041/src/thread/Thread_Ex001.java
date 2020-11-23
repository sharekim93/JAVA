package thread;

class Todo3 extends Thread{
	String todo;
	int num;
	public Todo3() {
		super();
	}
	public Todo3(String todo, int num) {
		super();
		this.todo = todo;
		this.num = num;
	}
	
	@Override
	public void run() {
		System.out.println("\n"+this.num+" - "+this.todo+"Start\n");
		try {
			Thread.sleep((long)(Math.random()*3000));
		}
		catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("\n"+this.num+" - "+this.todo+"END\n");
	}
}
/// 발생하는 문제점은? 
//1. 작업을 끝내기 전에 Main이 끝나버린다.			 

public class Thread_Ex001 {
	public static void main(String[] args) {
		System.out.println("===================MAIN START");
		for(int i=0;i<30;i++) {
			Todo3 todo = new Todo3("□ TODO"+i,i+1);todo.start();
		}
		/*try {
			Thread.sleep(10000);
		}
		catch(InterruptedException e) {e.printStackTrace();}
		*/
		System.out.println("===================MAIN END");
	}

}
