package thread;

import javax.swing.JOptionPane;

class Apple extends Thread {
	
	@Override
	public void run() {
		
		final int start=10;
		long sleeptime=0L;
		try{
			int time=start;
			while(time>0) {
				sleeptime = (long)(Math.random()*1000);
				super.sleep(sleeptime);
				System.out.println(time);
				time--;
			}
		}
		catch(Exception e) {e.getStackTrace();}
	}
}

public class Thread005 {

	public static void main(String[] args) {
		try {
		Apple apple = new Apple(); apple.start();
		while(true) {
		if(JOptionPane.showInputDialog("apple을 입력하세요").trim().toLowerCase().equals("apple")) {
			apple.stop();
			JOptionPane.showMessageDialog(null, "정답입니다");break;
		}
		else JOptionPane.showMessageDialog(null, "정답이 아닙니다");
		}
		}
		catch(Exception e){JOptionPane.showMessageDialog(null, e.getMessage());}
	}

}
