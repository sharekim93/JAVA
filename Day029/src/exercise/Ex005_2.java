package exercise;

class Point {
	int x, y;
	public Point() {}
	public Point(int x, int y) {this.x=x;this.y=y;}
	public Point(Point point) {}
	@Override public String toString() {return "Point [x=" + x + ", y=" + y + "]";}
}

abstract class Shape_ex{
	private Point p; // 문제설명1 : Point 라는 x,y의 좌표를 가진 클래스를 멤버로 갖는다.
	public Shape_ex() {this(new Point(0,0));} // 문제설명2 : 사용자에게 단위를 입력 받아 쓸 수 있게 셋팅을 해준다.
	public Shape_ex(Point p) {super();this.p=p;} 
	public Point getP() {return p;}
	public void setP(Point p) {this.p=p;}
	abstract double calcArea(); //문제설명3 : 도형의 면적을 계산해서 변환하는 추상 메서드
}

class Circle_ex extends Shape_ex{
	double r;
	
	Circle_ex(){super();}
	Circle_ex(double r){this.r=r;}
	public double calcArea() {
		return this.r*this.r*Math.PI;
	}
}

class Rectangle_ex extends Shape_ex{
	double width,height;
	
	Rectangle_ex(){super();}
	Rectangle_ex(double width, double height){
		this.width=width;this.height=height;
	}
	public double calcArea() {
		return this.width*this.height;
	}
	public boolean isSquare() {
		if (width!=0&&height!=0&&width==height){return true;}
		else return false;
	}
}

public class Ex005_2 {
	
	static double sumArea(Shape_ex[] arr) {
		double result=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] instanceof Rectangle_ex) {result+=((Rectangle_ex)arr[i]).calcArea();}
			else if(arr[i] instanceof Circle_ex) {result+=((Circle_ex)arr[i]).calcArea();}
		}
		return result;
	}
	
	public static void main(String[] args) {
		Shape_ex[] arr = {new Circle_ex(5.0),new Rectangle_ex(3,4),new Circle_ex(1)};
		System.out.println("면적의 합 :"+sumArea(arr));

	}

}
