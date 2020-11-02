package day027_class007_extends;

/*
1. 빈칸채우기 : 아래 코드에 채움
2. 예상되는 결과:
				father : three
				grand : two
				grand : one
				uncle : four
				grand : two
				uncle : two
				grand : one
				uncle : one
				MiMi옆집이모클래스
				MiMi옆집이모클래스
3. 오버라이딩 시 우선순위 : Object > Grand > Father > Uncle > Aunt
*/
class Grand extends Object{
	Grand(){super();}
	public void one() {System.out.println("grand : one");}
	public void two() {System.out.println("grand : two");}
}//end Grand

class Father extends Grand{
	Father(){super();}
	public void three() {System.out.println("father : three");}
}// end Father

class Uncle extends Grand{
	Uncle(){super();}
	public void four() {System.out.println("uncle : four");}
	@Override
	public void one() {super.one();System.out.println("uncle : one");}
	@Override
	public void two() {super.two();System.out.println("uncle : two");}
}// end Uncle

class Aunt extends Uncle{
	Aunt(){super();}
	String name="MiMi";

	@Override
	public String toString() {
		return name + "옆집이모클래스";
	}
	
}

public class Extends004 {
	public static void main(String[] args) {
		Father father = new Father(); father.three(); father.two();father.one();
		Uncle 	uncle = new Uncle(); uncle.four();uncle.two();uncle.one();
		Aunt	 aunt = new Aunt();
		System.out.println(aunt.toString()); System.out.println(aunt);

	}

}
