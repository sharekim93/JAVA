
public class Array2_015 {

	public static void main(String[] args) {
		char[][] ch1=new char[2][3];
		char ch='A';

		for(char i=0;i<ch1.length;i++)
		{
			for(char j=0;j<ch1[i].length;j++)
			{
				ch1[i][j]=ch;
				ch++;
			}
			
		}

		
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch1[i].length;j++)
			{
				System.out.print(ch1[i][j]+" ");
			}
			System.out.println();
		}
	
	}

}
