import java.util.Scanner;

public class For012 {

	public static void main(String[] args) {
		// 두 수 사이의 합을 구하시오
		
		//변수
		int a=0,b=0,sum=0,sum2=0;
		boolean first = true;
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("숫자 1 입력 : ");
		a = scanner.nextInt();
		
		System.out.println("숫자 2 입력 : ");
		b = scanner.nextInt();
		
		//처리
		// for 여러 번
		/*
		 * if (a-b>0) 
		{
			for (int i=a;i>=b;i--)
				{
				sum+=i;
				if (first) {first = false;}
				else System.out.print("+");
				System.out.print(i);
				}
		System.out.println("="+sum);		
		}
		else if (b-a>0) 
		{
			for (int i=a;i<=b;i++)
				{
				sum+=i;
				if (first) {first = false;}
				else {System.out.print("+");}
				System.out.print(i);
				}
		System.out.println("="+sum);
		}
		else if (a==b){System.out.println(a);}
		else {System.out.println("잘못 입력하셨습니다.");}
		*/
		
		//for구문 한 번으로 줄이기
		/*
		for (int i=a,j=a;(i>=b)||(j<=b);i--,j++)
		{
			if (a>b) 
				{
				sum+=i;
				if (first) {System.out.print(a);first=false;}
				else {System.out.print("+"+i);}
				}
			else if (a<b)
				{
				sum+=j;
				if (first) {System.out.print(a);first=false;}
				else {System.out.print("+"+j);}
				}
		}
		System.out.println("="+sum);
		*/
		for (int i=a,j=a;(i>=b)||(j<=b);i--,j++)
		{	
			if (first) {first=false;}
			else System.out.print("+");
			
			if (a>b){System.out.print(i);sum+=i;}
			else if (a<b){System.out.print(j);sum+=j;}
			
		}
		System.out.println("="+sum);
		sum=0;first=true;
		for (int i=b,j=b;(i<=a)||(j>=a);i++,j--)
		{	
			if (first) {first=false;}
			else System.out.print("+");
			
			if (a>b){System.out.print(i);sum+=i;}
			else if (a<b){System.out.print(j);sum+=j;}
			
		}
		System.out.println("="+sum);
		
		scanner.close();
		}	
}
