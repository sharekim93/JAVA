package Day028.src.polymorphism;

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
		return "Dog [name=" + name + ", animal=" + Arrays.toString(animal) + "]";
	}
	
}

class Cat extends Animal{
	public Cat() {}
	public Cat(String name) {super(name);}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", animal=" + Arrays.toString(animal) + "]";
	}
	
}

class Pig extends Animal{
	public Pig() {}
	public Pig(String name) {super(name);}
	@Override
	public String toString() {
		return "Pig [name=" + name + ", animal=" + Arrays.toString(animal) + "]";
	}
	
}

class ObjectTest2 {
	static Animal[] animal=new Animal[3];
	static{
	animal[0] = new Dog("alpha");
	animal[1] = new Cat("sally");
	animal[2] = new Pig("buja");
	}

	ObjectTest2(){}
	static ObjectTest2 disp(int i) {
		return animal[i];
	}
}

class Polymorphism9 {
	public static void main(String[] args) {
		Dog dog=(Dog)ObjectTest2.disp(1);
		System.out.println(dog);
		Cat cat=(Cat)ObjectTest2.disp(2);
		System.out.println(cat);
		Pig pig=(Pig)ObjectTest2.disp(3);
		System.out.println(pig);
		
	}

}
