import java.util.Scanner;

public class Switch002 {

	public static void main(String[] args) {
		/*
		 *  숫자 1개 입력 받기
		 *  만약에 3이라면 봄이다 출력
		 *  	 6이라면 여름이다 출력
		 *  	 9라면 가을이다 출력
		 *  	 12라면 겨울이다 출력
		 */
		//변수
		int a = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("3,6,9,12 중 하나를 입력하세요 > ");
		a = scanner.nextInt();
		
		//처리
		switch (a) {
		case 3  : result = "봄이다";  break;
		case 6  : result = "여름이다"; break;
		case 9  : result = "가을이다"; break;
		case 12 : result = "겨울이다"; break;
		default : result = "잘못 입력하셨습니다.";
		}
		//출력
		System.out.println(result);
		scanner.close();
	}

}
