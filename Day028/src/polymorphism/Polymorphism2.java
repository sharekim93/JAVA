package polymorphism;

class TestA2{
	int a=10;
	public TestA2() {super();}
	@Override
	public String toString() {
		return "TestA2 [a=" + a + "]";
	}
}
class TestB2 extends TestA2{
	int b=20;
	public TestB2() {super();}
	@Override
	public String toString() {
		return "TestB2 [b=" + b + "]";
	}
}

class Polymorphism2 {

	public static void main(String[] args) {
		TestA2 ta = new TestA2();
		//TestB2 tb = ta; => 오류가 나는 이유 : 조상클래스인 TestA2로 TestB2를 참조할 수 있으나 반대의 경우는 명시적 형변환을 해야함.
		

	}

}
