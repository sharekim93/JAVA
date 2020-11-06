package bank11;

import java.util.Scanner;

class Withdraw extends Userinfo {
	static void withdraw(Bank_v4[] bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		int index = userIndex(bank,userinfo());
		System.out.println("=====출금 계좌정보 입력=====");
		if(index==-1) {System.out.println("계좌 정보가 없습니다.");return;}
		else {
			System.out.print("출금액 : ");
			
			money=scanner.nextDouble();
			if (bank[index].getBalance()-money>=0) {bank[index].setBalance(bank[index].getBalance()-money);}
			else if (bank[index].getBalance()-money<0) {System.out.println("금액이 모자랍니다.");}
			else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
		}
	}
}
