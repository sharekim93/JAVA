import java.util.Scanner;

public class For014 {

	public static void main(String[] args) {
		
		//변수
		int age = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		for (;;)
		{	System.out.println("나훈아씨의 나이를 입력하세요 > ");
			age = scanner.nextInt();
			if (age ==70) {System.out.println("팬이시군요!");break;}
			else {System.out.println("다시 도전!");}
		}
		

	}

}
