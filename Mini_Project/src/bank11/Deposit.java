package bank11;

import java.util.Scanner;

class Deposit extends Userinfo {
	static void deposit (Bank_v4 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====입금 계좌정보 입력=====");
		if(!userinfo(bank)) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("입금액 : ");
	
		money=scanner.nextDouble();
		if (money>=0) {bank.setBalance(bank.getBalance()+money);}
		else System.out.println("잘못 입력하셨습니다.");
	}
}
