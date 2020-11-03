
public class For2007 {

	public static void main(String[] args) {
		//for
		System.out.println("============for문으로 풀기============");
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			for(int j=10*(i-1)+1;j<=10*i;j++)
			{
				sum+=j;
			}
		System.out.println(sum);
		}
		
		//while
		System.out.println("============while문으로 풀기============");
		sum=0;
		int i=1,j=1;
		
		while(i<=10)
		{
			while(j<=10*i)
			{
				sum+=j;
				j++;
			}
		System.out.println(sum);
		i++;
		j=10*(i-1)+1;
		}
		
		//do~while
		System.out.println("============do ~while문으로 풀기============");
		i=1;j=1;sum=0;
		do
		{
			do
			{
				sum+=j;
				j++;
			}
			while(j<=10*i);
			System.out.println(sum);
			i++;
			j=10*(i-1)+1;
		}
		while(i<=10);
	}

}
