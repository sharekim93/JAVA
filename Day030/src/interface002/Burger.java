package interface002;

class Burger implements Launch {
	static int price;
	
	Burger(){Burger.price=3900;}
	@Override
	public void eat() {
		System.out.println("Burger 냠냠!");
	}
	@Override
	public String toString() {
		return "Burger";
	}
	
	

}
