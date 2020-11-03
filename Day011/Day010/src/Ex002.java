
public class Ex002 {

	public static void main(String[] args) {
		/*
		 * 	1~20까지의 정수중에서 2또는 3의 배수가아닌 수의 총합을
			for , while , do while문을 이용해서   처리하시오.
		
			1 + 5 + 7  +11  +13  +17  +19 = 73  
		 */
		
		//for
		
		//변수
		int i=0,j=0;
		boolean first = true;
		
		//처리
		for(i=1;i<=20;i++)
		{
			if ((i%2!=0)&&(i%3!=0))
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				
				System.out.print(i);
				j+=i;
			}
		}
		//출력
		System.out.println("=" + j);
		
		//while
		//변수
		i=1;j=0;first=true;
		
		//처리
		while(i<=20) 
		{if ((i%2!=0)&&(i%3!=0))
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				
				System.out.print(i);
				j+=i;
				
			}
		i++;
		}
		
		//출력
		System.out.println("=" + j);
				
		//do~while
		i=1;j=0;first=true;
		do
		{
			if ((i%2!=0)&&(i%3!=0))
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				
				System.out.print(i);
				j+=i;
		
			}
		i++;
		}
		while(i<=20);
		System.out.println("=" + j);
	}
}
