
public class Repeat004 {

	public static void main(String[] args) {
		/*
		 * for, while, do while문을 이용해서 다음과 같이 처리하시오
		 * 1~10까지 3의 배수의 합을 출력하시오
		 * 1~10까지 3의 배수의 합 : 3 + 6 + 9 = 18
		 */
		int i=0,j=0;
		boolean first=true;
		System.out.print("for문 : ");
		for (i=1;i<=10;i++) 
		{
			if(i%3==0)
			{
				if (first) {first=false;}
				else {System.out.print("+");};
				j+=i;
				System.out.print(i);
			}
		}
		System.out.println("="+j);
		
		i=1;j=0;first=true;
		System.out.print("while문 : ");
		while (i<=10)
		{
			if(i%3==0)
			{
				if (first) {first=false;}
				else {System.out.print("+");};
				j+=i;
				System.out.print(i);
			}
		i++;
		}
		System.out.println("="+j);

		i=1;j=0;first=true;
		
		System.out.print("do~while문 : ");
		do 		
		{
			if(i%3==0)
			{
				if (first) {first=false;}
				else {System.out.print("+");};
				j+=i;
				System.out.print(i);
			}
		i++;
		}
		while (i<=10);
		System.out.println("="+j);
	}

}
