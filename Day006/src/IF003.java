import java.util.Scanner;

public class IF003 {
	public static void main(String[] args) {
		
		int a = 0;
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("숫자 입력 : ");
		a = scanner.nextInt();
		
		if (a>0) {System.out.println("양수");}
		else if (a==0) {System.out.println("zero");}
		else {System.out.println("음수");}
	}
}
