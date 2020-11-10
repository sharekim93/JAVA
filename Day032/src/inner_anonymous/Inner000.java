package inner_anonymous;

class Outer{
	static int oi=0;
	int oa;
	
	void show() {System.out.println(oi+"-"+this.oa);}
	
	@Override
	public String toString() {
		return "Outer [oa=" + oa + "]";
	}
	public Outer() {}
	
	class Inner{
		int ii1=20;
		public void show2() {System.out.println(ii1);}
		public Inner() {}
	}
	class Inner2{
		int ii2 = 20;
		public void show3() {System.out.println(ii2);}
		public Inner2() {}
		}
}

public class Inner000 {
	public static void main(String[] args) {
		Outer o1 = new Outer();
		System.out.println("1. 객체(toString) : "+o1);
		System.out.println("2. static 변수 "+Outer.oi);
		System.out.println("3. 인스턴스 변수  :" + o1.oa);
		o1.show();
		
		Outer.Inner inner = new Outer().new Inner();
		System.out.println("내부 클래스 멤버 : "+inner.ii1);
		inner.show2();
		
		Outer o2 = new Outer();
		Outer.Inner inner2 = o2.new Inner();
		inner2.show2();
	}
}
