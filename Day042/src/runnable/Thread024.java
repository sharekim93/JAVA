package runnable;

import javax.swing.JOptionPane;

class HelloCnt10 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("RUN : is interrupted? "+Thread.interrupted());
			System.out.println("Hello"+i);	
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("##### InterruptException이 발생함");
				System.out.println("CATCH : is interrupted? "+Thread.interrupted());
				break;
			}
		}
	}
}

public class Thread024 {
	public static void main(String[] args) {
		HelloCnt10 hello	=	new HelloCnt10();
		Thread		thread	=	new Thread(hello); thread.start();
		if(JOptionPane.showInputDialog("stop?").equals("o".trim().toLowerCase())) {
			thread.interrupt();
			System.out.println("MAIN : is interrupted? "+thread.isInterrupted());
		}
		
	}

}
