import java.util.Scanner;

public class Ex016 {

	public static void main(String[] args) {
		// 변수
		String str = "";
		char ch = ' '; // ** Char 자료형의 경우 초기값으로 '공백' 하나 넣어야 함
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("당신이 좋아하는 색상은?");
		str = scanner.next();
		
		System.out.print("당신이 좋아하는 알파벳은?");
		ch = scanner.next().charAt(0); // ** scanner.next()까지는 문자열을 입력 받고
									   //    charAt()에서 print 할 위치를 선택
		
		//출력
		System.out.println("문자열 - 색상 : " + str);
		System.out.println("문자열 - 색상 : " + str.charAt(0));
		System.out.println("문자열 - 색상 : " + str.charAt(1));
		System.out.println("문자열 - 색상 : " + str.charAt(2));
		System.out.println("문자 - 알파벳 : " + ch);
		
	}

}
