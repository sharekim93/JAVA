package bank11_instance;

import java.util.Arrays;
import java.util.Scanner;

class Process_v4 {	
	Process_v4(){super();}
	void menu(Bank_v4[] bank) {
		Scanner scanner = new Scanner(System.in);
		Input input = new Input();
		Show show = new Show();
		Deposit deposit = new Deposit();
		Withdraw withdraw = new Withdraw();
		Delete delete = new Delete();
		
		while(true){
		int index = searchIndex(bank);
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "\n입력>>> ");
		System.out.println(Arrays.toString(bank));
		int num = scanner.nextInt();
			switch(num) {
			case 1:
				if(index==-1) {System.out.println("더 이상 계좌를 추가할 수 없습니다.");break;}
				else {input.input(bank[index]);};break;
			case 2:show.show(bank);break;
			case 3:deposit.deposit(bank);;break;
			case 4:withdraw.withdraw(bank);break;
			case 5:delete.delete(bank);break;
			case 9:System.out.println("종료합니다.");return;
			}
		}
	}
	
	int searchIndex(Bank_v4[] bank) {
		int result=-1;
		for(int i=0;i<bank.length;i++) {
			if(bank[i].getId()==null) {result=i;break;}
		}
		return result;
	}
}