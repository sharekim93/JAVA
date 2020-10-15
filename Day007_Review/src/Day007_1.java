import java.util.Scanner;

public class Day007_1 {
	public static void main(String[] args) {
		float avg = 0f;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("평균을 입력하시오 > ");
		avg = scanner.nextFloat();
		
		if (avg >= 60) {System.out.println("합격");}
		else {System.out.println("불합격");}
	}
}
