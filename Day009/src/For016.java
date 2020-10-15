import java.util.Scanner;

public class For016 {

	public static void main(String[] args) {
		/*
		* [연습문제]     클래스명 : For016
	    * 1. 정수를 하나 입력해주세요.>  10    (숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
	    * 2. 정수를 하나 입력해주세요.>  3     (숫자는 0~100사이만 입력가능하게 잘못입력하면 다시입력받게 무한반복)
	    * 3. 연산자를 입력해주세요.(+,-,*,/)>  +  (연산자는  +,-,*,/만 입력가능하게   잘못입력하면 다시입력받게 무한반복)
	    * 
	    * 예) 10 + 3 = 13
	    *     10 - 3 = 7
	    *     10 * 3 = 30
	    *     10 / 3 = 3.333333    
	     4. 다시 시작하시겠습니까? ( yes라면 다시 연산시작 / no라면 프로그램 종료 )
	       yes, no가 아니라면 다시 무한반복
		 */

		//변수
		int a=0,b=0;
		char op=' ';
		String re=null;
		String result=null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		for(;;) {
		for (;;)
		{
			System.out.println("1. 정수를 하나 입력해주세요 > ");
			a= scanner.nextInt();
			if (a>=0&&a<=100) {break;}
		}
		for (;;)
		{
			System.out.println("2. 정수를 하나 입력해주세요 > ");
			b= scanner.nextInt();
			if (b>=0&&b<=100) {break;}
		}
		for (;;)
		{
			System.out.println("3. 연산자를 하나 입력해주세요(+,-,*,/) > ");
			op= scanner.next().charAt(0);
			if (op=='+'||op=='-'||op=='*'||op=='/') {break;}
		}
	
		//처리
		if (op=='+') {result = "" + (a + b);} 
		else if (op=='-') {result = "" + (a - b);} 
		else if (op=='*') {result = "" + (a * b);} 
		else if (op=='/') {result = "" + (a /(float)b);} 
		//출력
		System.out.println(""+a+op+b+"="+result);
		
		
		for (;;)
		{
			System.out.println("4. 다시 시작하시겠습니까?");
			re = scanner.next();
			if (re.equalsIgnoreCase("yes")) {break;} // //을 쓰면 안 된다(링크를 비교)
			if (re.equalsIgnoreCase("no")) {System.out.println("프로그램을 종료합니다."); return;}
		}

		}
	}

}
