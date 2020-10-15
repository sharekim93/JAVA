
public class Java_문자형 {
	public static void main(String[] args) {
		System.out.println(""+123+456); 
		//결과 123456
		// "" + (출력) 123 + (출력)456
		
		System.out.println("A/t");
		System.out.println("A/tB");
		// 결과 A   B
		
		/*아래 내용을 출력하시오
		 	int True;
		 	int true;  
		 */
		
		System.out.println("True는 가능합니다. 클래스의 경우 첫 글자만 대문자로 쓰는 게 관례이기 클래스로 사용하는 것이 바람직합니다.");
		System.out.println("true의 경우 예약어이기 때문에 불가능합니다.");
	
		/*
		 	변수의 명명규칙
			1) 대소문자가 구분되며 길이에 제한이 없다
			2) 예약어를 사용해서는 안 된다
			3) 숫자로 시작해서는 안 된다.
			4) 특수문자는 _와 $만 허용한다
			
			권장규칙
			1) 클래스 이름의 첫 글자는 항상 대문자로 쓴다
			2) 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다
			3) 상수의 이름은 모두 대문자로 한다. 여러 단어로 이루어진 경우 '_'로 구분한다
		 */
		
		/*
		 1) 값의 종류
			숫자 : (정수) 1,2,3
			문자 : (문자열) 'abc'
			
			2) 자료형
			- 자바에서의 자료형은 기본 자료형과 참조 자료형으로 구분된다.
			- 기본 자료형은 실제 값을 저장. int a = 10;
			- 참조 자료형은 주소를 값으로 가짐. String str = C:\abc\bcd
			- 에러메세지
			undefined : 변수 선언하지 않음
			duplicated : 변수 이중선언
			
			3) 기본 자료형  p.28
			- 논리형 boolean : True / False
			- 정수형 byte short int long /unsigned(양수) signed(음수)
			- 실수형  float double
			- 문자형 char
		 */
	}
}
