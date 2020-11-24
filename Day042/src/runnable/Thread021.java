package runnable;

import javax.swing.JOptionPane;

class Cnt10 implements Runnable{
	int cnt;

	Cnt10(){
		super();
		cnt=10;
	}

	@Override
	public void run() {
		while(cnt>0) {
			System.out.println(cnt--);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class Thread021 {
	public static void main(String[] args) {
		Cnt10 cnt = new Cnt10();
		Thread thd = new Thread(cnt);
		thd.start();
		
		if(JOptionPane.showInputDialog("stop시 o를 입력하세요").equals("o".trim().toLowerCase())) {
				thd.stop();
		}
		
	}

}
