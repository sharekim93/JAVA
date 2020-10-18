import java.util.Scanner;

public class Day013_1 {

	public static void main(String[] args) {
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("10,20,30 중에 입력하세요");
		a=scanner.nextInt();
		
		//처리
		if (a==10) {System.out.println("ten");}
		else if(a==20) {System.out.println("twenty");}
		else if(a==30) {System.out.println("thirty");}
		else {System.out.println("잘못 입력하셨습니다");}

		scanner.close();
	}

}
