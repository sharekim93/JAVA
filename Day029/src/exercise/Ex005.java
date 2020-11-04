/*package exercise;

class Shape {
	double area;
}

class Circle extends Shape{
	double r;
	
	Circle(){super();}
	Circle(double r){
		this.r=r;
		area=r*r*Math.PI;
	}
	
}

class Rectangle extends Shape{
	double width,height;
	
	Rectangle(){super();}
	Rectangle(double width, double height){
		this.width=width;this.height=height;
		area+=width*height;
	}
	
	boolean isSquare() {
		if (width==height){return true;}
		else return false;
	}
}

public class Ex005 {
	
	static double sumArea(Shape[] arr) {
		double result=0;
		for(int i=0;i<arr.length;i++) {
			result+=arr[i].area;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Shape[] arr = {new Circle(5.0),new Rectangle(3,4),new Circle(1)};
		System.out.println("면적의 합 :"+sumArea(arr));

	}

}*/
