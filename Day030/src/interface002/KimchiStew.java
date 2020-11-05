package interface002;

class KimchiStew implements Launch {
	static int price =4000;
	@Override
	public void eat() {System.out.println("KimchiStew 냠냠!");}
	
	@Override
	public String toString() {
		return "KimchiStew";
	}

	
	
}
