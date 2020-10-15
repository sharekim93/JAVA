import java.util.Scanner;

public class Ex018 {

	public static void main(String[] args) {
		int num1, num2;
		float result;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자1 입력 :");
		num1 = scanner.nextInt();
		
		System.out.println("숫자2 입력 :");
		num2 = scanner.nextInt();
		
		result = num1 / (float)num2;
		
		System.out.println("나누기결과 : " + String.format("%.2f", result));
		System.out.println("나누기결과 : " + Math.round((result)*100)/100f);
		System.out.println("나누기결과 : " + (int)(result*100)/100f);
	}

}
