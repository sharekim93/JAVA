import java.util.Scanner;

public class IF007 {

	public static void main(String[] args) {
		int year = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("원하는 연도를 입력해주세요 > ");
		year = scanner.nextInt();
		
		if ((year%4 == 0) && !(year%100==0) || (year%400 ==0)) {System.out.println("윤년입니다.");}
		else {System.out.println("평년입니다.");}

		scanner.close();
	}

}
