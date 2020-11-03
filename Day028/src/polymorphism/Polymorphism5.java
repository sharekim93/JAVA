package polymorphism;

class Papa extends Object{
	int money = 10000;
	public Papa() {super();}
	public void sing() {System.out.println("남행열차");}
} //end Papa

class Son extends Papa{
	int money =1500;
	public Son() {super();}
	
	@Override
	public void sing() {System.out.println("안녕 - 폴킴");}
}// end Son

class Polymorphism5 {
	public static void main(String[] args) {
		Son mypapa = new Son(); //Papa를 Son으로 변경
		System.out.println(mypapa.money);
		mypapa.sing();
		
		
	}
}
