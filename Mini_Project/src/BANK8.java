
import java.util.Scanner;

class Bank_v1{
	String id;
	String pass;
	double balance;
	static String Company = "(주)면나눔"; 
	
	int menu() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r");
		
		System.out.println(Company +" 계정정보");
		System.out.println("ID : "+id+"/ PASS : "+pass+"/ BAL : "+balance);

		System.out.println("\n입력>>> ");
		return scanner.nextInt();

	}
	
	void input() {
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
		
		this.id = temp_id;
		this.pass = temp_pass;
		this.balance = temp_bal;

		}
	
	void show() {
		if(!userinfo()) {System.out.println("조회에 실패했습니다.");return;}
		System.out.println("======조회결과======\n\n아이디 : "
				+this.id+"\n암호 : "
				+this.pass+"\n잔액 : "
				+this.balance
				+"\n조회가 성공했습니다.\n");
	}
	
	void deposit () {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====입금 계좌정보 입력=====");
		if(!userinfo()) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("입금액 : ");
	
		money=scanner.nextDouble();
		if (scanner.nextInt()>=0) {this.balance =this.balance+money;}
		else System.out.println("잘못 입력하셨습니다.");
	}
	
	void withdraw() {
		double money=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("=====출금 계좌정보 입력=====");
		if(!userinfo()) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("출금액 : ");
		
		money=scanner.nextDouble();
		if (this.balance-money>=0) {this.balance=this.balance-money;}
		else if (this.balance-money<0) {System.out.println("금액이 모자랍니다.");}
		else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
	}
	
	void delete() {
		Scanner scanner = new Scanner(System.in);
		if(!userinfo()) {System.out.println("계좌 정보가 없습니다.");return;}
		System.out.print("삭제하시겠습니까? (Y/N)");
		if(scanner.next().equalsIgnoreCase("Y"))
		{this.id=null;this.pass=null;this.balance=0;}
		}
		
	boolean validate_id(String id) {
		boolean space=false;
		
		for (int j=0; j<id.length();j++) {
			if(id.charAt(j)=='\s') {space=true;}
		}
		if(space) {System.out.println("ID에 빈칸이 입력 되었습니다.");return false;}
		else return true;
	}
	
	boolean validate_pass(String pass) {
		boolean space=false;
		String temp_pass =null;
		Scanner scanner = new Scanner(System.in);
		
		for (int j=0; j<pass.length();j++) {
			if(pass.charAt(j)=='\s') {space=true;}
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
	
	boolean userinfo() {
		String temp_id = null, temp_pass=null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("*ID :");
		temp_id = scanner.nextLine();
		System.out.print("*PASS :");
		temp_pass = scanner.nextLine();
		
		if(temp_id.equals(this.id) && temp_pass.equals(this.pass)){return true;}
		else return false;
	}
	
	Bank_v1(){}
}

public class BANK8 {

	public static void main(String[] args) {
		Bank_v1  user1 = new Bank_v1();
		int num=0;
		do {
			num=user1.menu();
		    switch (num) {
			case 1: user1.input(); break;
			case 2: user1.show(); break;
			case 3: user1.deposit(); break;
			case 4: user1.withdraw(); break;
			case 5: user1.delete(); break;
		       }
		} while (num != 9);
	}

}
