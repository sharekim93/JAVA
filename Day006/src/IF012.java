import java.util.Scanner;

public class IF012 {

	public static void main(String[] args) {
		char input=0;
		String result = "a,b,c가 아니다.";
		Scanner scanner = new Scanner(System.in);

		System.out.println("문자 a 또는 A , b 또는 B, c또는 C를 입력하시오 : ");
		input = scanner.next().charAt(0);
		
		if (input == 'a'|| input == 'A') {result = "apple이다";}
		else if (input =='b'|| input == 'B') {result = "banana이다";}
		else if (input == 'c' || input == 'C') {result = "coconut이다";}
		
		System.out.println(result);
		
		scanner.close();
		
	}

}
