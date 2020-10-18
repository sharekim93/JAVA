
public class Array2_002 {

	public static void main(String[] args) {
		int da1[][] = {
						{10,20,30},
						{40,50,60}
						};
		System.out.println(":::: 출력된 화면");
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
