
public class Q012 {

	public static void main(String[] args) {
		System.out.println("다음 중 main 메서드의 선언부로 알맞은 것을 모두 고르시오 \n"
				+ "a. public static void main(String[] args)\n"
				+ "b. public static void main(String args[])\n"
				+ "c. public static void main(String[] arv)\n" // args든 arv든 다르지 않음
				+ "d. public void static main(String[] args)\n"
				+ "e. static public void main(String[] args)\n");
		
		System.out.println("Answer : a, b, c, e");

		
		/*
		 * public static void main(String[] args)
		 * public : 접근자
		 * static : 정적 메소드. 정적으로 실행하면 프로그램 실행 시 자동으로 메모리에 적재됨.
		 * void : 리턴값. main 메소드가 끝나면 프로그램 종료
		 * main : 함수이름
		 * (String[] args) : 파라미터
		 * # https://blog.naver.com/shekwl24/222027950484
		 */
	}

}
