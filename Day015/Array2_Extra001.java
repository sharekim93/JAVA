
public class Array2_Extra001 {

	public static void main(String[] args) {
		int da3[][] = {
						{10,20,30,0},
						{40,50,60,0},
						{70,80,90,0},
						{0,0,0,0}};
		
		for(int i=0;i<da3.length-1;i++)
		{
			for(int j=0;j<da3[i].length-1;j++)
			{
				da3[i][da3[i].length-1]+=da3[i][j];
				da3[da3.length-1][j]+=da3[i][j];
			}
			da3[da3.length-1][da3[i].length-1]+=da3[i][da3[i].length-1];
		}
		
		for(int i=0;i<da3.length;i++)
		{
			for(int j=0;j<da3[i].length;j++)
			{
				System.out.print(da3[i][j]+" ");
			}
			System.out.println();
		}
	}
}
