import java.util.Scanner;

public class IF011 {

	public static void main(String[] args) {
		int old = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("어린이의 나이를 입력하시오(1~5세 사이) > ");
		old = scanner.nextInt();
		
		if (old>=1 && old<=5) {System.out.println(old);}
		else {System.out.println("1~5세 사이가 아닙니다.");}
		
		scanner.close();
	}

}
