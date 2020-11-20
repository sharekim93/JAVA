package thread;

/* thread를 이용하여 두 가지 일을 처리하기
	1. Class Hello : Hello 10번 출력
	2. Class cnt10 : 1~10까지 출력
*/

class Hello extends Thread{

	@Override
	public void run() {
		int cnt=0;
		long sleeptime;
		while(cnt<10) {
		System.out.println("Hello");
		sleeptime = (long)(Math.random()*1000);
		try {
		super.sleep(sleeptime);
		}
		catch(Exception e) {}
		cnt++;
		}
	
	}
}
class Cnt10 extends Thread{

	@Override
	public void run() {
		int cnt=0;
		long sleeptime;
		while(cnt<10) {
		System.out.println(++cnt);
		sleeptime = (long)(Math.random()*1000);
		try {
		super.sleep(sleeptime);
		}
		catch(Exception e) {}
		}
	}
	
}

public class Thread003 {
	public static void main(String[] args) {
		Hello todo1 = new Hello(); todo1.start();
		Cnt10 todo2 = new Cnt10(); todo2.start();
	}

}
