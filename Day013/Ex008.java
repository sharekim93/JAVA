
public class Ex008 {

	public static void main(String[] args) {
		int su[] = {-3,-5,-1,-9,-7};
		int size=su.length;
		int max=su[0];
		int min=su[0];
		
		for(int i=0;i<size;i++)
		{
			if(su[i]>max) {max=su[i];}
			if(su[i]<min) {min=su[i];}
		}
		
		System.out.println("최대값 :"+max+"\n"+"최소값 :"+min);
	}
}
