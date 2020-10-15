
public class For2009 {

	public static void main(String[] args) {
		
		//for
		/*
		System.out.println("====for문이용====");
		boolean first=true;
		int sum=55;
		for(int i=10;i<=100;i+=10)
		{	
			for(int j=i-10+1;j<=i;j++)
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				System.out.print(j);
			}
		System.out.println("="+sum);
		sum+=100;
		first=true;
		}
		*/
		System.out.println("====for문이용====");
		int sum=0;
		boolean first=true;
		for(int i=1;i<101;i++)
		{
			sum+=i;
			if (i%10==0) {System.out.println(i-9 +"+...+"+i+"="+sum);sum=0;};
			
		}
		
		//while
		System.out.println("====while문이용====");
		int i=1,j=1;sum=55;
		while (i<=10)
		{
			while(j<=10*i)
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				System.out.print(j);
				j++;
			}
			System.out.println("="+sum);
			sum+=100;
			first=true;
			j=10*i+1;
			i++;
		}
		
		//do~while
		System.out.println("====do~while문이용====");
		i=1;j=1;sum=55;
		do
		{
			do
			{
				if (first) {first=false;}
				else {System.out.print("+");}
				System.out.print(j);
				j++;
			}
			while(j<=10*i);
			System.out.println("="+sum);
			sum+=100;
			first=true;
			j=10*i+1;
			i++;
		}while (i<=10);
	}

}
