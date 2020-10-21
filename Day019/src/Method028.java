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
		String user2[] = {"","",""};
		String user=null;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("유저 정보를 입력하세요\n예) abc@gmail.com/20/서울시강남구역삼동\n>");
		user =scanner.next();
	
		int breakpoint=0,breakpoint2=0;
		boolean first=true;
		
		for(int i=0;i<user.length();i++) {
			if(user.charAt(i)=='/') {
				if(first) {first=false; breakpoint=i;}
				else {breakpoint2=i;}
			}
		}
		for(int i=0;i<breakpoint;i++) {
			user2[0]+=user.charAt(i);
		}
		
		for(int i=breakpoint+1;i<breakpoint2;i++) {
			user2[1]+=user.charAt(i);
		}
		for(int i=breakpoint2+1;i<user.length();i++) {
			user2[2]+=user.charAt(i);
		}
		return user2;
		
	}
	
	public static void user_show(String user2[]) {

		System.out.print("1. email : ");
		System.out.println(user2[0]);
		System.out.print("2. age : ");
		System.out.println(user2[1]);
		System.out.print("3. address : ");
		System.out.println(user2[2]);
	}
		
	
	

}
