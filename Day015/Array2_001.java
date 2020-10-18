
public class Array2_001 {

	public static void main(String[] args) {
		String arr[][]= new String[2][4];
		
		for (int i=0;i<arr.length;i++)
		{
			arr[i][0]="["+i+"층"+"]";
			System.out.print(arr[i][0]+"\t");
			for(int j=0;j<arr[i].length-1;j++)
			{
				arr[i][j]="["+i+"-"+j+"호실]";
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

}
