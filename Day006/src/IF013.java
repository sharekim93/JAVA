import java.util.Scanner;

public class IF013 {

	public static void main(String[] args) {
		//변수
		int a = 0, b = 0;
		float result=0.f;
		char op = 0;
		String wrong = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("정수를 하나 입력해주세요 : ");
		a = scanner.nextInt();
		
		System.out.println("정수를 하나 입력해주세요 : ");
		b = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요 (+,-,*,/) : ");
		op = scanner.next().charAt(0);
		
		//처리
		if (op == '+') {result = a + b;}
		if (op == '-') {result = a - b;}
		if (op == '*') {result = a * b;}
		if (op == '/') {result = a / (float)b;}
		
		//출력
		
		/*
		 *  /라면 실수로 출력 /가 아니라면 정수로 출력
		 *  1. if
		if (op!='/') {System.out.println("" + a + op + b + "=" + (int)result);}
		else {System.out.println(result);}
		*/
		
		// 2. 삼항연산자
		
		System.out.println((op == '/')?
				("" + a + op + b + "=" + result)
				:("" + a + op + b + "=" + (int)result));
		
		/* 오답
		System.out.println(("" + a + op + b + "=")+((op == '/')?
				result:(int)result));
		*/
		
		scanner.close();
	}

}
