
public class Method004 {

	public static void test1 (int n) {
		System.out.println(n);
	}
	public static void test2 (double n) {
		System.out.println(n);
	}
	public static void hap (int i, int j) {
		int sum=0;
		for (int n=i;n<=j;n++)
		{sum+=n;}
		System.out.println(sum);
	}
	public static void disp(int i, char j) {
		for(int n=0;n<i;n++)
		{
			System.out.print(j);
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		test1(50);
		test2(1.2);
		hap(3,5);
		disp(7,'*');
		disp(2,'♥');

	}

}
