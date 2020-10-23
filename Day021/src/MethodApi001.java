
public class MethodApi001 {

	public static void main(String[] args) {
		System.out.println("001.Math");
		//필수 : 절대값, 큰 수, 작은 수, 랜덤
		//Math.random()   - Math 마우스 올리기 > f2 > 지구본 모양 버튼 클릭 > API로 넘어감

	System.out.println(Math.random());
	System.out.println(Math.PI);
	
	System.out.println(Math.abs(-10));
	System.out.println(Math.abs(-2.1));
	System.out.println(Math.max(10,3));
	System.out.println(Math.min(10,3));
	
	//Q1) int ma=10, mb=20, mc=30; Math.max를 이용해서제일 큰 수 찾기
	int ma=10, mb=20, mc=30;
	System.out.print(Math.max(Math.max(ma,mb),mc));
	
	//Q2) 다음의 결과값을 적어보고 어떤 의미인지 적으시오
	System.out.println(Math.round(1.5f));
	System.out.println("결과 : 2 / 소수점 첫째자리 반올림");
	System.out.println(Math.ceil(1.1f));
	System.out.println("결과 : 2 / 소수점 첫째자리 올림");
	System.out.println(Math.ceil(1.9f));
	System.out.println("결과 : 2 / 소수점 첫째자리 올림");
	System.out.println(Math.floor(1.1f));
	System.out.println("결과 : 1 / 소수점 첫째자리 버림");	
	System.out.println(Math.floor(1.9f));
	System.out.println("결과 : 1 / 소수점 첫째자리 버림");	

	//Q3) 1~45까지의 숫자 랜덤하게 나오게 만들기 Math.random()
	System.out.println((int)(Math.random()*45));
	}
}
