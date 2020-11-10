package inner_anonymous;

class Outer002{
	class Inner{
		int iv=100;
	
	}
}

public class Inner002 {
	public static void main(String[] args) {
		Outer002.Inner inner = new Outer002().new Inner();
		System.out.println(inner.iv);
	}
}
