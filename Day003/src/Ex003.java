
public class Ex003 {

	public static void main(String[] args) {
			System.out.println("■ 값의 종류 : 리터럴 / 상수 / 변수");
			System.out.println("1. 리터럴");
			System.out.println("System.out.println(10);"); 
			System.out.println(10); // 리터럴은 그 자체의 값을 의미(교재 p.31)
			System.out.println("System.out.println(\"abc\");"); 
			System.out.println("abc"); // 리터럴 : 10, "abc"
			System.out.println("2.변수"); //변하는 데이터 값을 저장하는 공간
			
			/* 지갑의 변화 예제
			 * 마트 들어가기 전 : 지갑잔액[100,000]
			 * 마트 삼겹살[34,000] : 지갑잔액[66,000]
			 * 마트 와인[20,000] : 지갑잔액[46,000]
			 * 지갑 = 상수, 지갑잔액 = 변수
			 */
			int purse; // 지갑(정수형) - 선언
			purse = 100000; // A = B (같다라는 의미X, B를 A에 대입하다)
			//100000을 purse 공간에 대입하세요
			System.out.println("변수 purse에 들어 있는 값 (마트 가기 전) :" +purse);
			purse = purse -34000;
			System.out.println("변수 purse에 들어 있는 값 (삼겹살 사고) :" +purse);
			
	}

}
