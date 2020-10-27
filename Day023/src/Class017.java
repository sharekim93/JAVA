
class Car3{
	String color;
	String gearType;

	int door;
	{
		this.gearType="auto";
		this.door=4;
	}
	
	Car3(){};
	Car3(String color){
		this.color=color;
	}
	Car3(Car3 c1) {
		this.color=c1.color;this.gearType=c1.gearType;this.door=c1.door;
	}

	@Override
	public String toString() {
		return "Car3 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
}

public class Class017 {

	public static void main(String[] args) {
		Car3 c1=new Car3();
		c1.color="red";
		System.out.println(c1);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car3()를 통해 초기화 [color=null, gearType=null, door=0]
		// c1.color = "red" [color=red, gearType=null, door=0]
		// 출력 : Car3 [color=red, gearType=auto, door=4]
		
		Car3 c2 =new Car3(c1);
		System.out.println(c2);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car3(c1)를 통해 초기화 [color=red, gearType=auto, door=4]
		// 출력 : Car3 [color=red, gearType=auto, door=4]
		
		Car3 c3 = new Car3();
		c3.color="green"; 
		System.out.println(c3);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car3()를 통해 초기화 [color=null, gearType=null, door=0]
		// c3.color = "green" [color=green, gearType=null, door=0]
		// 출력 : Car3 [color=green, gearType=auto, door=4]
		
		Car3 c4 =new Car3(c3);
		System.out.println(c4);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car3(c3)를 통해 초기화 [color=green, gearType=auto, door=4]
		// 출력 : Car3 [color=green, gearType=auto, door=4]
	}

}
