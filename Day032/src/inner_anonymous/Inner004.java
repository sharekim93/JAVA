package inner_anonymous;

class Outer004{
	int value=10;
	class Inner{
		int value =20;
		
		void method1() {
			int value= 30;
			System.out.println(value);
			System.out.println(this.value);
			System.out.println(Outer004.this.value);
		}
	}
}

public class Inner004 {
	public static void main(String[] args) {
		System.out.println("다음과 같은 실행결과를 얻도록 코드를 완성하시오");
		Outer004 outer = new Outer004();
		Outer004.Inner inner = outer.new Inner();
		inner.method1();
	}

}
