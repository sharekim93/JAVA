import java.util.Scanner;

public class Day018_1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char i='\u0000';
		System.out.println("====for문====");
		for(;;)
		{
			
			;
			System.out.println("주어진 문자를 입력하세요 > ");
			i=scanner.next().charAt(0);
			if(i=='+'||i=='-'||i=='*'||i=='/') {break;}
		}
		System.out.println("====while문====");
		while(true)
		{
			System.out.println("주어진 문자를 입력하세요 > ");
			i=scanner.next().charAt(0);
			if(i=='+'||i=='-'||i=='*'||i=='/') {break;}
		}
		
		System.out.println("====do~while문====");
		do
		{
			System.out.println("주어진 문자를 입력하세요 > ");
			i=scanner.next().charAt(0);
			if(i=='+'||i=='-'||i=='*'||i=='/') {return;}
		}
		while(true);
	}

}
