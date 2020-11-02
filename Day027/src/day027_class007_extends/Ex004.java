package day027_class007_extends;

// Q4. 다음 코드를 실행했을 때 호출되는 생성자의 순서과 실행결과를 적으시오.
// A4. x=0 > x=3000 > x=1000 > x=100 > x=200 
// 실행결과 : X=200
class Parent_Ex1{
	int x=100;
	Parent_Ex1(){this(200);}
	Parent_Ex1(int x ){this.x=x;}
	int getX() { return x;}
}

class Child_Ex1 extends Parent_Ex1{
	int x=3000;
	Child_Ex1(){this(1000);}
	Child_Ex1(int x){this.x=x;}
}

public class Ex004 {
	public static void main(String[] args) {
		Child_Ex1 c= new Child_Ex1();
		System.out.println("X="+c.getX());
	}//end main
}//end Ex004
