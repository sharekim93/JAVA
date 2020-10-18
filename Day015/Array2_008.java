
public class Array2_008 {

	public static void main(String[] args) {
		float fl[][]= {
				{1.1f,1.2f,1.3f},
				{1.4f,1.5f,1.6f}};
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
