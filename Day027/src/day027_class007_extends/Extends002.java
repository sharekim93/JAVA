package day027_class007_extends;

class Color{
	private String name;
	
	Color(){super();}
	
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
}

class Green extends Color{
	int num;
	
	Green(){super();}
	
	void show() {
		System.out.println("::::: GREEN\n= NAME : "+super.getName()+"= NUM : "+this.num);
	}
}

public class Extends002 {

	public static void main(String[] args) {
		Green mygreen = new Green();
		mygreen.setName("LIGHT_GREEN");
		mygreen.num = 5;
		mygreen.show();

	}

}
