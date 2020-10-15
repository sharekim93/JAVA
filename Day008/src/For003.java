import java.util.Scanner;

public class For003 {

	public static void main(String[] args) {
		/*
		 * 구구단 프로그램입니다.
		 * 원하는 단을 입력해주세요 > 
		 */
		int a = 0;
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("구구단 프로그램입니다.\n원하는 단을 입력해주세요 > ");
		a = scanner.nextInt();
		
		for (int i=1;i<=9;i++) {System.out.println(a+"*"+i+"="+a*i);}
	}

}
