import java.util.Scanner;

public class Day011_2 {

	public static void main(String[] args) {
		
		//변수
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("a,b,c 중에 한 개의 문자를 입력하시오 > ");
		a = scanner.next().charAt(0);
		
		//처리&출력
		switch(a)
		{
		case 'a':case 'A':System.out.println("a 또는 A라면 apple이다");break;
		case 'b':case 'B':System.out.println("b 또는 B라면 banana이다");break;
		case 'c':case 'C':System.out.println("c 또는 C라면 coconut이다");break;
		default : {System.out.println("잘못입력하셨습니다");}
		}
		
	}

}
