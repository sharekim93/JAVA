import java.util.Scanner;

public class Day014_2 {

	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
		System.out.println("j,s,e 중에 입력하세요");
		a=scanner.next().charAt(0);
		
		switch (a)
		{
		case 'j' : System.out.println("JAVA");break;
		case 's' : System.out.println("Spring");break;
		case 'e' : System.out.println("e-gov");break;
		default : System.out.println("잘못 입력하셨습니다.");
		}
		scanner.close();
		}
		
	}

}
