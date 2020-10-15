import java.util.Scanner;

public class Mini_Project2 {

	public static void main(String[] args) {
		
		//변수
		int a=0, id=0, pass=0, dep=0, wid=0;
		double bal = 10000;
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
			a = scanner.nextInt();
			if (a==1||a==2||a==3||a==4||a==5||a==9) {
			// 입력&처리&출력
			if (a == 1) { 
				System.out.println("□ 추가기능입니다");
				System.out.println("□ 아이디 : ");
				id = scanner.nextInt();
				if (id==1) {System.out.println("□ 비밀번호 : ");
							pass = scanner.nextInt();
							if (pass==1) {
							System.out.println("□ 잔액 : " + bal +"\n설정 되어 있습니다.");
							}
							else System.out.println("다시 확인해주세요.");}
				else System.out.println("다시 확인해주세요.");}
			if (a == 2) { 
				System.out.println("□ 조회기능입니다");
				System.out.println("□ 본인확인ID : ");
				id = scanner.nextInt();
				if (id==1) {System.out.println("본인확인pass : ");
							pass = scanner.nextInt();
							if (pass==1) {
							System.out.println("==반갑습니다 고객님\nID : "
												+id+"\npass : "
												+pass+"\nbalance : "
												+bal);
							}
							else System.out.println("다시 확인해주세요.");}
				else System.out.println("다시 확인해주세요.");}
			if (a == 3) {  
				System.out.println("□ 입금기능입니다");
				System.out.println("□ 본인확인ID : ");
				id = scanner.nextInt();
				if (id==1) {System.out.println("본인확인pass : ");
							pass = scanner.nextInt();
							if (pass==1) {
							System.out.println("입금할 금액을 입력해주세요");
							dep = scanner.nextInt();
							if (dep>=0) {
										bal = bal+dep;
										System.out.println("==잔액확인\nID : "
												+ id + "\npass : "
												+ pass + "\nbalance : "
												+ (bal));
										}
							else System.out.println("금액이 모자랍니다.\n종료합니다");
							}
							else System.out.println("다시 확인해주세요.");}
				else System.out.println("다시 확인해주세요.");}
			if (a == 4) { 
				System.out.println("□ 출금기능입니다");
				System.out.println("□ 본인확인ID : ");
				id = scanner.nextInt();
				if (id==1) {System.out.println("본인확인pass : ");
							pass = scanner.nextInt();
							if (pass==1) {
							System.out.println("출금할 금액을 입력해주세요");
							wid = scanner.nextInt();
							if (bal-wid>=0) {
											bal=bal-wid;
										System.out.println("==잔액확인\nID : "
												+ id + "\npass : "
												+ pass + "\nbalance : "
												+ (bal));
										}
							else System.out.println("금액이 모자랍니다.\n종료합니다");
							}
							else System.out.println("다시 확인해주세요.");}
				else System.out.println("다시 확인해주세요.");}			
			if (a == 5) { 
				System.out.println("□ 삭제기능입니다");
				id=0;pass=0;bal = 0;
				System.out.println("==잔액확인\nID : "
									+ id + "\npass : "
									+ pass + "\nbalance : "
									+ bal);}
			if (a == 9) {  System.out.println("□ 종료기능입니다");break;}
			}
		}
	}
}
	

			
		


