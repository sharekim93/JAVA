package inner_anonymous;

interface Animal{
	public void eat();
	public void sleep();
	public void poo();
}
class Monkey implements Animal{
	public void eat() {
		System.out.println("바나나 냠냠!");
	}
	
	public void sleep() {
		System.out.println("House 에서 자요");
	}
	
	public void poo() {
		System.out.println("시원해요");
	}
}

public class Anonymous002 {
	public static void main(String[] args) {
		Animal ani = new Monkey();
		ani.eat();
		ani.sleep();
		ani.poo();
		
		Animal ani2 = new Monkey() {
			@Override public void eat() {System.out.println("바나나 냠냠!");}
			@Override public void sleep() {System.out.println("House에서 자요");}
			@Override public void poo() {System.out.println("시원해요");}
		};
		ani2.eat();
		ani2.sleep();
		ani2.poo();
	}
}
