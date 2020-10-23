
class MyPrice001 {
	//1.멤버변수
	String name;
	int price;
	//2.멤버함수
	void show() {
		System.out.println("노트 :" +name+",\t가격 : "+price);
	}
}
public class Class002 {

	public static void main(String[] args) {
		MyPrice001 myprice = new MyPrice001();
		
		myprice.name="20";
		myprice.price=100000;
		
		myprice.show();
	}

}
