import java.util.Scanner;

public class IF010 {

	public static void main(String[] args) {
		int num = 0;
		String result= null;
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("숫자를 입력하시오(홀수면 남자 / 짝수면 여자) > ");
		num = scanner.nextInt();
		
		if (num%2 ==0) {result = "여자";}
		else if(num%2 !=0) {result = "남자";}

		System.out.println(result);
		
		scanner.close();
	}

}
