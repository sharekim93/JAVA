
class Coffee {
	// 1.멤버변수
	String name;
	int price;
	// 2. 멤버함수
	void show() {
		System.out.println("===== 커피\n커피명 : " + name + "\n커피가격 : " + price);
	}
}
public class Class003 {

	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		coffee.name="아메리카노";
		coffee.price=2000;
		
		coffee.show();

	}

}
