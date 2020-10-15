import java.util.Scanner;

public class Switch003 {

	public static void main(String[] args) {
		
		// 변수
		char a = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		// 입력
		System.out.println("a,b,c 중 하나를 입력 하시오 > ");
		a = scanner.next().charAt(0);
		
		// 처리
		switch (a) {
		case 'a' : result = "apple"; break;
		case 'b' : result = "banana"; break;
		case 'c' : result = "coconut"; break;
		default : result = "잘못 입력하셨습니다.";
		}
		System.out.println(result);
		scanner.close();
	}

}
