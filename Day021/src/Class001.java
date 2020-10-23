
//클래스는 멤머변수와 멤버함수로 구성된다.
class User001{
	//멤버변수
	String name;
	int age;
	
	public void show() {
		System.out.println(name + "\t"+age);
	}
	public static void nexttime() {System.out.println("메모리 할 때 안내해드릴게요");}
}

public class Class001 {

	public static void main(String[] args) {
		// 지역변수
		int a; 
		// 지역변수
		User001 user1 = new User001();
		//클래스 객체명  = (데이터 가져오기) (User001의 변수를 초기화)
		System.out.println(user1.name+"\t"+user1.age);
		user1.show();
		
		//클래스도 자료형이므로 new 공간을 빌려오고 User001() 청소해서 사용할 준비하기
		//인스턴스명.으로 접근해서 사용이 가능. ex)user1.name;
		
		//public
		user1.name="david";
		user1.age =40;
		user1.show();
		//static
		User001.nexttime();
	}

}
