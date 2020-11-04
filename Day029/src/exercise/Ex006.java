package Day029.src.exercise;
class Prices{
	public final static int PRICE_AUDIO=50;
	public final static int PRICE_TV=100;
	public final static int PRICE_COMPUTER=200;
	public final static int INITIAL_MONEY=1000;
}

class Product{
	int price;
	public Product() {}
	public Product(int price) {this.price=price;}
}
class Tv extends Product{
	public Tv() {super(Prices.PRICE_TV);}
	@Override
	public String toString() {return "TV";}
}
class Computer extends Product{
	public Computer() {super(Prices.PRICE_COMPUTER);}
	@Override public String toString() {return "Computer";}
}
class Audio extends Product{
	public Audio() {super(Prices.PRICE_AUDIO);}
	@Override public String toString() {return "Audio";}
}
class Buyer {
	int balance,spend;
	Product[] cart;
	public Buyer() {balance=1000;cart = new Product[7];}
	static int cnt=0;
	
	public void buy(Product p) {
		if(this.balance>p.price) {this.balance=this.balance-p.price;}
		else return;
		spend+=p.price;
		cart[cnt++]=p;
		
	}
	public void summary() {
		int num=1;
		String notbuy="";
		boolean first=true;
		
		if(balance-Prices.PRICE_COMPUTER<0) {notbuy+="Computer, ";}
		if(balance-Prices.PRICE_TV<0) {notbuy+="Tv, ";}
		if(balance-Prices.PRICE_AUDIO<0) {notbuy+="Audio ";}
		
		System.out.println(num+".잔액이 부족하여 "+notbuy+"를 살 수 없습니다.");num++;
		System.out.print(num+".구입한 물건 : ");
		for(int i=0;i<cart.length;i++) {
			if(first) {first=false;}
			else System.out.print(",");
			System.out.print(cart[i]);}num++;
		System.out.println();
		System.out.println(num+".사용한 금액 : "+spend);num++;
		System.out.println(num+".남은 금액 : "+(Prices.INITIAL_MONEY-spend));
		}
		
	}

public class Ex006 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		b.summary();
	}

}
