
public class Day014_5 {

	public static void main(String[] args) {
		int arr[]=new int[3] ; 
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(i+1)*1000;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}

}
