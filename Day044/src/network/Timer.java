package network;

import java.text.SimpleDateFormat;

public class Timer extends Thread{
	SimpleDateFormat sdf;
	String time;
	Timer(){
		super();
		sdf = new SimpleDateFormat("HH:mm:ss");
		time = "";
	}

	@Override
	public void run() {
		while(true) {
		time = sdf.format(System.currentTimeMillis());
		try {sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}
