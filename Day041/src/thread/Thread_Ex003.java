package thread;

import java.util.ArrayList;

class Todo4 extends Thread{
	String todo;
	int num;
	
	public Todo4() {}

	public Todo4(String todo, int num) {
		super();
		this.todo = todo;
		this.num = num;
	}
	@Override
	public void run() {
		System.out.println("\n"+this.num+ "-"+this.todo+" ===START");
		try {
			Thread.sleep((long)(Math.random()*1000));
		}
		catch (InterruptedException e) {e.printStackTrace();}
		System.out.println("\n"+this.num+ "-"+this.todo+" ===END");
	}
}

public class Thread_Ex003 {
	public static void main(String[] args) {
		System.out.println("============MAIN  START");
		ArrayList<Todo4> list = new ArrayList<>();
		
		for(int i=0;i<30;i++) {
				Todo4 todo	=	new Todo4("□ TODO"+i,i+1);list.add(todo);todo.start();
		}
		try {
			for(int j=0;j<list.size();j++) {
				
				list.get(j).join();
			}
		}
		catch(InterruptedException e) {e.printStackTrace();}
		System.out.println("============MAIN END");

		

	}
}
