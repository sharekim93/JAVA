
public class Method001 {
	
	public static void hi(int x) {
		for(int i=0;i<x;i++) {
		System.out.println("Hi");}
		}
	public static void line() {System.out.println("==========================");}
	// public : 접근 연산자. 어디서든 접근
	// static : Method001 Class 내에서 공용으로 사용 가능
	// void : return 값. {} 안에 처리한 값 
	// Parameter : () 안에 입력

	public static void main(String[] args) {

		/*
		 * 1. 메서드의 개요
		 * - 코드의 재사용
		 * - 실행하고자 하는 명령어들을 한꺼번에 모아 놓고 함수 이름이 호출되면 실행되는 기능
		 * - fuction, 메서드, 멤버함수
		 * 
		 * 2. 사용법
		 * 2-1. 함수정의
		 * 2-2. 함수호출
		 * 
		 * - 함수를 호출했는데 함수 정의가 없으면 오류가 발생
		 * - 함수 정의만(2-1)하고 호출하지 않으면(2-2) 문제가 발생하지 않음
		 * 
		 * 3. 메서드 이름 작성 규칙
		 * - 처리하는 내용의 의미를 담아서 작성
		 * - 함수의 첫 글자는 (소)문자 ※클래스명의 첫 글자 : (대)문자
		 * ★ main() 함수 안에서 함수 정의 불가능
		 * 
		 * 4. 종류
		 * 1) 함수 기본 구조
		 * 2) Parameter(매개변수, 인수인자) 전달값
		 * 3) return
		 * 4) 오버로딩
		 * 5) 재귀함수
		 */
		
		//2-1. 함수정의
		System.out.println("\n\n[ver-1]");
		
		System.out.println("Hi");
		System.out.println("Hi");
		System.out.println("Hi");
		
		System.out.println("\n\n[ver-2]");
		line();
		hi(3);
		
	}

}
