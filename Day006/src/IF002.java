import java.util.Scanner;

public class IF002{
	public static void main(String[] args) {
		//평균을 입력하시오 >
		//만약 60점 이상이면 합격을 출력, 아니라면 불합격을 출력해주세요
		
		int mean = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("평균을 입력하시오 > ");
		mean = scanner.nextInt();
		
		if (mean >= 60) {System.out.println("합격");}
		else {System.out.println("불합격");}
		
	}
}
