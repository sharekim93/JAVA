import java.util.Scanner;

public class Day009_2 {

	public static void main(String[] args) {
		// 1을 입력할 때까지 무한반복
		
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//처리&출력
		for(;;)
		{System.out.println("1을 입력해주세요 > ");
		a = scanner.nextInt();
		
		if (a==1) {break;}
			
		}

	}

}
