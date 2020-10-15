import java.util.Scanner;

public class IF013 {

	public static void main(String[] args) {
		int a=0,b=0;
		char op = ' ';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 하나 입력해주세요 > ");
		a = scanner.nextInt();
		
		System.out.println("정수를 하나 입력해주세요 > ");
		b = scanner.nextInt();
		
		System.out.println("연산자를 입력해주세요(+,-,*,/) > ");
		op = scanner.next().charAt(0);
		
		switch (op)
		{
		case '+' : result ="\t" + a + " + " + b + " = " + (a + b); break;
		case '-' : result ="\t" + a + " - " + b + " = " + (a - b); break;
		case '*' : result ="\t" + a + " * " + b + " = " + (a * b); break;
		case '/' : result ="\t" + a + " / " + b + " = " + (a / (float)b); break;		
		}
		System.out.println(result);
		scanner.close();
	}

}
