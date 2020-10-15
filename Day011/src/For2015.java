
public class For2015 {

	public static void main(String[] args) {
		System.out.println("====for문으로 풀기====");

		for(int i=1;i<4;i++)
		{
			for(int j=2;j<5;j++) 
			{
			System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i=1;i<4;i++)
		{
			for(int j=5;j<8;j++)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}		
		
		System.out.println("====while문으로 풀기====");

		int i=1,j=2;
		while(i<4)
		{
			while(j<5)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
			j=2;
		}
		System.out.println();
		
		i=1;j=5;
		while(i<4)
		{
			while(j<8)
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			System.out.println();
			i++;
			j=5;
		}

		System.out.println("====do~while문으로 풀기====");
		i=1;j=2;
		do
		{
			do
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}while(j<5);
			System.out.println();
			i++;
			j=2;
	
		}
		while(i<4);
		System.out.println();
		
		i=1;j=5;
		do
		{
			do
			{
				System.out.print(j+"*"+i+"="+i*j+"\t");
				j++;
			}
			while(j<8);
			System.out.println();
			i++;
			j=5;
		}
		while(i<4);
	}

}
