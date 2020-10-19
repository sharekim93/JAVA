import java.util.Scanner;

public class Method012 {
	
	public static int inputNum() {
		int a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력 > ");
		a=scanner.nextInt();
		return a;
	}
	public static char inputOper() {
		char a=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("연산자 입력 > ");
		a=scanner.next().charAt(0);
		return a;
	}
	public static float calc(int a, int b, char c)
	{	
		float result=0.0f;
		if (c== '+') {result = (a+b);}
		else if (c== '-') {result = (a-b);}
		else if (c== '*') {result = (a*b);}
		else if (c== '/') {result = a/(float)b;}
		return result;
	}
	public static void show(int a, int b, char op, float result) {
		
		if (op== '/') {System.out.println(""+a+op+b+" = "+String.format("%.2f", result));}
		else {System.out.println(""+a+op+b+" = "+(int)result);}
	}
	public static void main(String[] args) {
		int num1=0, num2=0;
		float result=0.0f;
		char op='\u0000';
		
		num1=inputNum();
		op=inputOper();
		num2=inputNum();
				
		result=calc(num1,num2,op);
		
		show(num1,num2,op,result);
	}

}
