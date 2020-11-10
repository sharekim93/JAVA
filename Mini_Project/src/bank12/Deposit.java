package bank12;

import java.util.Scanner;

class Deposit extends Userinfo implements Bank_Controller {
	public void exec (Bank_v6 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		int index = userIndex(bank,userinfo());
		System.out.println("=====입금 계좌정보 입력=====");
		try{
			if(index==-1) {throw new Exception("계좌 정보가 없습니다.");}
			else {
			System.out.print("입금액 : ");
			money=scanner.nextDouble();
			if (money>=0) {bank.setBalance(bank.getBalance()+money);}
			else throw new Exception("금액을 잘못 입력하셨습니다.");
			}
		}catch (Exception e) {System.out.println(e.getMessage());}
	}
}
