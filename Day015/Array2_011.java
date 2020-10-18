
public class Array2_011 {

	public static void main(String[] args) {
		int arr2[][] =new int[2][3];
		
		int data=1;
		for(int i=0;i<arr2.length;i++)
		{
			for( int j=0;j<arr2[i].length;j++)
					{
						arr2[i][j]=data++;
					}
		}
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}

}
