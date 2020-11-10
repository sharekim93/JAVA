package bank12;

import java.util.Scanner;

class Deposit extends Userinfo implements Bank_Controller {
	public void exec (Bank_v6 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		int index = userIndex(bank,userinfo());
		System.out.println("=====입금 계좌정보 입력=====");
		if(index==-1) {System.out.println("계좌 정보가 없습니다.");return;}
		else {
		System.out.print("입금액 : ");
	
		money=scanner.nextDouble();
		if (money>=0) {bank.setBalance(bank.getBalance()+money);}
		else System.out.println("잘못 입력하셨습니다.");
		}
	}
}
