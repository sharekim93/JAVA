
public class Ex002 {
	public static void main(String[] args) {
		// 123개의 사과갯수, 바구니에 담을 수 있는 사과 갯수 10
		//필요한 바구니 갯수는?
		int apples =123;
		int boxs = 10;
		
		boxs = apples/boxs + ((apples%boxs > 0)? 1:0);
		System.out.println("필요한 바구니의 수  : " + boxs );
	}

}
