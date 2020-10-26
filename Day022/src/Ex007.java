
class MyPoint{
	//멤버변수
	double x1,x2,y1,y2;
	
	//멤버함수
	double getDistance(double x2,double y2) {
		return Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1, 2));
		}
	MyPoint(){};
	MyPoint(double a,double b) {this.x1=a;this.y1=b;}
	
}

public class Ex007{

	public static void main(String[] args) {
		MyPoint p = new MyPoint(1,1);
		System.out.println(p.getDistance(2,2));
	}

}
