package polymorphism;

class TestPapa extends Object{
	int money =10000;
	public TestPapa() {super();}
	public void sing() {System.out.println("남행열차");}
}

class TestSon extends TestPapa{
	int money= 1500;
	public TestSon() {super();System.out.println("TestSon");}
	@Override
	public void sing() {System.out.println("안녕-폴킴");}
}
	
public class polymorphism5_test {
	public static void main(String[] args) {
		TestPapa papa = new TestSon();
		// 1. papa가 쓸 수 있는 인스턴스 변수 : money
		// 2. TestSon() 생성자를 호출해서 초기화 단계 체크. System.out.println("TestSon");
		
		System.out.println(papa.money); //10000
		System.out.println(((TestSon)papa).money); //1500;
		papa.sing(); //"안녕-폴킴"

	}

}
