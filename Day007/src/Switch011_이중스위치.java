import java.util.Scanner;

public class Switch011_이중스위치 {

	public static void main(String[] args) {
		//변수
		int user = 0, com = 0;
		String result =null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("가위(1),바위(2), 보(3) 중 하나를 입력하세요 > ");
		user = scanner.nextInt();
		com = (int)(Math.random() * 3) + 1;
		
		//처리
		switch(user) {
		case 1 : switch(com) 
				{
				case 1 : result = "비겼습니다."; break;
				case 2 : result = "당신이 졌습니다."; break;
				case 3 : result = "당신이 이겼습니다."; break;
				} break;
		case 2 : switch(com)
				{
				case 1 : result = "당신이 이겼습니다."; break;
				case 2 : result = "비겼습니다."; break;
				case 3 : result = "당신이 졌습니다."; break;
				} break;
		case 3 : switch(com) 
				{
				case 1 : result = "당신이 졌습니다."; break;
				case 2 : result = "당신이 이겼습니다."; break;
				case 3 : result = "비겼습니다."; break;
				} break;
		default : result = "오류입니다.";
		} 
		
		//출력
		System.out.println("당신은 "+user +"입니다");
		System.out.println("컴은 " +com +"입니다");
		System.out.println(result);
		
		scanner.close();
	}

}
