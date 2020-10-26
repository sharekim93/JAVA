
class Coffee002 {
	// 멤버변수
	String name;
	int num;
	int price;

	void show() {
		System.out.println("=====커피\n커피명 : " + name + "\n커피잔수 : " + num + "\n커피가격 : " + price);
	}

	// 생성자 오버로딩
	Coffee002() {
		this.name = "아메리카노";
		this.num = 1;
		this.price = 2000;
	}

	Coffee002(String nam, int n, int p) {
		this.name = nam;
		this.num = n;
		this.price = p;
	}

}

public class Class009 {

	public static void main(String[] args) {
		Coffee002 a1 = new Coffee002("카페라떼", 2, 4000);
		a1.show();
		Coffee002 a2 = new Coffee002();
		a2.show();

	}

}
