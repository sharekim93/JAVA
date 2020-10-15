
public class Ex002 {

	public static void main(String[] args) {
		// 정수형, 문자형의 변환
		// 아스키코드 ASCII code
		// 문자 A , 숫자 65
		System.out.println((int)'A');
		System.out.println((char)65);
		/*
		 * System.out.println('B'); // Q1.대문자 B는 숫자로 변환 시 얼마?
		 * System.out.println('a'); // Q2.소문자 a는 숫자로 변환 시 얼마?
		 * System.out.println(' '); // Q3.' '   는 숫자로 변환 시 얼마?
		 * System.out.println('\r'); // Q4. '\r'는 숫자로 변환 시 얼마?
		
		 * System.out.println('A'); // Q5.대문자 A를 소문자 a로 변환하기
		 * System.out.println('A'-'a'); //Q6. 얼마?
		*/
		
		System.out.println((int)'B'); 
		System.out.println((int)'a'); 
		System.out.println((int)' '); 
		System.out.println((int)'\r');
		
		System.out.println((char)('A'+32));
		System.out.println('A'-'a');
		
		/* A1. 66
		 * A2. 97
		 * A3. 32
		 * A4. 13
		 * A5. (char) ('A'+32))
		 * A6.-32
		 */
		
		/* Q7. 아래의 변수를 이용하여 10 + 3 = 13 로 출력하시오
		 * int a = 10; int b =3; char op = '+';
		 */		
		int a = 10; int b =3; char op = '+';
		System.out.println("" + a + op + b + "=" + (a + b) );
	}
}
