package classArr001;

public class A {
	//멤버변수
	private String name;
	private int age;
	
	//생성자
	public A() {super();}
	public A(String name, int age) {super();this.name = name; this.age=age;}
	
	@Override
	public String toString() {
		return "A [name=" + name + ", age=" + age + "]";
	}
	//getter,setter
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
}
