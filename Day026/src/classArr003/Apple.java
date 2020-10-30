package classArr003;

public class Apple {
	//멤버변수
	private String name;
	private String order;
	private int num;
	private int price;
	
	//멤버함수
	@Override
	public String toString() {
		return "Apple [name=" + name + ", order=" + order + ", num=" + num + ", price=" + price + "]";
	}
	public String getName() {return name;}
	public String getOrder() {return order;}
	public int getNum() {return num;}
	public int getPrice() {return price;}
	public void setName(String name) {this.name = name;}
	public void setOrder(String order) {this.order = order;}
	public void setNum(int num) {this.num = num;}
	public void setPrice(int price) {this.price = price;}
	
	//생성자
	Apple(){
		super();
		this.name="APPLE";
		this.num=1;
		this.price=1000;
		this.order="홍길동";}
	Apple(String name, int num, int price, String order){
		super();
		this.name=name;
		this.num=num;
		this.price=price;
		this.order=order;
	}
	
	
}
