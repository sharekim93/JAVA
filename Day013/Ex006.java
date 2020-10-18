
public class Ex006 {

	public static void main(String[] args) {
		int su[]= {-3,5,-1,9,-7,2,-11};
		int size=su.length; //5
		int sum=0;
		
		for (int i=0;i<size;i++)
		{
			if(su[i]>0&&su[i]%2==1) {sum+=su[i];}
		}
		System.out.println("양수 중에서 홀수의 합 : " + sum);
		

	}

}
