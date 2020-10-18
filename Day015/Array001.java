
public class Array001 {

	public static void main(String[] args) {
		int a =10;
		int [] arr = {1,2,3};
		int [][] arr2 = {
						{1,2,3},
						{4,5,6}
						};
		
		System.out.println("arr2배열의 행의 수: "+arr2.length);
		System.out.println("0행의 열 수 : " +arr2[0].length);
		
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}

	}

}
