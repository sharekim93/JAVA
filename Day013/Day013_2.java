import java.util.Scanner;

public class Day013_2 {

	public static void main(String[] args) {
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("10,20,30 중에 입력하세요");
		a=scanner.nextInt();
		
		//처리
		switch (a)
		{
		case 10: System.out.println("ten");break;
		case 20: System.out.println("twenty");break;
		case 30: System.out.println("thirty");break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		scanner.close();
	}

}
