
public class Ex003 {

	public static void main(String[] args) {
		// 삼항연산자를 이용하여 양수, 음수, 0을 체크하는 코드를 작성하시오.
		
		int num = 10;
		System.out.println((num>0)? "양수":
							((num<0)? "음수":0));

	}

}
