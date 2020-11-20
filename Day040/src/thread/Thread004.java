package thread;

/*
	todo1. class Gugudan => 2~9단까지 출력
	todo2. class Sum100  => 1~100까지의 합 중간에 합쳐지는 숫자 출력
 */

class Gugudan extends Thread{

	@Override
	public void run() {

		try {
			for(int i=1;i<10;i++) {
				for(int j=1;j<10;j++) {
					long sleeptime = (long)(Math.random()*1000);
					super.sleep(sleeptime);
					int conducted = i*j;
					System.out.println(i+"*"+j+"="+conducted);
				}
				
			}
		}
		catch(Exception e) {}

	}
	
}

class Sum100 extends Thread{

	@Override
	public void run() {

		int sum=0;
		
		try {
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=10;j++) {
					sum+=j;		
					long sleeptime = (long)(Math.random()*1000);
					super.sleep(sleeptime);
				}
				System.out.println("Sum :" +sum);
			}

		}
		catch(Exception e) {}


	}
	
}

public class Thread004 {
	public static void main(String[] args) {
		Gugudan todo1	=	new Gugudan(); todo1.start();
		Sum100	todo2	=	new Sum100(); todo2.start();

	}

}
