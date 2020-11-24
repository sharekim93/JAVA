package review;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;

class TimeFunc extends Thread{
	long time;
	
	TimeFunc(){
		super();
		time=0L;
	}

	@Override
	public void run() {
		while(true) {
			System.out.println("SDF");
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
			System.out.println(sdf.format(Date.from(Instant.now())));
			
			System.out.println("UNIX");
	        //Integer intUnixTime = (int) (System.currentTimeMillis()/1000L);
	        //System.out.println(sdf.format(intUnixTime));
			long milisec = System.currentTimeMillis();
			int hour=(int)((milisec/(1000*60*60))%24)+9;
			int min=(int)((milisec/(1000*60))%60);
			int sec=(int)((milisec/(1000))%60);
			System.out.printf("%02d:%02d:%02d\n",hour,min,sec);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}


public class Day043_review {
	public static void main(String[] args) {
		new TimeFunc().start();
	}

}
