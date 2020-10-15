import java.util.Scanner;

public class Switch009 {
	public static void main(String[] args) {
		/*
		 *  계산기를 만드시오
		 *  정수 한 개 입력 > 10
		 *  정수 한 개 입력 > 3
		 *  연산자 한 개 입력 > (+,0,*,/) > *
		 *  10*3 = 30
		 */
		
		//변수
		int a=0, b=0;
		float result= 0;
		char op = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("정수 한 개 입력 > ");
		a = scanner.nextInt();
		
		System.out.println("정수 한 개 입력 > ");
		b=  scanner.nextInt();
		
		System.out.println("연산자 한 개 입력 > (+,0,*,/)");
		op = scanner.next().charAt(0);
		
		//처리
		switch (op) {
		case '+' : result = (a + b); break;
		case '-' : result = (a - b); break;
		case '*' : result = (a * b); break;
		case '/' : result = (a / (float)b); break;
		}
		
		//출력
		if (op=='/') {System.out.println(result);}
		else {System.out.println((int)result);}
		
		scanner.close();
	}
}
