package day027_class007_extends;

class Parent extends Object{
	int i,j;
	public Parent() {
		super();// object 호출
	}
	public Parent(int i, int j) {
		super();// object 호출
		this.i=i;
		this.j=j;
	}
}

class Child extends Parent{
	int k;
	public Child() {
		super(); // Parent의 생성자 호출
	}
	public Child(int i, int j, int k) {
		super(i,j); // Parent(i,j) 생성자 호출
		this.k=k;
	}
}


public class Extends007 {
	public static void main(String[] args) {
		Child child = new Child(10,20,30);
		System.out.println(child.i);
		System.out.println(child.j);
		System.out.println(child.k);
	}

}
