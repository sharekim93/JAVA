import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		//변수
		int a;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("======BANK======\r"
				+ "1.추가\r"
				+ "2.조회\r"
				+ "3.입금\r"
				+ "4.출금\r"
				+ "5.삭제\r"
				+ "9.종료\r"
				+ "입력>>> ");
		a = scanner.nextInt();
		System.out.println(a==1? "추가기능입니다":(a==2? "조회기능입니다":(a==3? "입금기능입니다":(a==4? "출금기능입니다":(a==5? "삭제기능입니다":(a==9? "종료기능입니다":"잘못입력하셨습니다"))))));
		scanner.close();
	}

}
