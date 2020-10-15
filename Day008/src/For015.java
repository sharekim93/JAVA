import java.util.Scanner;

public class For015 {

	public static void main(String[] args) {
		
		//변수
		int a=0,b=0;
		float result=0;
		char op='\u0000';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for (;;)
		{
			System.out.println("1. 정수를 하나 입력해주세요 > ");
			a = scanner.nextInt();
			if (0<=a&&a<=100) {break;}
			
		}
		for (;;)
		{
			System.out.println("2. 정수를 하나 입력해주세요 > ");
			b = scanner.nextInt();
			if (0<=b&&b<=100) {break;}
		}		
		for (;;)
		{
			System.out.println("3. 연산자를 하나 입력해주세요(+,-,*,/) > ");
			op = scanner.next().charAt(0);
			if (op=='+'||op=='-'||op=='*'||op=='/') {break;}
		}
		//처리
		switch (op)
		{
		case '+' : result =(a + b);break;
		case '-' : result =(a - b);break;
		case '*' : result =(a * b);break;
		case '/' : result =(a / (float)b);break;		
		}
		//출력
		switch (op)
		{
		case '/' :System.out.println(""+a+op+b+"="+result);
		default : System.out.println(""+a+op+b+"="+(int)result);
		}
	}
}
