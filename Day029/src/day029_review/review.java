package day029_review;

class Papa{
	int money=10;
	public Papa() {}
	public Papa(int money) {this.money=money;}
	@Override
	public String toString() {
		return "Papa [money=" + money + "]";
	}
}

class Son extends Papa{
	int money=150;
	int car=2;
	public Son() {super();}
	public Son(int money) {this.money=money;}
	public Son(int money, int car) {this.money=money;this.car=car;}
	@Override
	public String toString() {
		return "Son [money=" + money + ", car=" + car + "]";
	}
	
}

class review {

	public static void main(String[] args) {
		Papa p4 = new Son();
		System.out.println(p4);

		Papa p5 = new Son();
		Son s5 = (Son)p5;
		System.out.println(s5);
	}

}
