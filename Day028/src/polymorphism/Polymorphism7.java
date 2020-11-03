package polymorphism;

/*
	출력되는 화면
	p.x = 100
	Child Method
	c.x = 200
	Child Method

*/
class Parent{
	int x=100;
	void method() {System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x=200;
	void method() {System.out.println("Child Method");}
}

class Polymorphism7 {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		System.out.println("p.x = "+p.x);
		p.method();
		System.out.println("c.x = "+c.x);
		c.method();
	}//end main
}//end class
