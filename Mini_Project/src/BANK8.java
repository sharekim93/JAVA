import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

class Bank_v1{
	String id;
	String pass;
	double balance;
	static String Company = "(주) 본인이름회사"; 
	
	int menu() {
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
		System.out.println("ID : "+id+"/ PASS : "+pass+"/ BAL : "+balance);

		num=scanner.nextInt();
		return num;
	}
	
	void input() {
		//변수
		String temp_id=null,temp_pass=null,temp_bal=null;
		Scanner scanner = new Scanner(System.in);
		
		if (index!=-1) {
		System.out.print("*ID :");
		temp_id=scanner.nextLine();
		
		if(validate_id(temp_id)){
			for(int i=0;i<users.length;i++) {
				if(temp_id.equals(users[i][0])) {System.out.println("이미 존재하는 아이디입니다.");
				notOverLapped=false;
				break;}
			}// id 유효성 체크(공백포함여부, @와 . 포함여부)
		}
		else return ;
		if(!notOverLapped) {return;} // id 중복체크
				
		System.out.print("*PASS :");
		temp_pass = scanner.nextLine();
		if(!validate_pass(temp_pass)) {return;} // password 유효성 체크(공백포함여부,비밀번호 확인)
		
		System.out.print("*BALANCE :");
		temp_bal = scanner.next();
		if(!validate_bal(temp_bal)) {return;} // balance 입력값 체크 (0원 초과 입력 여부)
		
			users[index][0] = temp_id;
			users[index][1] = temp_pass;
			users[index][2] = temp_bal;
			// 저장 시간 입력
			users[index][3] = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
		}
		else System.out.println("더 이상 신규가입이 불가합니다.");return;
	}
	
}

public class BANK8 {

	public static void main(String[] args) {
		Bank_v1  user1 = new Bank_v1();
		do {
		    switch (user1.menu()) {
			case 1: user1.input(); break;
			case 2: user1.show(); break;
			case 3: user1.deposit(); break;
			case 4: user1.withdraw(); break;
			case 5: user1.delete(); break;
		       }
		} while (num != 9);
	}

}
