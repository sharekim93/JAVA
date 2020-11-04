package exercise;


class Robot {}
class DanceRobot extends Robot{
	void dance() {System.out.println("춤을 춥니다.");}
	
}
class SingRobot extends Robot{
	void sing() {System.out.println("노래를 합니다.");}
}

class DrawRobot extends Robot{
	void draw() {System.out.println("그림을 그립니다.");}
}

class Ex_Abstract{
	//(1) action 메서드를 작성하시오
	public static void action(Robot r) {
		if(r instanceof DanceRobot) {((DanceRobot) r).dance();}
		else if (r instanceof SingRobot) {((SingRobot) r).sing();}
		else if (r instanceof DrawRobot) {((DrawRobot) r).draw();}
	}
}

public class Ex003 {
	public static void main(String[] args) {
		Robot[] arr = {new DanceRobot(),new SingRobot(),new DrawRobot()};
		for(int i=0; i<arr.length;i++) {Ex_Abstract.action(arr[i]);}

	}

}
