import java.util.Scanner;

public class Ex002 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자를 이용하여 절대값을 구하시오 (무조건 양수)
		 * 
		 * 숫자 한 개 입력 > 입력하기
		 */
		//변수
		int num = 0, juldae = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("숫자입력 > ");
		num = scanner.nextInt();
		
		//처리
		juldae = (num>0)? num:-num;
		
		//출력
		System.out.println(juldae);
		
	}

}
