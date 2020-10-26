
class Distance{
	//멤버함수
	static double getDistance(double x1,double y1,double x2,double y2) {
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
	}
}

public class Ex006 extends Distance{

	public static void main(String[] args) {
		Distance d = new Distance();
		System.out.println("객체 찍어서 사용 일반 메서드 : "+d.getDistance(1, 1, 2, 2));
		System.out.println("클래스 멤버함수 이용 : "+getDistance(1,1,2,2));

	}

}
