package day029_Abstract;

abstract class Animal0{
	String name;
	int  age;
	
	public Animal0() {}
	public Animal0(String name,int age) {super();this.name=name;this.age=age;}
	
	public abstract void eat();
	public abstract void sleep();
	public abstract void poo();
}

class Cat0 extends Animal0{
	public void eat() {System.out.println("□ CAT : 식사 ");}
	public void sleep() {System.out.println("□ CAT : 수면");}
	public void poo() {System.out.println("□ CAT : 화장실");}
	@Override
	public String toString() {
		return "Cat0 [name=" + name + ", age=" + age + "]";
	}
}

public class Abstract001 {
	public static void main(String[] args) {
		Cat0 cat = new Cat0();
		cat.age=10; cat.name="Sally";
		cat.eat(); cat.sleep(); cat.poo();
		System.out.println(cat);
	}

}
