package bank11;

import java.util.Scanner;

class Show extends Process_v4 {
	
	static void show(Bank_v4 bank) {
		if(!userinfo(bank)) {System.out.println("조회에 실패했습니다.");return;}
		System.out.println("======조회결과======\n\n아이디 : "
				+bank.getId()+"\n암호 : "
				+bank.getPass()+"\n잔액 : "
				+bank.getBalance()
				+"\n조회가 성공했습니다.\n");
	}
	static boolean userinfo(Bank_v4 bank) {
		String temp_id = null, temp_pass=null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*ID :");
		temp_id = scanner.nextLine();
		System.out.print("*PASS :");
		temp_pass = scanner.nextLine();
		
		if(temp_id.equals(bank.getId()) && temp_pass.equals(bank.getPass())){return true;}
		else return false;
	}
}
