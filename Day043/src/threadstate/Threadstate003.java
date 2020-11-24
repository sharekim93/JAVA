package threadstate;

class StateTest003 implements Runnable{
	private String todo;
	Thread thread;
	boolean suspend,stop;
	
	public StateTest003() {super();}

	public StateTest003(String todo) {
		super();
		this.todo = todo;
		thread = new Thread(this);
	}

	@Override
	public void run() {
		while(!stop) {
			if(!suspend) {
				System.out.println(Thread.currentThread().getName()+"\t"+this.todo);
				try {Thread.sleep(1000);} 
				catch (InterruptedException e) {System.out.println(">> InterruptedException 발생!!!");}
			}
			else {Thread.yield();}
		}
	}
	

	public void start() {thread.start();}
	public void suspend() {
		suspend = true;
		thread.interrupt();
		System.out.println(thread.getName()+"suspend()에 의해 프로그램을 일시정지합니다.");}
	public void resume() {
		suspend = false;
		System.out.println(thread.getName()+"resume()에 의해 프로그램을 다시 시작합니다.");}
	public void stop() {
		stop = true; 
		thread.interrupt();
		System.out.println(thread.getName()+"stop()에 의해 프로그램을 종료합니다.");}
}

public class Threadstate003 {
	public static void main(String[] args) {
		StateTest003 todo1 = new StateTest003("1.청소");todo1.start();
		StateTest003 todo2 = new StateTest003("\t2.빨래");todo2.start();
		StateTest003 todo3 = new StateTest003("\t\t3.산책");todo3.start();
		
		try {
			//1. 3초동안 쉬기
			Thread.sleep(3000);
			//2. todo2 일시정지, todo1 일시정지
			todo2.suspend(); todo1.suspend();
			//3. todo3 강제종료 후 todo1 다시 동작
			Thread.sleep(3000);
			todo3.stop();todo1.resume();todo2.resume();
			//4. todo1,todo2, todo3 강제종료
			Thread.sleep(3000);
			todo1.stop();todo2.stop();
		}
		catch (InterruptedException e) {e.printStackTrace();}
	}

}
