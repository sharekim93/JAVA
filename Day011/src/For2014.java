
public class For2014 {
	public static void main(String[] args) {
		
		System.out.println("====for문 이용====");
		for(int i=1;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("★");
			}
			System.out.println();
		}
		
		System.out.println("====while문 이용====");
		int i=1,j=5;
		while(i<5)
		{
			while(j>i)
			{
				System.out.print("★");
			j--;
			}
			System.out.println();
			i++;
			j=5;
		}
		System.out.println("====do~while문 이용====");
		i=1;j=5;
		do
		{
			do
			{
				System.out.print("★");
			j--;
			}
			while(j>i);
			System.out.println();
			i++;
			j=5;
		} while(i<5);
		
	}
}
