import java.util.Scanner;

public class IF005 {

	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1개를 입력해주세요");
		a = scanner.nextInt();
		
		if (a>0) {System.out.println(a);}
		else if (a==0) {System.out.println(0);}
		else {System.out.println(-a);}

	}

}
