import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BANK7_addOption {

	public static void main(String[] args) {
		int num=0;
		//변수
		String[][]users= new String[3][4];
		
		do {
			num=menu(users);
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

	public static int menu(String[][]users) {
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
		boolean overlap=true;
		String temp_id=null,temp_pass=null,temp_bal=null;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<users.length;i++) {
			if(users[i][0]==null) {index=i;}
			else {cnt++;}
		}
			if(cnt<3) {
				System.out.print("*ID :");
				temp_id=scanner.nextLine();
				if(validate_id(temp_id)){
					for(int i=0;i<users.length;i++) {
						if(temp_id.equals(users[i][0])) {System.out.println("이미 존재하는 아이디입니다.");overlap=false;break;}
					}
					if(overlap) {
						System.out.print("*PASS :");
						temp_pass = scanner.nextLine();
						if(validate_pass(temp_pass)) {
							System.out.print("*BALANCE :");
							temp_bal = scanner.next();
							if(validate_bal(temp_bal)) {
								users[index][0] = temp_id;
								users[index][1] = temp_pass;
								users[index][2] = temp_bal;
								users[index][3] = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
							}
						}
					}
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
					+users[index][2]+"\n추가시간 : "
					+users[index][3]+"\n조회가 성공했습니다.\n");
			printCalendar(users[index][3]);
			System.out.println("\n아무키나 누르세요\n");
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

	public static boolean validate_id(String id) {
		boolean space=false;
		boolean dot =false;
		boolean at=false;
		
			for (int j=0; j<id.length();j++) {
				if(id.charAt(j)==32) {space=true;}
				if(id.charAt(j)=='@') {at=true;}
				if(id.charAt(j)=='.') {dot=true;}
			}
		if (space) {System.out.println("ID에 빈칸이 입력 되었습니다.");}
		if (!dot) {System.out.println("ID에 .를 입력해주세요");}
		if (!at) {System.out.println("ID에 @를 입력해주세요.");}
		
		if(space||!dot||!at) return false;
		else return true;
	}
	//method name : validate_id
	//return : boolean
	//parameter : String id
	
	public static boolean validate_pass(String pass) {
		boolean space=false;
		String temp_pass =null;
		Scanner scanner = new Scanner(System.in);
		
		for (int j=0; j<pass.length();j++) {
			if(pass.charAt(j)==' ') {space=true;}
		}
		System.out.println("비밀번호를 한 번 더 입력하세요 > ");
		temp_pass = scanner.next();
		if(pass.equals(temp_pass)) return true;
		else {System.out.println("비밀번호가 일치하지 않습니다.");return false;}
	}
	
	public static boolean validate_bal(String bal) {
		if(Integer.parseInt(bal)>0) {return true;}
		else {System.out.println("입력 금액을 확인해주세요");return false;}
	}
	
	public static void printArr(String arr[][]) {
		System.out.println("====print array====");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void printCalendar(String pre_time) {
		int sum=0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String time[] =pre_time.split(" ");
		String month[]=time[0].split("-");
		
		// 작년까지의 일수 더하기
		for(int i=1; i<Integer.parseInt(month[0]);i++){
			if(leap(i)) {sum+=366;}
			else {sum+=365;}
		}
		
		// 금월까지의 일수 더하기
		
		if(leap(Integer.parseInt(month[0]))) {months[1]=29;}
		for (int i=0; i<Integer.parseInt(month[1])-1;i++)
		{sum+=months[i];}
		
		// 금일까지의 일수 더하기
		sum+=Integer.parseInt(month[2]);
		System.out.println("총 일수 : "+sum);
		
		System.out.println("================== "+month[1]+"월 ==================");
		if((sum+1)%7!=0) {
			for (int j=0;j<7;j++) {
				if(j<=(sum+1)%7) {System.out.print("*\t");}
				else System.out.print(j-(sum+1)%7+"\t");
				}
			System.out.println();
		}
			int count=0;
			for (int j=7-(sum+1)%7;j<=Integer.parseInt(month[2]);j++) {
				System.out.print(j+"\t");count++;
				if (count%7==0) {System.out.println();}
			}
			System.out.println();
				
		
	}
	
	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
}