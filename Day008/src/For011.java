
public class For011 {

	public static void main(String[] args) {
		// 1~10중에서 짝수의 합계?
		
		int i=0,j=0;
		boolean start = true;
		for (i=1;i<=10;i++)
		{
			if (i%2==0){
				j+=i;
				if (start) {start=false;}
				else {System.out.print("+");}
				System.out.print(i);
				}
		}
		System.out.println("=" + j);
	}

}
