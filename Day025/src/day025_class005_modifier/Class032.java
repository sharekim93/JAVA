package day025_class005_modifier;

class Milk{
	private int mon;
	private String mname;
	private int mprice;
	
	//생성자
	Milk(){}
	
	//toString
	@Override
	public String toString() {
		return "Milk [mon=" + mon + ", mname=" + mname + ", mprice=" + mprice + "]";
	}

	//getta, setta
	public int getMprice() {
		return mprice;
	}

	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
}

public class Class032 {

	public static void main(String[] args) {
		Milk m1 = new Milk();
		System.out.println(m1);
		m1.setMprice(2000);
		System.out.println(m1);
	}

}
