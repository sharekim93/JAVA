
class FinalBasic{ //final 을 class에 붙이면 extend가 불가
	String name;
	final int age=10;
	
	void show() { // final 을 메서드에 붙이면 extend 시 override가 안 됨
		System.out.println(":::::: STATIC + FINAL");
		 System.out.println(":: 이 름 : " + this.name);
		 System.out.println(":: 나 이 : " + this.age);
	} 

	public FinalBasic() {}
	
	@Override
	public String toString() {
		return "FinalBasic [name=" + name + ", age=" + age + "]";
	}
	
}

public class Class029_final_basic {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		
		FinalBasic f1 = new FinalBasic();
		//f1.age=20; final 은 상수니까 변경 불가
		f1.show();
	}

}
