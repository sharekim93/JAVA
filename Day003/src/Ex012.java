import java.util.Scanner;

public class Ex012 {

	public static void main(String[] args) {
		
		//변수
		float	f1		= 3.14f;
		double	dou		= 3.14;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.print("1.float 자료형 입력 받기 : ");
		f1 = scanner.nextFloat();
		
		System.out.print("2.Double 자료형 입력 받기 : ");
		dou = scanner.nextDouble();
		
		
		//처리
		
		//출력
		System.out.println(f1+"\t"+dou);
	}

}
