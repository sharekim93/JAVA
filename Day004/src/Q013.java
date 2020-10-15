
public class Q013 {
	public static void main(String[] args) {
		System.out.println("다음 중 타입과 기본 값이 잘못 연결된 것을 모두 고르시오 \n"
				+ "a.boolean - false \n"
				+ "b.char - '\u0000'\n" // 적혀 있는 게 기본값. ' '(공백)은 꼼수?
				+ "c.float - 0.0 \n" // 접미사 f 필요
				+ "d.int - 0 \n"
				+ "e.long - 0\n" // 접미사 L 필요
				+ "f.String - \"\" \n"); // 기본값 : null
		
		System.out.println("Answer : c, e, f ");
	}
}
