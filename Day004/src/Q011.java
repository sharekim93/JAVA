
public class Q011 {

	public static void main(String[] args) {
		System.out.println("다음 중 변수를 잘못 초기화 한 것을 모두 고르시오\n"
				+ "a.byte b = 256; \n"
				+ "b.char c =''; \n" // 공백이 있어야 함 반드시!!! Wrong!!
				+ "c.char answer = 'no'; \n" // 문자가 2개 오면 String! Wrong!!
				+ "d.float f = 3.14; \n"
				+ "e.double d = 1.43ef; \n"); // double에 접미사f가 붙어 있는 1.43ef도 가능
		
		System.out.println("Answer = a, b, c, d");

	}

}
