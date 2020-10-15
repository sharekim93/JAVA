import java.util.Scanner;

public class Ex017 {

	public static void main(String[] args) {
		String name;
		char classname;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("당신의 이름을 입력하시오 > ");
		name = scanner.next();
		
		System.out.println("당신의 반을 입력하시오(A/B) > ");
		classname = scanner.next().charAt(0);
		
		System.out.println(":::::::::::::::: USERINFO");
		System.out.println(":: NAME  : "+name);
		System.out.println(":: CLASS : "+classname);

	}

}
