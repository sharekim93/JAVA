
class Animal_static{
	String name; int age;
	//멤버변수
	static String COMPANY;
	static int animal_num;
	static String BOSS;
	static String LOCATION;
	
	//멤버함수
	public static void num_plus() {animal_num++;}
	public void show() {
		System.out.println("\n\n::::::::::::::::");
		System.out.println(":: 회사명 : "+Animal_static.COMPANY);
		System.out.println("□ 식구수 : "+Animal_static.animal_num);
		System.out.println("□ 사장님 : "+Animal_static.BOSS);
		System.out.println("□ 위 치 : "+Animal_static.LOCATION);
	}
	//생성자
	static {
		COMPANY="(주)동물농장";
		animal_num=10;
		BOSS="신동엽";
		LOCATION ="상암";
		
		
	}
	@Override
	public String toString() {
		return "Animal_static [name=" + name + ", age=" + age + "]";
	}
}

public class Class022_static {

	public static void main(String[] args) {
		System.out.println("□ 회사명 : "+Animal_static.COMPANY);
		System.out.println("□ 식구수 : "+Animal_static.animal_num);
		System.out.println("□ 사장님 : "+Animal_static.BOSS);
		System.out.println("□ 위 치 : "+Animal_static.LOCATION);
		
		Animal_static cat =new Animal_static();
		cat.name="sally"; cat.age=10;
		//cat.num_plus() 권장사항이 아님
		Animal_static.num_plus();
		cat.show();

	}

}
