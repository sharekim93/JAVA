package thread;

class JoinA extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("A");
			try {
			Thread.sleep((long)(Math.random()*1000));
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}

class JoinB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("\t\tB");
			try {
			Thread.sleep((long)(Math.random()*1000));
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}


public class Thread_Ex002 {
	static long start,end;
	
	public static void main(String[] args) {
		System.out.println("===========MAIN START");
		start =  System.currentTimeMillis();
		JoinA todo1 = new JoinA(); todo1.setPriority(3);todo1.start();
		JoinB todo2 = new JoinB(); todo2.start();
		try {
			todo2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		end = System.currentTimeMillis();
		System.out.println("소요시간 : "+ (end-start));
		System.out.println("===========MAIN END");
	}

}
