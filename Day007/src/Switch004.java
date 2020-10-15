import java.util.Scanner;

public class Switch004 {

	public static void main(String[] args) {
		//변수
		int month = 0;
		String result = null;
		Scanner scanner  = new Scanner(System.in);
		
		//입력
		System.out.println("현재 월을 입력하시오 > ");
		month = scanner.nextInt();
		
		//처리
		switch (month) {
		case 3: case 4: case 5: result = "봄 입니다";break;
		case 6: case 7: case 8: result = "여름 입니다";break;
		case 9: case 10 : case 11 : result = "가을 입니다";break;
		case 12: result = "겨울 입니다";break;
		case 1: result = "겨울 입니다";break;
		case 2: result = "겨울 입니다";break;
		default : result = "잘못 입력하셨습니다";
		}
		System.out.println(result);
		scanner.close();
	}

}
