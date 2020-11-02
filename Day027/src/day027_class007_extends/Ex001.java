package day027_class007_extends;


class CA{
	private int a;
	CA(){super();}
	
	@Override
	public String toString() {
		return "[CA()} 1. CA 안의 a변수 : 인스턴스 a를 사용할 수 있게 생성자가 초기화\n\tA [A="+this.a+"]" ;
	}
}
class CB extends CA{
	private int b;
	CB(){super();}
	
	@Override
	public String toString() {
		return super.toString()+"\n[CB()} 1. CB 안의 b변수 : 인스턴스 b를 사용할 수 있게 생성자가 초기화\n\tB [B="+this.b+"]";
	}
}


public class Ex001 {
	public static void main(String[] args) {
		System.out.println("1-1. 상속이란 객체를 재활용하는 것이 목적임.");
		System.out.println("1-2. 상속을 하려면 기존의 어떤 클래스가 먼저 생성되어야 함.");
		System.out.println("1-3. 클래스 생성순서 Object > CA > CB");
		CB fishbread = new CB();
		System.out.println(fishbread);
	}

}
