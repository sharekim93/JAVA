package bank11_instance;

import java.util.Scanner;

class Userinfo extends Process_v4 {
	String[] userinfo() {
		String temp[]=new String[2];
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*ID :");
		temp[0] = scanner.nextLine();
		System.out.print("*PASS :");
		temp[1] = scanner.nextLine();
		return temp;
	}
	double inputBal() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("*BALANCE :");
		return scanner.nextDouble();
	}
	
	int userIndex(Bank_v4[] bank,String[] temp) {
		int index=-1;
		for(int i=0;i<bank.length;i++) {
			if((temp[0].equals(bank[i].getId())) && (temp[1].equals(bank[i].getPass()))){index=i;break;}
		}
		return index;
	}
		
	boolean validate_id(String id) {
		boolean space=false;
		
		for (int j=0; j<id.length();j++) {
			if(id.charAt(j)=='\s') {space=true;break;}
		}
		if(space) {System.out.println("ID에 빈칸이 입력 되었습니다.");return false;}
		else return true;
	}
	
	boolean validate_pass(String pass) {
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
	
	boolean validate_bal(double bal) {
		if(bal>0) {return true;}
		else {System.out.println("입력 금액을 확인해주세요");return false;}
	}
}
