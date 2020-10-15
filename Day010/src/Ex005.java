
public class Ex005 {

	public static void main(String[] args) {
		
		//for
		System.out.println("============for문으로 풀기============");
		for(int i=1;i<=11;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		//while
		System.out.println("============while문으로 풀기============");
		int i=1, j=1;
		while(i<=11)
		{
			while(j<=i)
			{
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		
		//do~while
		System.out.println("============do ~while문으로 풀기============");
		i=1;j=1;
		do
		{
			do
			{
				System.out.print("*");
				j++;
			}
			while(j<=i);
			System.out.println();
			i++;
			j=1;
		}
		while(i<=11);
	}

}
