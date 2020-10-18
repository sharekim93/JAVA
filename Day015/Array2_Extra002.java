
public class Array2_Extra002 {

	public static void main(String[] args) {
		int arr[][]  = new int[5][5];
		
		int num=1,max=arr.length-1,min=0;
		int i=0,j=0;
		boolean x=true,y=true;
		while(num<=arr.length*arr[0].length)
		{
			arr[i][j]=num;
			num++;
			if(x==true&&y==true) {
				j++;
				if(j==max) {y=false;}
					} 
			else if(x==true&&y==false) {
				i++;
				if(i==max) {x=false;}
			}
			else if(x==false&&y==false) {
				j--;
				if(j==min) {y=true;min++;}
			}
			else if(x==false&&y==true) {
				i--;
				if(i==min) {x=true;max--;}
			}
		}
		
		for(int k =0;k<arr.length;k++)
		{
			for(int l=0;l<arr[k].length;l++)
			{
				System.out.print(arr[k][l]+"\t");
			}
			System.out.println();
		}
	}
}
