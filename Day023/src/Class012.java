
class Mobile003{
	//멤버변수
	String company, product;
	int price;
	
	//멤버함수
	void show() {
		System.out.println("--- Mobile_ver3 ===\n회사 : "
							+this.company+"\n제품 : "
							+this.product+"\n가격 : "
							+this.price+"원");
	}
	void sale() {
		this.price=(int)(Math.round(this.price*0.9));
	}
	//생성자
	Mobile003(){
		this.company="Samsung";
		this.price=1200000;
		this.product="NOTE9";
	};
	Mobile003(String company, int price, String product){
		this.company=company;
		this.price=price;
		this.product=product;
	}
	
}

public class Class012 {

	public static void main(String[] args) {
		Mobile003 mobile3 = new Mobile003("Samsung",10000,"NOTE20");
		mobile3.show();
		// 1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수 : name, price, product
		// 2. new : 공간 빌리기. 인스턴스 생성
		// 3. Mobile003("Samsung",10000,"NOTE20") => 인스턴스 변수에 [name="Samsung",price=10000,product="NOTE20"] 셋팅됨.
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 가지고 있는 것 : mobile3
		// 5. 회사, 제품, 가격 출력
		
		Mobile003 mobile2 = new Mobile003();
		mobile2.show();
		// 1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수 : name, price, product
		// 2. new : 공간 빌리기. 인스턴스 생성
		// 3. Mobile003() => 인스턴스 변수에 [name="Samsung",price=1200000,product="NOTE9"] 셋팅됨.
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 가지고 있는 것 : mobile2
		// 5. 회사, 제품, 가격 출력
		
		Mobile003 mobile1 = new Mobile003();
		mobile1.company = "Samsung";
		mobile1.price = 1000000;
		mobile1.product = "NOTE20";
		mobile1.sale();
		mobile1.show();
		// 1. Mobile003라는 자료형으로 만들 수 있는 인스턴스 변수 : name, price, product
		// 2. new : 공간 빌리기. 인스턴스 생성
		// 3. Mobile003() => 인스턴스 변수에 [name="Samsung",price=1200000,product="NOTE9"] 셋팅됨.
		// 4. 인스턴스 변수를 사용할 수 있게 주소를 가지고 있는 것 : mobile2
		// 5. mobile1.company,mobile1.price,mobile1.product => 각각 company,price,product에 "Samsung",1000000,"NOTE20"대입
		// 6. mobile1.sale() => 인스턴스 변수 price에 (int)price*0.9 대입
		// 7. 회사, 제품, 가격 출력

	}

}
