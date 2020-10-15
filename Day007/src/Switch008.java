import java.util.Scanner;

public class Switch008 {

	public static void main(String[] args) {
		//변수
		int age = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("당신의 나이를 입력하시오 > ");
		age = scanner.nextInt();
		
		//처리
		switch (age/10) {
		case 0: case 1 : result = age==19? "청년":"젊군..."; break;
		case 2: case 3: result ="청년"; break;
		case 4: result ="중년"; break;
		case 5: result ="장년"; break;
		case 6: result ="노인"; break;
		default: result="노인";
		}
		
		//출력
		System.out.println(result);
		scanner.close();
	}

}
