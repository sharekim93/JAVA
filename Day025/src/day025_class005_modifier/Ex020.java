package day025_class005_modifier;

// 섯다카드의 숫자와 종류는 한 번 값이 지정되면(isKwang) 변경되어서는 안 되는 값이다.
// 카드의 숫자가 한 번 잘못 바뀌면 똑같은 카드가 두 장이 될 수 있기 때문이다.
// 이러한 문제점이 발생하지 않도록 아래의 코드를 수정하시오

class SutdaCard14{
	final int NUM;			
	final boolean IS_KWANG; 
	
	SutdaCard14(){
		this(1,true);
	}
	SutdaCard14(int num, boolean isKwang){
		this.NUM=num;
		this.IS_KWANG=isKwang;
	}
	
	@Override
	public String toString() {
		return NUM + (IS_KWANG ? "K": "");
	}
}

public class Ex020 {

	public static void main(String[] args) {
		SutdaCard14 s = new SutdaCard14();
		System.out.println(s);
	}

}
