package review;

public class Classinfo {


	public static int no;
	private int cnt;
	private String name;
	private int price;
	
	public Classinfo(){super();}
	public Classinfo(String name, int price) {
		super();
		cnt=++no;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ORDER" + cnt + " : " + name + "\t" + price;
	}
	
	public int getNo() {
		return no;
	}

	public int getPrice() {
		return price;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
}
