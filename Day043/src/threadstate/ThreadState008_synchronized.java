package threadstate;

class MyCatDay{
	
	public synchronized void eat() {
		for(int i=0;i<10;i++) {
			System.out.println("1.고양이 식사중...");
			try {Thread.sleep((long)(Math.random()*1000));}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("★1. 고양이 식사완료!");
	}
	public void sleep() {
		synchronized(this) {
		for(int i=0;i<10;i++) {
			System.out.println("\t2.고양이 수면중...");
			try {Thread.sleep((long)(Math.random()*1000));}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("\t2. 고양이 수면완료!");
		}
	}
	public synchronized void foo() {
		for(int i=0;i<10;i++) {
			System.out.println("\t\t3.고양이 배변중...");
			try {Thread.sleep((long)(Math.random()*1000));}
			catch (InterruptedException e) {e.printStackTrace();}
		}
		System.out.println("\t\t3. 고양이 배변완료!");
	}
}

class Todo008 extends Thread{
	MyCatDay cat;
	int type;
	
	public Todo008() {super();}
	public Todo008(MyCatDay cat, int type) {
		super();
		this.cat = cat;
		this.type = type;
	}

	@Override
	public void run() {
		switch(type) {
		case 1: cat.eat(); break;
		case 2: cat.sleep(); break;
		case 3: cat.foo(); break;
		}
	}
		
}

public class ThreadState008_synchronized {
	public static void main(String[] args) {
		MyCatDay cat = new MyCatDay();
		Todo008 todo1 = new Todo008(cat,1);
		Todo008 todo2 = new Todo008(cat,2);
		Todo008 todo3 = new Todo008(cat,3);
		
		todo1.start();
		todo2.start();
		todo3.start();
	}

}
