
public class Ex001 {
	public static void main(String[] args) {
		/*1. 자동 형변환
		 * 작은 타입의 데이터형은 큰 타입의 데이터형으로 아무런 작업 없이 변환할 수 있다.
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 실수형 : float, double
		*/
			byte b = 10; int a;
			a = b ; //a에 b를 대입
		
		/* 아래 코드가 실행 가능한가?
		 * Q1.int a2=3;  long lo = a2;
		 * Q2.a2=lo;
		 * Q3.float fl = 1.2f; double d = f1;
		 * Q4.fl=d;
				
		 * A1.a2는 가능. lo는 는 int a2로 먼저 선언 되었다면 가능. 단독으로는 long이 정수형으로 불가
		 * A2.a2에 대한 정의가 없어 불가. Q1에 대한 연장선으로 생각했을 때도 a2(int)에 lo(long) 대입 불가.
		 * A3.fl은 가능. d는 double이 실수형으로 불가. 연장선으로는 double에 float 가능.
		 * A4.float에 double 대입 불가.
		*/
		
		/*2. 강제 형변환
		 * Q5. 강제형변환을 이용해서 다음과 같은 결과가 나오게 만들어주세요
		 * System.out.println(1.5+2.7); // 3
		*/
			System.out.println((int)(1.5) + (int)(2.7)); // 3
			System.out.println((int)(1.5 + 2.7)); // 4
	} //end main
} //end class
