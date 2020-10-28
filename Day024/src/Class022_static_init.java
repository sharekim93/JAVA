
class StaticInit{
	static int 	cv = 1;
		int 	iv = 1;
		static {cv=2;}
				{iv=2;}
	StaticInit() {this.iv=3;}
}

public class Class022_static_init {

	public static void main(String[] args) {
		System.out.println("초기화 순서를 적으시오.");
		System.out.println("1. 클래스 변수 : "+ "cv " +"// 생성되는 위치 : method area");
		System.out.println(" 기본값  |  명시적 초기화  | 클래스 초기화 블럭");
		// 자료형에 따른 초기화 | 선언 될 때 =에 의한 초기화 | 클래스 초기화 블럭
		System.out.println("2. 인스턴스 변수 : "+ "iv " +"// 생성되는 위치 : heap area");
		System.out.println(" 기본값  |  명시적 초기화  | 인스턴스 초기화 블럭 | 생성자");
		// 자료형에 따른 초기화 | 선언 될 때 =에 의한 초기화 | 인스턴스 초기화 블럭 | 생성자
		
		StaticInit s1 = new StaticInit();
		System.out.println("인스턴스 변수의 값 :"+s1.iv);
	}

}
