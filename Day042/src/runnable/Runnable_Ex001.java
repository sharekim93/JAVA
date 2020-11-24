package runnable;

class Runnable1 implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.print('★');
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {e.printStackTrace();}
		}
	}
	
}

public class Runnable_Ex001 {
	public static void main(String[] args) {
		Runnable1 rn1 = new Runnable1();
		Thread	th	  = new Thread(rn1);
		th.start();
	}

}
