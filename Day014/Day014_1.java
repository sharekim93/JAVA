import java.util.Scanner;

public class Day014_1 {

	public static void main(String[] args) {
		char a=' ';
		Scanner scanner = new Scanner(System.in);
		
		for(;;)
		{
		System.out.println("j,s,e 중에 입력하세요");
		a=scanner.next().charAt(0);
		
		if (a=='j') {System.out.println("JAVA");break;}
		else if(a=='s') {System.out.println("Spring");break;}
		else if(a=='e') {System.out.println("e-gov");break;}
		else {System.out.println("잘못 입력하셨습니다.");}
		}
		
		scanner.close();
	}

}
