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
		
		//TestB2 test = (TestB2)ta; => 오류가 나는 이유 : ta는 참조변수로서 주소를 가지고 있다. 하지만 TestB2로 선언된 test 참조변수의 생성자를 ta가 호출한 적이 없기 때문에 오류가 발생한다.
		//example : TestB2() 생성자가 없어 b=20과 같은 변수가 초기화 되지 못함.
		//System.out.println(test.a +"\t"+test.b+"\t"+test.toString());
	}

}
