
/* 문제
	1. 인스턴스 변수와 클래스 변수를 고르시오
	- 인스턴스 변수 : a
	- 클래스 변수 : COMPANYNAME
	
	2. 각각의 변수가 Runtime Data Area에서 저장되는 위치를 적으시오
	- 인스턴스 변수 a : Heap Area
	- 클래스 변수 COMPANYNAMAE : Method Area
	
	3. 다음과 같이 출력하시오
*/


public class Class026 {
	int a;
	public static final String COMPANYNAME ="(주) 프로그램 시작부터 종료까지";
	public static void main(String[] args) {
	
	Class026 c = new Class026();
	System.out.println("클래스 변수 - "+COMPANYNAME);	
	System.out.println("인스턴스 변수 - "+ c.a);
	}
	
	Class026(){}
}
