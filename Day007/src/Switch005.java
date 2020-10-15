import java.util.Scanner;

public class Switch005 {

	public static void main(String[] args) {
		//변수
		char a = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("a,b,c,A,B,C 중 하나를 입력하세요 > ");
		a = scanner.next().charAt(0);
		
		//처리
		switch (a) {
		case 'a' : result = "apple"; break;
		case 'A' : result = "apple"; break;
		case 'b' : result = "banana"; break;
		case 'B' : result = "banana"; break;
		case 'c' : result = "coconut"; break;
		case 'C' : result = "coconut"; break;
		}
		System.out.println(result);
		scanner.close();
	}

}
