
public class Method021 {
	
	//★★★★ 오버로딩
	//1. 같은 클래스 내에서 [같은 이름의 메소드] 를 여러 개 선언
	//2. JVM은 같은 이름의 메소드가 있으면 파라미터 [타입]으로 비교하여 다른 메소드로 인식함

	//public static void star()
	//public static void star(int a) 오류
	//public static void star(int b) 오류(같은 형식 파라미터)
	//public static int star(int c)	오류 (같은 형식 파라미터, return값 무관)
	
	//오버로딩 시 영향을 안 주는 것
	//public, static, return
	
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println("[BASIC001] 메소드 중복중의 - 오버로딩 1) 매개변수의 자료형");
		// 메소드 오버로딩이 가능한 이유:
		print(3);
		print(1.2);
		print('A');
		print("HAPPY");

		System.out.println();
		System.out.println("[BASIC001] 메소드 중복중의 - 오버로딩 2) 매개변수의 개수");
		
		print(3,5);
		print(1.2,3.4);
		print('3','5');
		print("3","5");
	}
	public static void print(int i) {
		System.out.println(i);
	}
	public static void print(double i) {
		System.out.println(i);
	}
	public static void print(char i) {
		System.out.println(i);
	}
	public static void print(String i) {
		System.out.println(i);
	}
	public static void print(int i,int j) {
		System.out.println(i+j);
	}
	public static void print(double i, double j) {
		System.out.println(i+j);
	}
	public static void print(char i, char j) {
		System.out.println(i+j);
	}
	public static void print(String i, String j) {
		System.out.println(i+j);
	}

}
