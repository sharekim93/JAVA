package inner_anonymous;

class Outer003{
	static class Inner{
		int iv=200;
	}
}

public class Inner003 {
	public static void main(String[] args) {
		Outer003.Inner in = new Outer003.Inner();
		System.out.println(in.iv);
	}
}
