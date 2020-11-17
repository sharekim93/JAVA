package review;

public class Model {
	private String name;
	private int price;

	public Model() {
		super();
	}
	public Model(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return name + "\t" + price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}


}
