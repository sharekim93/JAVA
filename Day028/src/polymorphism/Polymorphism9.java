import java.util.Arrays;

class Animal extends ObjectTest2{
	String name;
	public Animal() {}
	public Animal(String name) {super();this.name=name;}
}

class Dog extends Animal{
	public Dog() {}
	public Dog(String name) {super(name);}
	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name) {super(name);}
	@Override
	public String toString() {
		return "Cat [name=" + name + "]";
	}
	
}

class Pig extends Animal{
	public Pig() {}
	public Pig(String name) {super(name);}
	@Override
	public String toString() {
		return "Pig [name=" + name + "]";
	}
	
}

class ObjectTest2 {
	static Object disp(int i){
		Object result = new Object();
		switch(i) {
		case 1 : result = new Dog("alpha");break;
		case 2 : result = new Cat("sally");break;
		case 3 : result = new Pig("buja");break;
		}
		return result;
	}
}

public class Polymorphism9 {
	public static void main(String[] args) {
		Dog dog=(Dog)ObjectTest2.disp(1);
		System.out.println(dog);
		Cat cat=(Cat)ObjectTest2.disp(2);
		System.out.println(cat);
		Pig pig=(Pig)ObjectTest2.disp(3);
		System.out.println(pig);
		
	}

}
