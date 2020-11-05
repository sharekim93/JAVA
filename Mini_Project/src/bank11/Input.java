package bank11;

import java.util.Scanner;

class Input extends Process_v4 {
	static void input(Bank_v4 bank) {
		String temp_id=null,temp_pass=null;
		double temp_bal=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*ID :");
		temp_id=scanner.nextLine();
		if(!validate_id(temp_id)) {return;}
		System.out.print("*PASS :");
		temp_pass = scanner.nextLine();
		if(!validate_pass(temp_pass)) {return;}
		
		System.out.print("*BALANCE :");
		temp_bal = scanner.nextDouble();
		if(!validate_bal(temp_bal)) {return;}
		
		bank.setId(temp_id);
		bank.setPass(temp_pass);
		bank.setBalance(temp_bal);
	}
	static boolean validate_id(String id) {
		boolean space=false;
		
		for (int j=0; j<id.length();j++) {
			if(id.charAt(j)=='\s') {space=true;break;}
		}
		if(space) {System.out.println("ID에 빈칸이 입력 되었습니다.");return false;}
		else return true;
	}
	
	static boolean validate_pass(String pass) {
		boolean space=false;
		String temp_pass =null;
		Scanner scanner = new Scanner(System.in);
		
		for (int j=0; j<pass.length();j++) {
			if(pass.charAt(j)=='\s') {space=true;break;}
		}
		if(space) {System.out.println("비밀번호에 빈칸이 입력되었습니다.");return false;}
		System.out.println("비밀번호를 한 번 더 입력하세요 > ");
		temp_pass = scanner.nextLine();
		if(pass.equals(temp_pass)) return true;
		else {System.out.println("비밀번호가 일치하지 않습니다.");return false;}
	}
	
	static boolean validate_bal(double bal) {
		if(bal>0) {return true;}
		else {System.out.println("입력 금액을 확인해주세요");return false;}
	}
	
}