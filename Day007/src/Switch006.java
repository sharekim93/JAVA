import java.util.Scanner;

public class Switch006 {

	public static void main(String[] args) {
		
		//변수
		char a = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("당신의 주민번호를 입력하세요.(123456-1234567) > ");
		a = scanner.next().charAt(7);

		//처리
		switch (a) {
		case '1': case '3' : result = "남자"; break;
		case '2': case '4' : result = "여자"; break;
		default : result = "외계인";
		}
		
		//출력
		System.out.println(result);
		scanner.close();
	}

}
