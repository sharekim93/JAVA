package thread;

import java.util.Calendar;

class CurrentTimer extends Thread{
	GUI gui; 
	CurrentTimer(){
		super();
		gui = new GUI();
		gui.create();}	
	@Override
	public void run() {
		while(true) {
		Calendar now = Calendar.getInstance();
		String curtime = now.get(Calendar.HOUR_OF_DAY)+"시 "
				+ now.get(Calendar.MINUTE)+"분 "
				+ now.get(Calendar.SECOND)+"초";
		gui.time.setText(curtime);
		try {
			Thread.sleep(1000);
			gui.frame.repaint(); // 
		}
		catch(InterruptedException e) {e.printStackTrace();}
		}
	}

}

