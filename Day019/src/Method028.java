import java.util.Scanner;

public class Method028 {

	public static void main(String[] args) {
		//변수
		String user2[] = {"","",""};
		
		//입력
		user2 = user_input(); // 사용자에게 입력을 받는 메서드
		
		//출력
		user_show(user2); // 정보를 출력해주는 메서드
		
	}
	public static String[] user_input() {
		String user[] = {"","",""};
		Scanner scanner = new Scanner(System.in);
		System.out.println("유저 정보를 입력하세요");
		
	}

}
