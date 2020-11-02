package day027_class007_extends;

class MobileNote7{
	private String iris;
	
	MobileNote7(){super();}

	public void newShow() {System.out.println(":::: NOTE7 새로운기능(Overriding)\n= iris 홍채인식기능!\n= myiris : "+this.iris);}

	public void setIris(String iris) {this.iris = iris;}
	
}

class MobileNote8 extends MobileNote7{
	private String face;
	
	MobileNote8(){super();}

	public void newShow() {
		super.newShow();System.out.println("\n::::NOTE8 새로운기능(Overriding)\n= face 홍채인식기능!\n= face : "+this.face);
	}
	public void setFace(String face) {this.face = face;}
	
}


class MobileNote9 extends MobileNote8{
	private int battery;
	
	MobileNote9(){super();this.battery=24;}
	
	public void newShow() {super.newShow();
	System.out.println("\n::::NOTE9 새로운기능(Overriding) 추가\n= battery 하루종일 사용가능!\n= battery  : "+this.battery);
	}
}

public class Extends003 {
	public static void main(String[] args) {
		MobileNote9 my9 = new MobileNote9();
		my9.setIris("brown");
		my9.setFace("pretty");
		my9.newShow();

	}

}
