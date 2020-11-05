package bank11;

import java.util.Scanner;

class Process_v4 {	
	Process_v4(){super();}
	void menu(Bank_v4[] bank) {
		int index = searchIndex(bank);
		Scanner scanner = new Scanner(System.in);
		if(index==-1) {return ;}
		while(true){
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "\n입력>>> ");

		int num = scanner.nextInt();
			switch(num) {
			case 1:Input.input(bank[index]);;break;
			case 2:Show.show(bank[index]);break;
			case 3:Deposit.deposit(bank[index]);;break;
			case 4:Withdraw.withdraw(bank[index]);break;
			case 5:Delete.delete(bank[index]);break;
			case 9:System.out.println("종료합니다.");return;
			}
		}
	}
	
	int searchIndex(Bank_v4[] bank) {
		int result=-1;
		for(int i=0;i<bank.length;i++) {
			if(bank[i].getId()==null) {result=i;}
		}
		return result;
	}
}