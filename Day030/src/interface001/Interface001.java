package interface001;

interface Animal{
	String name="홍길동"; //자동으로 static final 선언이 됨
	void eat(); // public abstract 처리가 됨
}

class Saram implements Animal{
	
	public void eat() {
		System.out.println(name+" is free");
	}
}

class Interface001 {

	public static void main(String[] args) {
		System.out.println(Animal.name);
		
		Saram one = new Saram();
		one.eat();
	}

}
