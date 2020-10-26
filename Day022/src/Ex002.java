
class SutdaCard002{
	//멤버변수
	int num;
	boolean isKwang;
	
	//멤버함수
	String info() {
		if(this.isKwang) {return this.num+"k";}
		else return Integer.toString(this.num);
	}
	//생성자
	SutdaCard002(){this.num=1;this.isKwang=true;}
	SutdaCard002(int a, boolean b){this.num=a;this.isKwang=b;}
	
}
public class Ex002 {

	public static void main(String[] args) {
		SutdaCard002 card1 = new SutdaCard002(3,false);
		SutdaCard002 card2 = new SutdaCard002();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}
