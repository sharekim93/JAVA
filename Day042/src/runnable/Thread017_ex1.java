package runnable;

import javax.swing.JOptionPane;

class Cnt30 implements Runnable{
	int time;

	Cnt30(){
		super();
		this.time=30;
	}
	@Override
	public void run() {
		for(int i=time;i>0;i--) {
			System.out.println("TIME :"+i+"초");
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}	
}

class Money30  implements Runnable{
	Cnt30 timer;
	int money;
	
	public Money30(){
		super();
		this.money=300;
	}
	
	public Money30(Cnt30 cnt30) {
		super();
		timer = cnt30;
		this.timer.time=cnt30.time;
		this.money=300;
	}

	@Override
	public void run() {
		new Thread(timer).start();
		while(money>0) {
			System.out.println(money+"\t"+timer.time);
			money = money-100;
			try {
				Thread.sleep(10000);
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}	
	}
}

class Stop implements Runnable{
	Cnt30 timer;
	
	Stop(Cnt30 cnt30){
		super();
		timer = cnt30;
	}

	@Override
	public void run() {
		while(timer.time>0) {
			try {
				Thread.sleep(10000);
			}
			catch (InterruptedException e){e.printStackTrace();}
			if(JOptionPane.showConfirmDialog(null, "10초 연장할래?")!=-1) {timer.time=timer.time+10;}
		}
		}
	}

public class Thread017_ex1 {
	public static void main(String[] args) {
		Cnt30 timer = new Cnt30();
		Money30 money = new Money30(timer);
		new Thread(money).start();
		new Thread(new Stop(timer)).start();
		//
	}

}
