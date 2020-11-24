package runnable;

import javax.swing.JOptionPane;

class Cnt11 implements Runnable{

	@Override
	public void run() {
		for(int i=10;i>0;i--) {
		System.out.println("TIME COUNT : "+i);
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e) {e.printStackTrace();}
		}
	}
	}

class StopAnswer{
	Cnt11 timer;
	String answer;
	Thread thread;
	
	public StopAnswer(Thread timer) {
		this.thread = timer;
	}
	
	void question() {
		answer = JOptionPane.showInputDialog("STOP?\nAnswer : O/X ");
		if(answer.equals("o".trim().toLowerCase())){thread.stop();}
	}	
}


public class Thread022 {
	public static void main(String[] args) {
		Cnt11 cnt	=	new Cnt11();
		Thread timer	=	new Thread(cnt); timer.start();
		
		StopAnswer stop = new StopAnswer(timer);
		stop.question();
	}

}
