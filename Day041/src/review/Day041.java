package review;

class Hello extends Thread{
	public void run() {
		try {
		for(int i=0;i<10;i++) {
			long time = (long)(Math.random()*1000);
			System.out.println("Hello");
			Thread.sleep(time);
		}
		}catch(Exception e) {e.getStackTrace();}
	}
}

class Cnt100 extends Thread{
	public void run() {
		
		try {
		for(int i=0;i<100;i++) {
			long time = (long)(Math.random()*1000);
			System.out.println(i);
			Thread.sleep(time);
		}
		}catch(Exception e) {e.getStackTrace();}
	}
}

public class Day041 {
	public static void main(String[] args) {
		Hello run1	= new Hello(); run1.start();
		Cnt100 run2	= new Cnt100(); run2.start();

	}

}
