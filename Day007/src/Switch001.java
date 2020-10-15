import java.util.Scanner;

public class Switch001 {
	public static void main(String[] args) {
		int a = 0;
		String result = null;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 1,2,3 중에 입력해주세요 > ");
		a = scanner.nextInt();
		
		/*
		if (a==1) {result = "1이다";}
		else if(a==2){result = "2이다";}
		else if(a==3){result = "3이다";}
		else {result = "1,2,3이 아니다";}
		*/
		
		switch (a){
			case 1 : result = "1이다"; break;
			case 2 : result = "2이다"; break;
			case 3 : result = "3이다"; break;
			default : result = "1,2,3이 아니다."; 
		}
		
		System.out.println(result);
			
		}
	}

