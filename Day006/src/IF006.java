import java.util.Scanner;

public class IF006 {

	public static void main(String[] args) {

		int a=0, b=0, c=0, max=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1을 입력하세요 > ");
		a = scanner.nextInt();
		
		System.out.println("숫자 2을 입력하세요 > ");
		b = scanner.nextInt();

		System.out.println("숫자 3을 입력하세요 > ");
		c = scanner.nextInt();

		max = a;
		if (max < b) {max =b;} //1형식을 사용하여 모든 조건 확인
		if (max < c) {max =c;}
		
		System.out.println(max);
		
		scanner.close();
	}

}
