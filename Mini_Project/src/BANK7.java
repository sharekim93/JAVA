import java.util.Scanner;

public class BANK7 {

	public static void main(String[] args) {
		int num=0;
		//변수
		String[][]users= new String[3][3];
		
		do {
			num=menu();
			switch(num) {
			case 1 : input(users);break;
			case 2 : show(users);break;
			case 3 : deposit(users);break;
			case 4 : withdraw(users);break;
			case 5 : delete(users);break;
			}
		}
		while(num!=9);
	}

	public static int menu() {
		int num=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "입력>>> ");
		num=scanner.nextInt();
		return num;
	}
	//method name : menu
	//return : int
	//parameter : int num
	
	public static void input(String users[][]) {
		int index=0,cnt=0;
		boolean input_id=true;
		String id_check=null;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<users.length;i++) {
			if(users[i][0]==null) {index=i;}
			else {cnt++;}
		}
			if(cnt<3) {
				System.out.print("*ID :");
				id_check=scanner.next();
				for(int i=0;i<users.length;i++) {
					if(id_check.equals(users[i][0])) {System.out.println("이미 존재하는 아이디입니다.");input_id=false;break;}
				}
				if(input_id) {
				users[index][0]=id_check;
				System.out.print("*PASS :");
				users[index][1] = scanner.next();
				System.out.print("*BALANCE :");
				users[index][2] = scanner.next();
				System.out.println();
				}
			}
			else System.out.println("더 이상 신규가입이 불가합니다.");

	}
	//method name : input
	//return : void
	//parameter : String users[][]


	public static void show(String users[][]) {
		int index=0;
		String temp_id = null, temp_pass=null;
		boolean match =false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*ID :");
		temp_id = scanner.next();
		System.out.println("*PASS :");
		temp_pass = scanner.next();
		
		for (int i = 0; i < users.length; i++) {
			if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
			{match=true;index=i;}
		}
		if (match)	{
			System.out.println("======조회결과======\n\n아이디 : "
					+users[index][0]+"\n암호 : "
					+users[index][1]+"\n잔액 : "
					+users[index][2]+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
			scanner.nextLine();
		}
		else {System.out.println("조회에 실패했습니다.");}
	}
	//method name : show
	//return : void
	//parameter : String users[][]
	
	public static void deposit (String users[][]) {
		int index=0,money=0;
		String temp_id = null, temp_pass=null;
		boolean match =false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*ID :");
		temp_id = scanner.next();
		System.out.println("*PASS :");
		temp_pass = scanner.next();
		
		
		for (int i = 0; i < users.length; i++) {
			if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
			{match=true;index=i;}
		}
		
		if(match) {
		System.out.print("입금할 금액을 입력해주세요");
		money = scanner.nextInt();
		if (money>=0) {users[index][2] =""+(Integer.parseInt(users[index][2])+money);}
		else System.out.println("잘못 입력하셨습니다.");
		}
		else {System.out.println("조회에 실패했습니다.");}
	}
	//method name : deposit
	//return : void
	//parameter : String users[][]
	
	public static void withdraw(String users[][]) {
		int index=0,money=0;
		String temp_id = null, temp_pass=null;
		boolean match =false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*ID :");
		temp_id = scanner.next();
		System.out.println("*PASS :");
		temp_pass = scanner.next();
		
		for (int i = 0; i < users.length; i++) {
			if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
			{match=true;index=i;}
		}
		
		if(match) {
		System.out.print("출금액 :");
		money = scanner.nextInt();
		if (Integer.parseInt(users[index][2])-money>=0) {users[index][2]=""+(Integer.parseInt(users[index][2])-money);}
		else if (Integer.parseInt(users[index][2])-money<0) {System.out.println("금액이 모자랍니다.");}
		else if (money<0) {System.out.println("잘못 입력하셨습니다.");}
		}
		else {System.out.println("조회에 실패했습니다.");}
	}
	//method name : withdraw
	//return : void
	//parameter : String users[][]
	
	public static void delete(String users[][]) {
		int index=0;
		String temp_id = null, temp_pass=null;
		boolean match =false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*ID :");
		temp_id = scanner.next();
		System.out.println("*PASS :");
		temp_pass = scanner.next();
		
		for (int i = 0; i < users.length; i++) {
			if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
			{match=true;index=i;}
		}
		if(match) {
			String delete = null;
			System.out.print("삭제하시겠습니까? (Y/N)");
			delete = scanner.next();
			if(delete.equalsIgnoreCase("Y")){users[index][0]=null;users[index][1]=null;users[index][2]=null;}
		}
		else {System.out.println("조회에 실패했습니다.");}
	}
	//method name : delete
	//return : void
	//parameter : String users[][]
}