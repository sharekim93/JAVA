package polymorphism;

/*
	Q. 클래스가 다음과 같이 정의되어 있을 때 형변환을 올바르게 하지 않은 것은?
	class Unit{}
	class AirtUnit extends Unit{}
	class GroundUnit extends Unit{}
	class Tank extends GroundUnit{}
	class AirCraft extends AirUnit{}
	Unit u = new Ground Unit();
	Tank t = new Tank();
	AirCraft ac = new AirCraft();
	
	a. u= (Unit)ac;
	b. u = ac;
	c. GroundUnit gu = (GroundUnit)u;
	d. AirtUnit au = ac;
	e. t = (Tank) u; 
	f. GroundUnit gu2 = t; 
	
	정답 : E /  하위 클래스에 상위 클래스로 인스턴스화 할 수 없음.
*/
public class Polymorphism8 {
	public static void main(String[] args) {
		class Unit{}
		class AirtUnit extends Unit{}
		class GroundUnit extends Unit{}
		class Tank extends GroundUnit{}
		class AirCraft extends AirtUnit{}
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		
		u= (Unit)ac;
		u = ac;
		GroundUnit gu = (GroundUnit)u;
		AirtUnit au = ac;
		t = (Tank) u; 
		GroundUnit gu2 = t; 

	}

}
