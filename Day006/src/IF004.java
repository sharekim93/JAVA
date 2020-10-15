import java.util.Scanner;

public class IF004 {
	public static void main(String[] args) {
		int a= 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1,2,3 중 좋아하는 숫자를 입력해 주세요 : ");
		a = scanner.nextInt();
		
		if (a==1) {System.out.println("one");}
		else if(a==2) {System.out.println("two");}
		else if(a==3) {System.out.println("three");}
		else {System.out.println("1,2,3이 아니다");}
	}
}
