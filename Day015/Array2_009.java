
public class Array2_009 {

	public static void main(String[] args) {
		float fl[][]= {
				{1.1f,1.2f,1.3f},
				{2.1f,2.2f,2.3f}};
		System.out.println(":::: 출력된 화면");
		for(int i=0;i<fl.length;i++)
		{
			for(int j=0;j<fl[i].length;j++)
			{
				System.out.print(fl[i][j]+" ");
			}
			System.out.println();
		}

	}

}
