import java.util.Scanner;

public class IF009 {

	public static void main(String[] args) {
		char a = 'a', z='z', A='A',Z='Z', word=0;
		String result =null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하시오 > ");
		word = scanner.next().charAt(0);
		
		if (word>=a&&word<=z) {result = "소문자 " + word +"의 대문자는 " + (char)(word - 32);}
		else if (word>=A&&word<=Z) {result = "대문자 " + word + "의 소문자는 " +(char)(word +32);}
		else {result = "잘못 입력하셨습니다.";}
		
		System.out.println(result);
		
		scanner.close();

	}

}
