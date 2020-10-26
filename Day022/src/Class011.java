import java.util.Scanner;

class Animal002 {
	// 멤버변수
	String name;
	int age;

	// 멤버함수
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("::이름입력 > ");
		name = scanner.next();
		System.out.print("::나이입력 > ");
		age = scanner.nextInt();
	}

	void show() {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::이름 : " + name);
		System.out.println("::나이 : " + age);
		System.out.println();
	}

	Animal002() {
		this.name = "USERNAME";
		this.age = 0;
	}
}

public class Class011 {

	public static void main(String[] args) {
		Animal002 a1 = new Animal002();
		a1.show();
		
		Animal002 a2 = new Animal002();
		a2.input();
		a2.show();

	}

}
