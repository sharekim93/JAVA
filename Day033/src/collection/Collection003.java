package collection;

import java.util.Arrays;
import java.util.Vector;

class ColorInfo{
	@Override
	public String toString() {
		return price + "," + name;
	}
	static int no;
	private int price;
	private String name;
	
	ColorInfo(){super();}
	ColorInfo(String name, int price){super();this.no=this.no++;this.name=name;this.price=price;}
	
	public int getPrice() {return price;}
	public String getName() {return name;}
	public void setPrice(int price) {this.price = price;}
	public void setName(String name) {this.name = name;}
	
}

public class Collection003 {
	public static void main(String[] args) {
		Vector mycolor = new Vector();
		mycolor.add(new ColorInfo("Red",1000));
		mycolor.add(new ColorInfo("Yellow",1200));
		mycolor.add(new ColorInfo("Green",1500));

		System.out.println(mycolor.toString());
	}

}
