package review;

import javax.swing.JOptionPane;

class TimeFunc2 implements Runnable{	
	TimeFunc2(){super();}

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
			System.out.println("Timer : "+i);			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("카운트를 종료합니다.");break;
			}
		}
	}
	
	
}

public class Day043_review2 {
	public static void main(String[] args) {
		TimeFunc2 time = new TimeFunc2();
		Thread    thd  = new Thread(time);
		thd.start();
		int hold = (int)(Math.random()*5000);
		try {
			Thread.sleep(hold);
			if(JOptionPane.showInputDialog("stop시 o를 입력하세요").equals("o".trim().toLowerCase())) {
				thd.interrupt();}			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
