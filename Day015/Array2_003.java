
public class Array2_003 {

	public static void main(String[] args) {
		int da2[][]= {
				{100,200,300},
				{400,500,600}};
		System.out.println(":::: 출력된 화면");
		for(int i=0;i<da2.length;i++)
		{
			for(int j=0;j<da2[i].length;j++)
			{
				System.out.print(da2[i][j]+" ");
			}
			System.out.println();
		}

	}

}
