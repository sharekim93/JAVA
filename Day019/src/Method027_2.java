import java.util.Scanner;

public class Method027_2 {

	public static void main(String[] args) {
		// 문자열을 입력 받아 ,를 기준으로 분리하여 출력해주기
		String userinput = "";
		String input[] = {"",""};
		
		//입력
		userinput = user_input(); // 사용자에게 입력을 받는 메서드
		
		//출력
		user_show(userinput,input); //정보를 출력해주는 메서드
	}
	public static String user_input() {
		Scanner scanner = new Scanner(System.in);
		String userinput = "";
		
		System.out.print("문자열을 입력하세요 > ");
		userinput = scanner.next();
		return userinput;
	}
	//method name : user_input
	//return : string
	//parameter : 없음
	public static void user_show(String userinput,String input[]) {
		int breakpoint =0;
		
		for(int i=0;i<userinput.length();i++) {
			if(userinput.charAt(i)==',') {breakpoint=i;break;}
		}
		System.out.print("첫번째 문자열 : ");
		for (int i=0;i<breakpoint;i++) {
			System.out.print(userinput.charAt(i));
		}
		System.out.println();
		System.out.print("두번째 문자열 : ");
		for (int i=breakpoint+1;i<userinput.length();i++) {
			System.out.print(userinput.charAt(i));
		}
	}	
	//method name : user_show
	//return : void
	//parameter : String userinput,String input[]

}
