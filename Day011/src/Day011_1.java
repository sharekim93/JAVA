import java.util.Scanner;

public class Day011_1 {

	public static void main(String[] args) {
		
		//변수
		String a=null;
		Scanner scanner = new Scanner(System.in);
		
		//입력&처리&출력
		for(;;)
		{	System.out.println("a,b,c 중에 한 개의 문자를 입력하시오 > ");
			a = scanner.next();
		
			if (a.equalsIgnoreCase("a")) {System.out.println("a 또는 A라면 apple 이다.");break;}
			else if (a.equalsIgnoreCase("b")){System.out.println("b 또는 B라면 banana이다.");break;}
			else if (a.equalsIgnoreCase("c")){System.out.println("c 또는 C라면 coconut이다.");break;}
			else {System.out.println("잘못 입력하셨습니다.");}
		}
	}

}
