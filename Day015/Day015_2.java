import java.util.Scanner;

public class Day015_2 {

	public static void main(String[] args) {
		char input ='\u0000';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("a,b,c 중 하나를 입력하세요.");
		input = scanner.next().charAt(0);
		
		switch(input)
		{
		case 'A':case 'a': System.out.println(input+"라면 apple");break;
		case 'B':case 'b': System.out.println(input+"라면 banana");break;
		case 'C':case 'c': System.out.println(input+"라면 coconut");break;
		default: System.out.println("a,b,c만 입력 가능합니다.");
		}
		
		scanner.close();
	}

}
