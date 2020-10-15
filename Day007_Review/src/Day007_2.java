import java.util.Scanner;

public class Day007_2 {
	public static void main(String[] args) {
		int a = 0;
		String result = null;

		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("숫자 한 개 입력하세요");
		a = scanner.nextInt();
		
		if (a>0) {result = "양수";}
		else if (a==0) {result = "zero";}
		else if (a<0) {result = "음수";}
		else {result = "기타";}
		
		System.out.println(result);
	}
}
