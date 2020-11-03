import java.util.Scanner;

public class Day010_1 {

	public static void main(String[] args) {
		// if 버전으로 문제를 풀으시오
		//변수
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("1,2,3 중에 한 개의 숫자를 입력하시오 > ");
		a=scanner.nextInt();
		
		//처리&출력
		if	   (a==1) {System.out.println(a+"라면 1이다");}
		else if(a==2){System.out.println(a+"라면 2이다");}
		else if(a==3){System.out.println(a+"라면 3이다");}
		else {System.out.println("1,2,3이 아니라면 유효하지 않은 숫자입니다.");}
		
		scanner.close();
		}
	}

