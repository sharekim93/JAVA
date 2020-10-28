import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class BANK7_Reviewed {
	
	public static String[][]users= new String[3][4];

	public static void main(String[] args) {
		int num=0;
		// 사용자가 추가된 시간 값을 담기 위해 3X4 배열로 변경해서 작성했습니다.
		
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
		
		// 메뉴 출력
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "입력>>> ");
		System.out.println();
		
		// 배열 출력
		System.out.println(Arrays.deepToString(users));
		// 이번 달 달력 출력
		printCalendar(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));
		
		num=scanner.nextInt();
		return num;
	}
	
	//method name : menu
	//return : int
	//parameter : String[][]users
	
	
	//////요구사항1. : 인증하는메서드하나만들어주세요 
	//////요구사항2. : public static void input(String users[][])  단계별로 끊어주세요!
	
	
	public static void input(String users[][]) {
		//변수
		int index=-1;
		boolean notOverLapped=true;
		String temp_id=null,temp_pass=null,temp_bal=null;
		Scanner scanner = new Scanner(System.in);
		
		// null값을 index에 대입. null이 아닌 경우 cnt++
		for(int i=0;i<users.length;i++) {
			if(users[i][0]==null) {index=i;break;}
			else {cnt++;}
		}
		////////////////////////////////////////////////
		
		System.out.print("*ID :");
		temp_id=scanner.nextLine();
		
		if(validate_id(temp_id)){
			for(int i=0;i<users.length;i++) {
				if(temp_id.equals(users[i][0])) {System.out.println("이미 존재하는 아이디입니다.");
				notOverLapped=false;
				break;}
			}
		}
		else return ;  /// method
		
 
		/*
			if(cnt<3) {
		
				
				// id 유효성 체크(공백포함여부, @와 . 포함여부, 아이디 중복 체크)
				
					if(notOverLapped) {
						System.out.print("*PASS :");
						temp_pass = scanner.nextLine();
						// password 유효성 체크(공백포함여부,비밀번호 확인)
						if(validate_pass(temp_pass)) {
							System.out.print("*BALANCE :");
							temp_bal = scanner.next();
							// balance 입력값 체크 (0원 초과 입력 여부)
							if(validate_bal(temp_bal)) {
								users[index][0] = temp_id;
								users[index][1] = temp_pass;
								users[index][2] = temp_bal;
								// 저장 시간 입력
								users[index][3] = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
							}
						}
					}
				}
			}
			else System.out.println("더 이상 신규가입이 불가합니다.");
		*/
	}
	
	//method name : input
	//return : void
	//parameter : String users[][]


	public static void show(String users[][]) {
		int index=-1;
		userinfo();
		if (index>0)	{
			System.out.println("======조회결과======\n\n아이디 : "
					+users[index][0]+"\n암호 : "
					+users[index][1]+"\n잔액 : "
					+users[index][2]+"\n추가시간 : "
					+users[index][3]+"\n조회가 성공했습니다.\n");
			
			// 사용자가 추가된 월의 달력 출력
			printCalendar(users[index][3]);
			
			System.out.println("\n아무키나 누르세요\n");
		}
		else {System.out.println("조회에 실패했습니다.");}
	}
	//method name : show
	//return : void
	//parameter : String users[][]
	
	public static void deposit (String users[][]) {
		int index=-1;  int money=0;
		Scanner scanner = new Scanner(System.in);
		userinfo();
		if(index>0) {
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
		int index=-1;  int money=0;
		Scanner scanner = new Scanner(System.in);
		userinfo();
		if(index>0) {
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
		int index=-1;  int money=0;
		Scanner scanner = new Scanner(System.in);
		userinfo();
		if(index>0) {
			String delete = null;
			System.out.print("삭제하시겠습니까? (Y/N)");
			delete = scanner.next();
			if(delete.equalsIgnoreCase("Y"))
			{users[index][0]=null;users[index][1]=null;users[index][2]=null;users[index][3]=null;}
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
	
	//method name : validate_pass
	//return : boolean
	//parameter : String pass
	
	public static boolean validate_bal(String bal) {
		if(Integer.parseInt(bal)>0) {return true;}
		else {System.out.println("입력 금액을 확인해주세요");return false;}
	}
	
	//method name : validate_bal
	//return : boolean
	//parameter : String bal
	
	public static void printCalendar(String pre_time) {
		int sum=0;
		int months[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String time[] =pre_time.split(" ");
		String date[]=time[0].split("-");
		
		// 작년까지의 일수 더하기
		for(int i=1; i<Integer.parseInt(date[0]);i++){
			if(leap(i)) {sum+=366;}
			else {sum+=365;}
		}
		
		// 금월까지의 일수 더하기
		for (int i=0; i<Integer.parseInt(date[1])-1;i++)
		{sum+=months[i];}
		if(leap(Integer.parseInt(date[0]))) {sum++;}
		
		
		System.out.println("====================== "+date[1]+"월 ======================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		if(sum%7!=0) {
			for (int j=0;j<7;j++) {
				if(j<=sum%7) {System.out.print("*\t");}
				else System.out.print(j-sum%7+"\t");
				}
			System.out.println();
		}
			int count=0;
			for (int j=7-sum%7;j<=months[Integer.parseInt(date[1])];j++) {
				System.out.print(j+"\t");count++;
				if (count%7==0) {System.out.println();}
			}
			System.out.println();
	}
	
	//method name : printCalendar
	//return : void
	//parameter : String pre_time
	
	public static boolean leap(int n) {
		if (n%4==0&&n%100!=0||n%400==0) return true;
		else return false;
	}
	
	//method name : leap
	//return : boolean
	//parameter : int n
	
	public static int userinfo() {
		String temp_id = null, temp_pass=null;
		int index=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*ID :");
		temp_id = scanner.next();
		System.out.println("*PASS :");
		temp_pass = scanner.next();
		
		for (int i = 0; i < users.length; i++) {
			if(users[i][0]!=null&&temp_id.equals(users[i][0]) && users[i][1]!=null&&temp_pass.equals(users[i][1]))
			{index=i;break;}break;
		}
		return index;
	}
}