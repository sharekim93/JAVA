import java.util.Scanner;

public class IF008 {

	public static void main(String[] args) {
		char word=0, a = 'a', z='z', A='A', Z='Z';
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳을 입력하시오 > ");
		word = scanner.next().charAt(0);
		
		if (word>= a && word<=z) {result = "소문자입니다.";}
		else if(word>=A && word<=Z) {result = "대문자입니다.";}
		else {result = "알파벳이 아닙니다";}
		
		System.out.println(word + "는 " + result);

		scanner.close();
	}

}
