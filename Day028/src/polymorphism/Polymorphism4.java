package polymorphism;

class TestA4{
	int a=10;
	public TestA4() {super();}
	@Override
	public String toString() {
		return "TestA4 [a=" + a + "]";
	}
}

class TestB4 extends TestA4{
	int b=20;
	public TestB4() {super();}
	@Override
	public String toString() {
		return "TestB4 [b=" + b + "]";
	}
}

class Polymorphism4 {
	public static void main(String[] args) {
		TestA4 ta = new TestA4();
		TestB4 tb = new TestB4();
		//tb = ta; => 오류가 나는 이유 : 하위 클래스로 상위 클래스를 참조하기 위해서는 명시적 형변환 (TestB4)를 수행해야 한다.

	}

}
