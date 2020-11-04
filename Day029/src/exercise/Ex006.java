package exercise;

class Prices{
	public final static int PRICE_AUDIO=50;
	public final static int PRICE_TV=100;
	public final static int PRICE_COMPUTER=200;
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
	int balance;
	Product[] cart;
	
	public Buyer() {balance=1000;cart = new Product[10];}
	
	public void buy(Product p) {
				
	}
	public void summary() {

		}
		
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
