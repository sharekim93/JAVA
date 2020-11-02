package day027_class007_extends;


//Q. 컴파일 시 오류가 나는 이유? 조상 클래스인 Product의 기본 초기화가 되어 있지 않아서.(파라미터가 필수인 초기화로 작성 되어 있음)

class Product {
	int price;
	int bonusPoint;
	
	Product(){super();}
	Product(int price){
		this.price=price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){super();} // Product class의 기본 초기화가 되어 있지 않다.
	public String toString() {
		return "TV";
	}
}


public class Ex002 {
	public static void main(String[] args) {
		Tv t = new Tv();
	}

}
