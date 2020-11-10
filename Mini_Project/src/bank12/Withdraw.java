package bank12;

import java.util.Scanner;

class Withdraw extends Userinfo implements Bank_Controller{
	public void exec(Bank_v6 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		int index = userIndex(bank,userinfo());
		System.out.println("=====출금 계좌정보 입력=====");
		try{
			if(index==-1) {throw new Exception("계좌 정보가 없습니다.");}
			else {
			System.out.print("출금액 : ");
			money=scanner.nextDouble();

			if (money<0) {throw new Exception("잘못 입력하셨습니다.");}
			else if (bank.getBalance()-money>=0) {bank.setBalance(bank.getBalance()-money);}
			else if (bank.getBalance()-money<0) {throw new Exception("금액이 모자랍니다");}

			}
		}
		catch(Exception e) {System.out.println(e.getMessage());}

	}
}