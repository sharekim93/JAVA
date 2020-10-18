
public class Day014_3 {

	public static void main(String[] args) {
		
		//for
		for(int i=110;i<140;i+=10)
		{System.out.print(i+"\t");}
		
		System.out.println();

		//while
		int j=110;
		while(j<140)
		{
			System.out.print(j+"\t");
			j+=10;
		}
		System.out.println();
		//do ~while

		int i=110;
		do
		{
			System.out.print(i+"\t");
		i+=10;
		}
		while(i<140);
	}

}
