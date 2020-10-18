
public class Ex007 {

	public static void main(String[] args) {
		int su[]= {-3,-5,-1,-9,-7};
		int sie=su.length;//5
		int rank=1;
		
		for(int i=0;i<su.length;i++)
		{
			if (su[i]>su[4]) {rank++;}
		}
		System.out.println("su[4]요소의 등수 : "+rank);

	}

}
