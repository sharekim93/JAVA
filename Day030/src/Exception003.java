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
				scanner.next(); // 공백처리를 해주기 위함
			}
			if(one==1) {break;}
			
		}
		
	}

}

