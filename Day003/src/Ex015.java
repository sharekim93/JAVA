import java.util.Scanner;

public class Ex015 {

	public static void main(String[] args) {
		int korean, english, math;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수 입력 : ");
		korean = scanner.nextInt();
		
		System.out.println("영어점수 입력 : ");
		english = scanner.nextInt();
		
		System.out.println("수학점수 입력 : ");
		math = scanner.nextInt();

		System.out.println("======================================");
		System.out.println("국어\t영어\t수학\t총점\t평균");
		System.out.println(
				korean+"\t"+ english+"\t"+ math+"\t" + (korean + english + math) + "\t" + 
				String.format("%.2f",(float)(korean + english + math)/3));
		System.out.println("======================================");
	}

}
