import java.util.Scanner;

public class Switch007 {

	public static void main(String[] args) {
		
		//변수
		int avg = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("평균을 입력하시오 > ");
		avg = scanner.nextInt();
		
		//처리
		switch (avg/10) {
		case 9 : result="수"; break;
		case 8 : result="우"; break;
		case 7 : result="미"; break;
		case 6 : result="양"; break;
		default : result = "가";
		}
		
		//출력
		System.out.println(result);
		scanner.close();
	}

}
