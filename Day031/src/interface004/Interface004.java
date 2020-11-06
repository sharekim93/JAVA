package interface004;

interface Order{void order();}
interface Best {void best();}
interface OTime {void otime();}
interface Using extends Order,Best, OTime{}

class A{
	
}

class Mymilk1 extends A implements Using {

	@Override
	public void otime() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void best() {
		// TODO Auto-generated method stub
		
	}
	
}

class Interface004 {
	public static void main(String[] args) {
		Mymilk1 milk = new Mymilk1();
		if(milk instanceof A) {System.out.println("milk에 A가 포함");

	}

}
}
