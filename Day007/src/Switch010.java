import java.util.Scanner;

public class Switch010 {

	public static void main(String[] args) {
		// 변수
		char jumin = 0;
		String result=null;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("당신의 주민번호를 입력하세요");
		jumin = scanner.next().charAt(7);
		
		switch(jumin){
		case '1' : case '3' : 
			switch(jumin) {case '1' : result = "남자 - 1900년대생"; break;
						   case '3' : result = "남자 - 2000년대생"; break;} break;
		case '2' : case '4' :
			switch(jumin) {case '2' : result = "여자 - 1900년대생"; break;
		   				   case '4' : result = "여자 - 2000년대생"; break;} break;
		default : result = "유효하지 않은 주민번호입니다.";
		}
		
		System.out.println(result);
		scanner.close();
	}

}
