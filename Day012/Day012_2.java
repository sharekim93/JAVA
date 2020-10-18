import java.util.Scanner;

public class Day012_2 {

	public static void main(String[] args) {
			
		//변수
		int a = 0;
		String result=null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 1개 입력하세요");
		a = scanner.nextInt();
		
		//처리
		switch(a) {
		case 1: result ="1";break;
		case 2: result ="2";break;
		case 3: result ="3";break;
		default : {result = "잘못 입력하셨습니다.";}
		}
		
		//출력
		if (a==1||a==2||a==3) {System.out.println(a+"를 입력받으면 "+result+"이다");}
		else {System.out.println(result);}
		
		scanner.close();
		}
		
	}

