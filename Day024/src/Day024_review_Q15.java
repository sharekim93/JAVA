
class Car1{
	//멤버변수
	String color;
	String gearType;
	int door;
	@Override
	public String toString() {
		return "Car1 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}	
	
	Car1(){};
	Car1(String color,String gearType,int door){
		this.color=color;this.gearType=gearType;this.door=door;
	}
}

public class Day024_review_Q15 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		System.out.println(c1);
		c1.color="red";c1.gearType="auto";c1.door=4;
		System.out.println(c1);
		Car1 c2 = new Car1("while","auto",2);
		System.out.println(c2);

	}

}
