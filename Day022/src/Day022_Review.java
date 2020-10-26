
//1. OOP의 full term 을 적으시오.
// OOP : Obeject Oriented Program

//2. 객체지향 프로그램에 대해 정의를 내리시오
// 현실의 각 객체를 프로그램으로 구현하는 것

//3. Class vs Object vs Instance 의 차이점을 적으시오
// Class : 설계도. 그 자체가 객체가 아닌 객체를 형성하게 하는 것
// Object : 틀. Instance로 구현되지 않은 상태
// Instance : Class에 의해 형성된 객체

class Day022{
	String name;
	int price;
	
	void show() {
		System.out.println("===== 커피\n커피명 : "+name +"\n커피가격 : "+price);
	}
}


public class Day022_Review {
	
	public static void main(String[] args) {
		Day022 test = new Day022();
		test.name = "아메리카노";
		test.price = 2000;
		test.show();
	}

}
