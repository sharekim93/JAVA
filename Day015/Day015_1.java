import java.util.Scanner;

public class Day015_1 {

	public static void main(String[] args) {
		int a=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1,2,3중에 입력하세요");
		a=scanner.nextInt();
		
		if(a==1) {System.out.println("1이면 1이다.");}
		else if(a==2) {System.out.println("2이면 2이다.");}
		else if(a==3) {System.out.println("3이면 3이다.");}
		else {System.out.println("123만 입력 가능합니다..");}
		
		scanner.close();
	}

}
