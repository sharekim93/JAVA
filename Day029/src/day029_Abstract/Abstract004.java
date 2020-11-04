package day029_Abstract;

abstract class Milk_a{
	String name;
	public abstract void drink();
	public void welcome() {System.out.println("WELCOME! GREEN MILK");}
}

class WhiteMilk_a extends Milk_a{
	WhiteMilk_a(){super();super.name="흰우유";}
	public void drink() {
		System.out.println(super.name+"를 주문하셨습니다.");
	}
}

class ChocoMilk_a extends Milk_a{
	ChocoMilk_a(){super();super.name="초코우유";}
	public void drink() {
		System.out.println(super.name+"를 주문하셨습니다.");	}
}	

class BananaMilk_a extends Milk_a{
	BananaMilk_a(){super();super.name="바나나우유";}
	public void drink() {
		System.out.println(super.name+"를 주문하셨습니다.");
	}
}

public class Abstract004 {
	public static void main(String[] args) {
		Milk_a m11 = null;
		m11 = new WhiteMilk_a(); m11.welcome(); m11.drink();
		m11 = new ChocoMilk_a(); m11.drink();
		m11 = new BananaMilk_a(); m11.drink();
		
	}

}
