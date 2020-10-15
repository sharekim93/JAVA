import java.util.Scanner;

public class Mini_Project4 {

	public static void main(String[] args) {
		
		//변수
		int num=0, dep=0 ,wid=0,age=0;
		String id="", pass="",temp_id=null,temp_pass=null,next=null,delete=null;
		double bal =-1;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
			for(;;)
			{
			System.out.println("======BANK======\r"
					+ "1.추가\r"
					+ "2.조회\r"
					+ "3.입금\r"
					+ "4.출금\r"
					+ "5.삭제\r"
					+ "9.종료\r"
					+ "입력>>> ");
			num = scanner.nextInt();
			if (num==1||num==2||num==3||num==4||num==5||num==9) {
			// 입력&처리&출력
			if (num == 1) 
			{ 
				System.out.print("* ID : ");
				id = scanner.next();
				System.out.print("* PASS : ");
				pass = scanner.next();
				System.out.print("* AGE : ");
				age = scanner.nextInt();
				System.out.print("* BALANCE : ");
				bal = scanner.nextInt();
			}
			else if (num == 2) 
			{ 
				System.out.print("* ID : ");
				temp_id = scanner.next();
				System.out.print("* PASS : ");
				temp_pass = scanner.next();
				if (temp_id.equals(id)&&temp_pass.equals(pass))
				{	System.out.println("======조회결과======\n\n아이디 : "
					+id+"\n나이 : "
					+age+"\n잔액 : "
					+bal+"\n암호 : "
					+pass+"\n조회가 성공했습니다.\n\n아무키나 누르세요\n");
					next=scanner.next();
				}
				else {System.out.println("조회가 실패했습니다.\n\n아무키나 누르세요.\n");
					next=scanner.next();
				}
			}
			else if (num == 3) 
			{  
				System.out.print("=====입금 계좌정보 입력=====\n* ID : ");
				temp_id = scanner.next();
				System.out.print("* PASS : ");
				temp_pass = scanner.next();
				if (temp_id.equals(id)&&temp_pass.equals(pass))
				{
					System.out.print("입금할 금액을 입력해주세요");
					dep = scanner.nextInt();
					if (dep>=0) {bal = bal+dep;}
					else System.out.println("잘못 입력하셨습니다.");
				}
				else System.out.println("계좌 정보가 없습니다.");
			}
			else if (num == 4) 
			{ 
				System.out.print("=====출금 계좌정보 입력=====\n* ID : ");
				temp_id = scanner.next();
				System.out.print("* PASS : ");
				temp_pass = scanner.next();
				if (temp_id.equals(id)&&temp_pass.equals(pass))
				{
				System.out.print("출금액 :");
				wid = scanner.nextInt();
					if (bal-wid>=0) {bal=bal-wid;}
					else if (bal-wid<0) System.out.println("금액이 모자랍니다.");
					else if (wid<0) System.out.println("잘못 입력하셨습니다.");
				}
				else System.out.println("계좌 정보가 없습니다.");
			}			
			else if (num == 5) 
			{ 
				System.out.print("* ID : ");
				temp_id = scanner.next();
				System.out.print("* PASS : ");
				temp_pass = scanner.next();
				if (temp_id.equals(id)&&temp_pass.equals(pass)){
					System.out.print("삭제하시겠습니까? (Y/N)");
					delete = scanner.next();
					if(delete.equalsIgnoreCase("Y")){id="";pass="";bal = 0;}
				}
				else System.out.println("계좌 정보가 없습니다.");
			}
			else if (num == 9) {break;}
			}
		}
	}
}
	

			
		


