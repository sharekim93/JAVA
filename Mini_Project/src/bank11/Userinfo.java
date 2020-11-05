package bank11;

import java.util.Scanner;

class Userinfo extends Process_v4 {
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
