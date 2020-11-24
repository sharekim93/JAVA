package runnable;

import javax.swing.JOptionPane;

class Count implements Runnable{
	int cnt;
	
	Count(){super();this.cnt=10;}

	@Override
	public void run() {
		for(int i=cnt;i>0;i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("카운트가 종료되었습니다.");break;
			}
		}
	}
}

public class Thread025 {
	public static void main(String[] args) {
		boolean incorrect = true;
		Count cnt = new Count();
		Thread thd = new Thread(cnt);
		thd.start();
		
		while(incorrect) {
		String answer = JOptionPane.showInputDialog("빨강의 영단어를 입력하세요").trim().toLowerCase();
						System.out.println("빨강의 영단어를 입력하세요");
		if(answer.equals("red")) {
			System.out.println("정답입니다.");
			thd.interrupt();
			incorrect=false;
		}
		else {System.out.println("정답이 아닙니다.");}
		System.out.println(": isInterrupted():"+thd.isInterrupted());
		}
	}
}
