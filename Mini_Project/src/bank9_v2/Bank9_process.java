package bank9_v2;

import java.util.Scanner;

class Bank9_process {
	Bank9_process(){super();}
	void menu(Bank_v2 bank) {
		Scanner scanner = new Scanner(System.in);
		while(true){
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r");
		
		System.out.println(bank.company +" 계정정보");
		System.out.println("ID : "+bank.getId()+"/ PASS : "+bank.getPass()+"/ BAL : "+bank.getBalance());
	
		System.out.println("\n입력>>> ");
		int num = scanner.nextInt();
		
		
			switch(num) {
			case 1:this.input(bank);break;
			case 2:this.show(bank);break;
			case 3:this.deposit(bank);;break;
			case 4:this.withdraw(bank);break;
			case 5:this.delete(bank);break;
			case 9:System.out.println("종료합니다.");return;
			}
		}
		
	}
	
	void input(Bank_v2 bank) {
		//변수
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
	
	void show(Bank_v2 bank) {
		if(!userinfo(bank)) {System.out.println("조회에 실패했습니다.");return;}
		System.out.println("======조회결과======\n\n아이디 : "
				+bank.getId()+"\n암호 : "
				+bank.getPass()+"\n잔액 : "
				+bank.getBalance()
				+"\n조회가 성공했습니다.\n");
	}
	
	void deposit (Bank_v2 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====입금 계좌정보 입력=====");
		if(!userinfo(bank)) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("입금액 : ");
	
		money=scanner.nextDouble();
		if (money>=0) {bank.setBalance(bank.getBalance()+money);}
		else System.out.println("잘못 입력하셨습니다.");
	}
	
	void withdraw(Bank_v2 bank) {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====출금 계좌정보 입력=====");
		if(!userinfo(bank)) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("출금액 : ");
		
		money=scanner.nextDouble();
		if (bank.getBalance()-money>=0) {bank.setBalance(bank.getBalance()-money);}
		else if (bank.getBalance()-money<0) {System.out.println("금액이 모자랍니다.");}
		else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
	}
	
	void delete(Bank_v2 bank) {
		Scanner scanner = new Scanner(System.in);
		if(!userinfo(bank)) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("삭제하시겠습니까? (Y/N)");
		if(scanner.next().equalsIgnoreCase("Y"))
		{bank.setId(null);bank.setPass(null);bank.setBalance(0);}
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
	
	boolean userinfo(Bank_v2 bank) {
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
