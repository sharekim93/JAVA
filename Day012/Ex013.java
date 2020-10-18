import java.util.Scanner;

public class Ex013 {

	public static void main(String[] args) {
		
		//변수
		int a = (int)(Math.random()*100)+1;
		Scanner scanner = new Scanner(System.in);
		System.out.println("임의의 수 : "+a);
		
		for (int i=1;;)
		{
		System.out.println(i+"번. 1~100사이의 숫자를 입력하세요");
		if (a==scanner.nextInt()) {System.out.println("정답 : "+a+"\t => "+i+"번에 정답을 맞췄습니다");break;}
		i++;
		}
	}

}
