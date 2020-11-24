package runnable;

// 다음 코드의 실행결과로 옳은 것은?
// Answer : b. 01234567890123456789 순서대로 출력된다.

class Runnable2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.print(i);
			try{
				Thread.sleep((int)(Math.random()*1000));
				}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}

public class Runnable_Ex002 {
	public static void main(String[] args) {
		Runnable2 rn2 = new Runnable2();
		new Thread(rn2).start();
		for(int i=0;i<10;i++) {
			System.out.print(i);
		try{
			Thread.sleep((int)(Math.random()*1000));
			}
		catch (InterruptedException e) {e.printStackTrace();}
		}
	}

}
