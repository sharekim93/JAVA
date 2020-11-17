package generics;

class Wild001<Integer>{
	private int a;

	public Wild001(int a) {
		super();
		this.a = a;
	}
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}

class Wild002<String>{
	private String a;

	public Wild002(String a) {
		super();
		this.a = a;
	}

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
	
}
class Wild<Object>{
	private Object a;

	@Override
	public String toString() {
		return "Wild2 [a=" + a + "]";
	}

	public Wild(Object a) {
		super();
		this.a = a;
	}

	public Object getA() {
		return a;
	}

	public void setA(Object a) {
		this.a = a;
	}
}

class Wild2<J>{
	private J a;
	public Wild2() {}
	public Wild2(J a) {super();this.a=a;}
	public J getA() {return a;}
	public void setA(J a) {this.a=a;}
}

public class Generics003 {
	public static void main(String[] args) {
		System.out.println("\n[ver-1] 제네릭");
		Wild001<Integer> t1 = new Wild001<Integer>(100);
		
		System.out.println("1-1) 기본 제네릭스를 이용 : "+t1.getA());
		Wild002<String> t2 = new Wild002<String>("abc");
		System.out.println("1-2) 기본 제네릭스를 이용 : "+ t2.getA() +"\n\n\n");
		
		System.out.println("\n[ver-2] 제네릭2");
		Wild2<Object> w20 = new Wild2<Object>(100);
		Wild2<Integer> w21 = new Wild2<Integer>(100);
		
		System.out.println("\n[ver-3] 제네릭  - 변수의 제한");
		Wild2<? extends Number> ten = w21;
		System.out.println(ten.getA());
		//ten = w20; //error Object는 ?의 부모
		
		Wild2<? super Number> ten2 = w20;
		System.out.println(ten2.getA());
		//ten2 = w21; //error Integer는 자식 
		System.out.println(ten2.getA());
		
	}

}
