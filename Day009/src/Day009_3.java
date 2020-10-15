import java.util.Scanner;

public class Day009_3 {

	public static void main(String[] args) {
		
		//변수
		int a=0,b=0;
		char op=' ';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for(;;)
		{
			System.out.println("1. 정수를 하나 입력해주세요.");
			a= scanner.nextInt();
			if (a>=0&&a<=100) {break;}
			else System.out.println("잘못입력하셨습니다.");
		}
		for(;;)
		{
			System.out.println("2. 정수를 하나 입력해주세요.");
			b = scanner.nextInt();
			if (b>=0&&b<=100) {break;}
			else System.out.println("잘못입력하셨습니다.");
		}
		for(;;)
		{
			System.out.println("3. 연산자를 하나 입력해주세요.(+,-,*,/)");
			op = scanner.next().charAt(0);
			if(op=='+'||op=='-'||op=='*'||op=='/') {break;}
			else System.out.println("잘못입력하셨습니다.");
		}
		
		//처리
		if (op=='+') {result ="" + (a + b);}
		else if (op=='-') {result ="" + (a - b);}
		else if (op=='*') {result ="" + (a * b);}
		else if (op=='/') {result ="" + (a / (float)b);}
		
		
		//출력
		System.out.println("" + a + op + b + "=" + result);
		
		/*
		for(;;)
		{
			switch (op)
			{
			case '+' : result ="" + (a + b);break;
			case '-' : result ="" + (a - b);break;
			case '*' : result ="" + (a * b);break;
			case '/' : result ="" + (a / (float)b); break;
			}
			System.out.println("" + a + op + b + "=" + result);break;
		}
		*/
	}	
}

