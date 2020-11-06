import java.util.Scanner;

public class Exception003 {

	public static void main(String[] args) {
		int one=0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try{
				System.out.println("1을 입력하세요");
				one = scanner.nextInt();
			}
			catch(Exception e){
				System.out.println("숫자만 입력 가능합니다.");
				scanner = new Scanner(System.in);
			}
			if(one==1) {break;}
			
		}
		
	}

}

