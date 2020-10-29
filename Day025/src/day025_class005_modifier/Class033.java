package day025_class005_modifier;

class Car4{
	//멤버변수
	private String color;
	private String gearType;
	private int    door;
	
	//생성자
	Car4(){}
	Car4(String color,String gearType, int door){
		this.color=color;
		this.gearType=gearType;
		this.door=door;
	}
	Car4(Car4 car){
		this.color = car.color;
		this.gearType = car.gearType;
		this.door = car.door;		
	}
	//toString
	@Override
	public String toString() {
		return "color=" + color + ", gearType=" + gearType + ", door=" + door;
	}
	
	//getta,setta
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	public String getGearType() {
		return gearType;
	}

	public void setGearType(String gearType) {
		this.gearType = gearType;
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}
	
}

public class Class033 {

	public static void main(String[] args) {
		Car4 c1 = new Car4();
		// 아래 3종이 오류나는 것을 고치시오 - 데이터 셋팅해주세요
		c1.setColor("white");
		c1.setGearType("auto");
		c1.setDoor(4);
		
		Car4 c2 = new Car4("white","auto",4);
		
		System.out.println("c1의 "+c1);
		System.out.println("c2의 "+c2);
	}

}
