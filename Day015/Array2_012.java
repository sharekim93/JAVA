
public class Array2_012 {

	public static void main(String[] args) {
		int[][] da1=new int [2][3];
		
		int num=11;
		for(int i=0;i<da1.length;i++)
		{
			for(int j=0;j<da1[i].length;j++)
			{
				da1[i][j]=num;
				num++;
			}
		}

		
		for(int i=0;i<da1.length;i++)
		{
			for(int j=0;j<da1[i].length;j++)
			{
				System.out.print(da1[i][j]+" ");
			}
			System.out.println();
		}
	}

}
