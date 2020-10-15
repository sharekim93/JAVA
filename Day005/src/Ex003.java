
public class Ex003 {

	public static void main(String[] args) {
		/*
		 * 삼항연산자를 이용하여 세 개의 수중에서 최대값 출력하시오
		 * int a=1, b=5, c=3;		 
		 */

		int a=1, b=5, c=3, max=0;
		max = (a>b)? a:b;
		max = (max>c)? max:c;
		System.out.println(max);
	}

}
