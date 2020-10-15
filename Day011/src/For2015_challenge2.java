
public class For2015_challenge2 {

	public static void main(String[] args) {
		System.out.println("====for문으로 풀기====");
		for(int i=1;i<4;i++)
		{
			int k=3*i-1;
			for(int j=1;j<4;j++)
			{
			System.out.print(k+"*"+j+"="+k*j+"\t");
			System.out.print((k+1)+"*"+j+"="+(k+1)*j+"\t");
			if (k!=8) {System.out.print((k+2)+"*"+j+"="+(k+2)*j+"\t");}
			System.out.println();
			}
			System.out.println();
		}
		
		System.out.println("====while문으로 풀기====");
		int i=1,j=1;
		while(i<4)
		{	
			int k=3*i-1;
			while(j<4)
			{
				System.out.print(k+"*"+j+"="+k*j+"\t");
				System.out.print((k+1)+"*"+j+"="+(k+1)*j+"\t");
				if (k!=8) {System.out.print((k+2)+"*"+j+"="+(k+2)*j+"\t");}
				System.out.println();
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
		System.out.println();

		System.out.println("====do~while문으로 풀기====");
		i=1;j=1;
		do
		{	
			int k=3*i-1;
			do
			{
			System.out.print(k+"*"+j+"="+k*j+"\t");
			System.out.print((k+1)+"*"+j+"="+(k+1)*j+"\t");
			if (k!=8) {System.out.print((k+2)+"*"+j+"="+(k+2)*j+"\t");}
			System.out.println();
			j++;
			} while(j<4);
			i++;
			j=1;
			System.out.println();
		}
		while(i<4);
		System.out.println();

	}

}
