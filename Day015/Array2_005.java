
public class Array2_005 {

	public static void main(String[] args) {
		char ch1[][]= {
				{'A','B','C'},
				{'D','E','F'}};
		System.out.println(":::: 출력된 화면");
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
