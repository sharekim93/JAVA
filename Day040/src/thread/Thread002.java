package thread;

// Thread001 class와의 비교

class Todo2 extends Thread{ 
	int todonum; //작업번호
	String todo; //작업내용
	long todotime; //작업시간
	
	public Todo2() {super();}

	public Todo2(String todo, int todonum) {
		super();
		this.todonum = todonum;
		this.todo = todo;
	}
	
	//public void start() {this.run();} // run이 필요 없음
	
	public void run() { // 작업내용 + 걸리는 시간을 랜덤하게 표현 : 처리경로
		System.out.println("\n"+this.todonum+" - "+this.todo+" Start\n");
		try {
			todotime = (long)(Math.random()*3000); 
			Thread.sleep(todotime); // thread(실행).sleep(시간) 시간만큼 재우기~
		}
		catch(Exception e) {}
		System.out.println("\n"+this.todonum+" - "+this.todo+" - "+this.todotime+" End\n");
	}
}

public class Thread002 {
	public static void main(String[] args) {
		Todo2 Todo2 = new Todo2("\t자바복습",1); Todo2.start();
		Todo2 todo2 = new Todo2("\t\t포트폴리오",2); todo2.start();
		Todo2 todo3 = new Todo2("\t\t\tGAME",3); todo3.start();
	}

}
