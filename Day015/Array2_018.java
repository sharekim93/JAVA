
public class Array2_018 {

	public static void main(String[] args) {
		float [][] fl=new float[2][3];
		float f=1.1f;
		
		for(int i=0;i<fl.length;i++)
		{
			for(int j=0;j<fl[i].length;j++)
			{
				fl[i][j]=f;
				f+=0.1f;
			}
		}

		
		for(int i=0;i<fl.length;i++)
		{
			for(int j=0;j<fl[i].length;j++)
			{
				System.out.print(String.format("%.1f", fl[i][j])+" ");
			}
			System.out.println();
		}
	
	}

}
