package polymorphism;

class TestA3{
	int a=10;
	public TestA3() {super();}
	@Override
	public String toString() {
		return "TestA3 [a=" + a + "]";
	}
}

class TestB3 extends TestA3{
	int b=20;
	public TestB3() {super();}
	@Override
	public String toString() {
		return "TestB3 [b=" + b + "]";
	}
}

class Polymorphism3 {
	public static void main(String[] args) {
		TestA3 ta = new TestA3();
		TestB3 tb = new TestB3();
		ta = tb;
		//System.out.println(ta.a + "/"+ta.b); TestA3 ta = new TestB3();로 선언된 거나 마찬가지로, ta는 TestB3()의 인스턴스 변수를 사용할 수 없다.

	}

}
