package bank12;

import java.util.Arrays;
import java.util.Scanner;

class Menu6 implements Bank_Controller{	
	public void exec(Bank_v6 bank) {
		Scanner scanner = new Scanner(System.in);
		
		Bank_Controller[] con = new Bank_Controller[] {
				new Input(),
				new Show(),
				new Deposit(),
				new Withdraw(),
				new Delete()};

		while(true){
		int index = checkNull(bank);
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "\n입력>>> ");
		System.out.println(bank.toString());
		int num = scanner.nextInt();
			switch(num) {
			case 1:
				if(index==-1) {System.out.println("더 이상 계좌를 추가할 수 없습니다.");break;}
				else {con[0].exec(bank);break;}
			case 2:con[1].exec(bank);break;
			case 3:con[2].exec(bank);;break;
			case 4:con[3].exec(bank);break;
			case 5:con[4].exec(bank);break;
			case 9:System.out.println("종료합니다.");return;
			}
		}
	}
	
	int checkNull(Bank_v6 bank) {
		int result=1;
		if(bank.getId()!=null) {result=-1;}
		return result;
	}
}