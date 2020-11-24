package threadstate;

class StateTest extends Thread{
	@Override
	public void run() {
		while(true) {
			System.out.println("★");
			boolean thread_state = isInterrupted();
			System.out.println(thread_state);
			if(thread_state) {System.out.println(">>>2. run 중에 방해받았어");break;}
			try {Thread.sleep(1000);} 
			catch (InterruptedException e) {e.printStackTrace();}
			//Thread.sleep()은 스케줄러에 일정 시간만큼 지연 후 다시 등록 됨
		}
	}
	
}

public class Threadstate001 {
	public static void main(String[] args) {
		StateTest test = new StateTest(); test.start();
		
		try {Thread.sleep(1000);} 
		catch (InterruptedException e) {e.printStackTrace();}
		
		System.out.println(">>> 1. 방해중....");
		test.interrupt();
		System.out.println("main에서 방해?"+test.isInterrupted());
		System.out.println(">>>> 3. 방해중....");
	}

}
