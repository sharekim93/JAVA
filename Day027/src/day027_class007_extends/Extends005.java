package day027_class007_extends;

/*
	1. line 메서드를 완성하시오 : Static을 붙여 인스턴스 생성 없이도 호출 가능하도록 함
	2. 
		1) Fruit 호출 시 : Fruit 생성자가 static line에 추가되어 출력
		2) apple 호출 시 : Apple 생성자가 static line에 추가되어 출력
		3) appleJam 호출 시 : AppleJam 생성자가 static line에 추가 되어 출력
	3. 
	========================================
	:: Fruit 생성자
	========================================
	:: Fruit 생성자
	:::: Apple 생성자
	========================================
	:: Fruit 생성자
	:::: Apple 생성자
	::::: AppleJam 생성자

*/
class Fruit extends Object{
	public static void line() {
		System.out.println("========================================");
	}
	Fruit(){System.out.println(":: Fruit 생성자");}
}// end Fruit

class Apple extends Fruit{
	Apple(){super();System.out.println(":::: Apple 생성자");}
}// end Apple

class AppleJam extends Apple{
	AppleJam(){super();System.out.println("::::: AppleJam 생성자");}
}// end AppleJam
	
public class Extends005 {
	public static void main(String[] args) {
		Fruit.line();
		Fruit fruit = new Fruit();
		
		Fruit.line();
		Apple apple = new Apple();
		
		Fruit.line();
		AppleJam appleJam = new AppleJam();
	}
}
