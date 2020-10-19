
public class Method003 {

	public static void myInt(int n) {
		System.out.println("para1 : "+n);
	}
	public static void myFloat(float n) {
		System.out.println("para2 :"+n);
	}
	public static void myDouble(Double d1, double d2) {
		System.out.println("para2 :"+d1+","+d2);
	}
	
	public static void main(String[] args) {
		System.out.println("예시1) ");
		myInt(1);
		myInt(9);
		myInt(7);
		
		System.out.println("예시2) ");
		myFloat(1.1f);
		myFloat(1.2f);
		myFloat(1.3f);
		myFloat(10);
		myFloat('a');
		
		System.out.println("예시2) ");
		myDouble(1.1,1.2);
	}

}
