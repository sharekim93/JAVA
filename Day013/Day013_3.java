
public class Day013_3 {

	public static void main(String[] args) {
		
		//for
		System.out.println("=====for=====");
		for(int i=100;i<400;i+=100)
		{System.out.print(i+"\t");}
		System.out.println();
		
		//while
		System.out.println("=====while=====");
		int i =100;
		while (i<=300)
		{
			System.out.print(i+"\t");
			i+=100;
		}
		System.out.println();
		
		//do while
		System.out.println("=====do while=====");
		i=100;
		do
		{
			System.out.print(i+"\t");
			i+=100;
		} 
		while(i<=300);
		
	}
}
