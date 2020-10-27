class Car2{
	String color;
	String gearType;
	int door;
	
	Car2(){};
	Car2(String color){
		this.color=color;
	}
	Car2(String color,String gearType,int door){
		this.color=color;this.gearType=gearType;this.door=door;
	}

	@Override
	public String toString() {
		return "Car1 [color=" + color + ", gearType=" + gearType + ", door=" + door + "]";
	}
}

public class Class016 {

	public static void main(String[] args) {
		Car2 c1 = new Car2();
		System.out.println(c1);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car2()를 통해 초기화 [color=null, gearType=null, door=0]
		// 출력 : Car1 [color=null, gearType=null, door=0]
		
		Car2 c2 = new Car2("white");
		System.out.println(c2);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car2("white")를 통해 초기화 [color=white, gearType=null, door=0]
		// 출력 : Car1 [color=white, gearType=null, door=0]
		
		Car2 c3 = new Car2("red","manual",2);
		System.out.println(c3);
		// 인스턴스 변수 : color, gearType, door
		// new를 이용 인스턴스화
		// Car2("white")를 통해 초기화 [color=red, gearType=manual, door=2]
		// 출력 : Car1 [color=red, gearType=manual, door=2]
		
		System.out.println("c1의 color="+ c1.color +", gearType="+c1.gearType+", door="+c1.door);
		System.out.println("c1의 color="+ c2.color +", gearType="+c2.gearType+", door="+c2.door);
		System.out.println("c1의 color="+ c3.color +", gearType="+c3.gearType+", door="+c3.door);

	}

}
