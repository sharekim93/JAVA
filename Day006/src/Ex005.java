
public class Ex005 {

	public static void main(String[] args) {
		/* 어떤 숫자가 오든 1의 자리를 1로 바꾸는 코드를 작성하시오
		 * 출력내용 1) 숫자는 333, 변환숫자는 331
		 * 출력내용 2) 숫자는 777, 변환숫자는 771
		 */
		
		int num =333;
		System.out.println("숫자는 331, " + (num - (num%10) + 1));
		
		num =777;
		System.out.println("숫자는 771, " + (num - (num%10) + 1));
		

	}

}
