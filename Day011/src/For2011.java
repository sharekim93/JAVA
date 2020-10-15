
public class For2011 {

	public static void main(String[] args) {
		
		System.out.println("====for문 이용====");
		for (char a='Z';a>='A';a--)
		{
			for(char b='A';b<=a;b++)
			{System.out.print(b);}
			System.out.println();
		}
		
		System.out.println("====while문 이용====");
		char a='Z',b='A';
		while(a>='A')
		{
			while(b<=a)
			{System.out.print(b);b++;}
			System.out.println();
			b='A';
			a--;
		}
		
		System.out.println("====do~while문 이용====");
		a='Z';b='A';
		do
		{
			do
			{System.out.print(b);b++;}
			while(b<=a);
			System.out.println();
			b='A';
			a--;
		}while(a>='A');
		
	}

}
