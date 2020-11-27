package review;

import java.text.SimpleDateFormat;

class Timer extends Thread{
	SimpleDateFormat sdf;
	Timer(){super();
	sdf = new SimpleDateFormat("HH:mm:ss");}

	@Override
	public void run() {
		while(true) {
			System.out.println(sdf.format(System.currentTimeMillis()));
			try {sleep(1000);}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

public class Day044_1 {
	public static void main(String[] args) {
		new Timer().start();
	}

}
