package bank12;

import java.util.Scanner;

class Userinfo extends Menu6 implements Bank_Controller{
	public String[] userinfo() {
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
	
	 int userIndex(Bank_v6 bank,String[] temp) {
		int index=-1;
		if((temp[0].equals(bank.getId())) && (temp[1].equals(bank.getPass()))){index=1;}
		return index;
	}
		
	 boolean validate_id(String id) {
		boolean space=false;
		try {
			for (int j=0; j<id.length();j++) {if(id.charAt(j)=='\s') {space=true;
			new Exception("ID에 빈칸이 입력 되었습니다.");break;}}
		}
		catch (Exception e) {e.toString();}
		finally {return space;}
}
	
	 boolean validate_pass(String pass) {
		String temp_pass =null;
		Scanner scanner = new Scanner(System.in);
		boolean result=false;
		
		try {
		for (int j=0; j<pass.length();j++) {
			if(pass.charAt(j)=='\s') {new Exception("비밀번호에 빈칸이 입력되었습니다.");break;}
		}
		System.out.println("비밀번호를 한 번 더 입력하세요 > ");
		temp_pass = scanner.nextLine();
		try {
		if(pass.equals(temp_pass)) result=true;
		else {new Exception("비밀번호가 일치하지 않습니다.");}
		}
		catch(Exception ee) {ee.toString();}
		}
		catch (Exception e) {e.toString();}
		finally {return result;}
		

	}
	
	 boolean validate_bal(double bal) {
		boolean result=false;
		try {
		if(bal>0) {result=true;}
		else {new Exception("입력 금액을 확인해주세요");}
		}
		catch(Exception e) {e.toString();}
		finally {return result;}
	}
}
