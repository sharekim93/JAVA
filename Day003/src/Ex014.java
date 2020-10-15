import java.util.Scanner;

public class Ex014 {

	public static void main(String[] args) {
		
		int number1,number2;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자1 입력 :");
		number1 = scanner.nextInt();
		
		System.out.println("숫자2 입력 : ");
		number2 = scanner.nextInt();
		
		System.out.println(number1 + "+" +number2 + "=" +(number1 + number2));
		System.out.println(number1 + "-" +number2 + "=" +(number1 - number2));
		System.out.println(number1 + "*" +number2 + "=" +(number1 * number2));
		System.out.println(number1 + "/" +number2 + "=" +String.format("%.5f",(number1 /(float) number2)));
		
	}

}
