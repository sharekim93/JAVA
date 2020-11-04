package day029_Abstract;

abstract class shape{
	shape(){}
	public abstract void showArea(int width, int height);
	public abstract void showArea(int radius);
}

class Rectangle extends shape{
	public void showArea(int width, int height) {
		System.out.println("- 사각형의 넓이 : "+width*height);
	}
	public void showArea(int radius) {}
}

class Triangle extends shape{
	public void showArea(int width, int height) {
		System.out.println("- 삼각형의 넓이 : "+(width*height)/2);
	}
	public void showArea(int radius) {}
}

class Circle extends shape{
	public void showArea(int width, int height) {}
	public void showArea(int radius) {
		System.out.println("- 원의 넓이 : "+(radius*radius)*Math.PI);
	}
}


public class Abstract002 {
	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		rec.showArea(10, 10);
		
		Triangle tri = new Triangle();
		tri.showArea(10, 10);
		
		Circle cir = new Circle();
		cir.showArea(10);
	}

}
