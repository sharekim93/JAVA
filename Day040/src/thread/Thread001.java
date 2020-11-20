package thread;

// 직렬적으로 실행 시 보이는 화면을 보고자 작성한 예제

class Todo1{
	int todonum; //작업번호
	String todo; //작업내용
	long todotime; //작업시간
	
	public Todo1() {super();}

	public Todo1(String todo, int todonum) {
		super();
		this.todonum = todonum;
		this.todo = todo;
	}
	
	public void start() {
		this.run();
	}
	
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

public class Thread001 {
	public static void main(String[] args) {
		Todo1 todo1 = new Todo1("\t자바복습",1); todo1.start();
		Todo1 todo2 = new Todo1("\t\t포트폴리오",2); todo2.start();
		Todo1 todo3 = new Todo1("\t\t\tGAME",3); todo3.start();
	}

}
