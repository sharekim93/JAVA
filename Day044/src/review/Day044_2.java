package review;

import java.text.SimpleDateFormat;

class Timer2 implements Runnable{
	SimpleDateFormat sdf;
	
	Timer2(){
		super();
		sdf = new SimpleDateFormat("HH:mm:ss");
	}
	@Override
	public void run() {
		while(true) {
			System.out.println(sdf.format(System.currentTimeMillis()));
			try {Thread.sleep(1000);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

public class Day044_2 {
	public static void main(String[] args) {
		Timer2 Timer2 = new Timer2();
		Thread thd  = new Thread(Timer2);
		thd.start();
	}

}
