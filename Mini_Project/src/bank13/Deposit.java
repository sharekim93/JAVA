package bank13;

import java.util.Scanner;

public class Deposit extends BankUsing implements Bank_Controller {
	Deposit(){super();}
	public void exec () {
		Scanner scanner = new Scanner(System.in);
		double money=0;
		
		int index = userIndex(userinfo());
		System.out.println("=====입금 계좌정보 입력=====");
		try{
			if(index==-1) {throw new Exception("계좌 정보가 없습니다.");}
			else {
			System.out.print("입금액 : ");
			money=scanner.nextDouble();
			if (money>=0) {model.get(index).setBalance(model.get(index).getBalance()+money);}
			else throw new Exception("금액을 잘못 입력하셨습니다.");
			}
		}catch (Exception e) {System.out.println(e.getMessage());}
	}
}
