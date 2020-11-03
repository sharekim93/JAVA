package polymorphism;

class TestA{
	int a=10;
	public TestA() {super();}
}

class TestB{
	int a=20;
	public TestB() {super();}
}


class Polymorphism1 {
	public static void main(String[] args) {
		TestA ta = new TestA();
		TestB tb = new TestB();
		//TestB tb = ta; => 오류가 나는 이유 : 서로 상속 관계에 있지 않은 객체들을 참조했기 때문. TestA와 TestB는 상속이 아니다.
		//System.out.println(tb.a);

		 
		
	}

}
