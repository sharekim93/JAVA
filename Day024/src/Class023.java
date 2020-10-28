class Sawon{
	int pay=10000;
	static int su=10;
	
	static int basicpay=pay; // 오류나는 이유 1 : 클래스 변수 안에 인스턴스 변수 대입 불가
	static int basicpay2;
	static {basicpay2=20000;}
	
	public static void showSu() {System.out.println(su);}
	public static void showPay() {System.out.println(pay);} // this.pay 오류나는 이유 2 : 클래스 함수 안에 인스턴스 변수 호출 불가
	public void showAll001() {
		System.out.println(su);
		System.out.println(this.pay);
	}
	public static void showAll002() {
		//showAll001(); 오류나는 이유 3 : 클래스 함수 안에 인스턴스 함수 호출 불가 
		System.out.println(pay); // this.pay 오류나는 이유 4 : 클래스 함수 안에 인스턴스 변수 호출 불가
	}
}

public class Class023 {

	public static void main(String[] args) {
		Sawon sola = new Sawon();

	}

}
