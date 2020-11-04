package exercise;

import java.util.Arrays;

class Fruit{
	@Override public String toString() {return "Fruit ";}
}

class Apple extends Fruit{
	public void ap() {System.out.println("사과는 빨갛다");}
	@Override public String toString() {return "Apple  ";}
}

class Banana extends Fruit{
	public void bana() {System.out.println("바나나는 노랗다.");}
	@Override public String toString() {return "Banana  ";}
}

class Coconut extends Fruit{
	public void coco() {System.out.println("코코넛은 코코하다");}
	@Override public String toString() {return "Coconut  ";}
}

public class Ex002 {
	public static void main(String[] args) {
		System.out.println("ver-1 : Fruit[] fruits = {} 방법을 이용하여\n"
				+" new Apple(), new Banana(), new Coconut() 를 데이터 셋팅하고 다음과 같이 출력하시오.\n"
				+" □ 출력된 화면 : [Apple, Banana, Coconut]");
		Fruit[] fruits = {new Apple(), new Banana(), new Coconut()};
		System.out.println(Arrays.toString(fruits));
		
		System.out.println("\nver-2 : Fruit[] fruits2 = new Fruit[3]; 방법을 이용하여\n"
				+ "데이터를 셋팅하고 다음과 같이 출력하시오\n"
				+ "□ 출력화면 : [Apple, Banana, Coconut]"
				+ "");
		Fruit[] fruits2 = new Fruit[3];
		
		fruits2[0]= new Apple();
		fruits2[1]= new Banana();
		fruits2[2]= new Coconut();
		
		System.out.println(Arrays.toString(fruits2));
		
		System.out.println("\nver-3 : instanceof 를 이용하여 어디서 파생되었는지 출력하시오. 해당 메서드 출력\n"
				+ "□ 출력된 화면 : \n 사과는 빨갛다 \r\n바나나는 노랗다\r\n코코넛은 코코하다.\r\n");
	
		
		
		for (int i=0; i<fruits2.length;i++) {
			if(fruits2[i] instanceof Apple) {((Apple)fruits2[i]).ap();}
			else if(fruits2[i] instanceof Banana) {((Banana)fruits2[i]).bana();}
			else if(fruits2[i] instanceof Coconut) {((Coconut)fruits2[i]).coco();}
		}
	}

}
