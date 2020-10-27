
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

public class Class015 {

	public static void main(String[] args) {
		Car1 c1 = new Car1();
		System.out.println(c1);
		c1.color="red";c1.gearType="auto";c1.door=4;
		System.out.println(c1);
		// 인스턴스 변수 : color,  gearType, door
		// new로 인스턴스화
		// c1은 인스턴스를 가리키는 참조변수. [color=null, gearType=null, door=0]
		// color에 red, gearType에 auto, door에 4 대입 [color=red, gearType=auto, door=4]
		// toString 이용 출력 Car1 [color=null, gearType=null, door=0]
		
		Car1 c2 = new Car1("while","auto",2);
		System.out.println(c2);
		// 인스턴스 변수 : color,  gearType, door
		// new로 인스턴스화
		// c1은 인스턴스를 가리키는 참조변수. 생성자를 통해 초기화 [color=while, gearType=auto, door=2]
		// toString 이용 출력 Car1 Car1 [color=while, gearType=auto, door=2]
		
	}

}
