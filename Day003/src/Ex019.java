import java.util.Scanner;

public class Ex019 {

	public static void main(String[] args) {
		int kor_score,eng_score,math_score,sci_score,sum;
		float avg;
		String stdnt_num;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학   번 입력 : ");
		stdnt_num = scanner.next();
		System.out.println("국어점수 입력 : ");
		kor_score = scanner.nextInt();
		System.out.println("영어점수 입력 : ");
		eng_score = scanner.nextInt();
		System.out.println("수학점수 입력 : ");
		math_score = scanner.nextInt();
		System.out.println("과학점수 입력 : ");
		sci_score = scanner.nextInt();
		
		sum = kor_score+eng_score+math_score+sci_score;
		avg = sum/4f;
		
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::\tGREEN IT SCORE\t\t\t\t\t  ::");
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("학번\t국어\t영어\t수학\t과학\t총점\t평균");
		System.out.println(stdnt_num + "\t" +kor_score + "\t" + eng_score +"\t"
							+ math_score + "\t" +sci_score + "\t" + sum + "\t" + avg);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
	}

}
