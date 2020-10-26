class MyPrice002 {
	// 멤버변수
	String name;
	int price;

	void show() {
		System.out.println("이름 : " + name + "\n가격 : " + price);
	}

	MyPrice002() {
		this.name = "갤럭시노트12";
		this.price = 110000;
	}

}

public class Class008 {

	public static void main(String[] args) {
		MyPrice002 product = new MyPrice002();
		product.show();

	}

}
