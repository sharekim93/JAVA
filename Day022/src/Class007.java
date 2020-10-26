
class User002 {
	String name;
	int age;

	void show() {
		System.out.println("이름 : " + name + "\n나이 : " + age);
	}
	{
		this.name = "아이언맨";
		this.age = 55;
	}
}

public class Class007 {

	public static void main(String[] args) {

		User002 user = new User002();
		user.show();
		// new는 객체를 만들어 주는 것
		// new 뒤의 User002()가 생성자!!

		User002 user2 = new User002();
		user2.name = "헐크";
		user2.age = 10;
		user2.show();

	}

}
