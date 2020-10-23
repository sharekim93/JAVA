import java.util.Scanner;

class Animal001{
	String name;
	int age;
	Scanner scanner = new Scanner(System.in);
	void input() {
		System.out.print(":: 이름입력 > ");
		name=scanner.next();
		System.out.print(":: 나이입력 > ");
		age=scanner.nextInt();
	}
	void show() {
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("::이름 : "+name);
		System.out.println("::나이 : "+age);
	}
}

public class Class005 {

	public static void main(String[] args) {
		Animal001 ani = new Animal001();
		
		ani.input();
		ani.show();

	}

}
