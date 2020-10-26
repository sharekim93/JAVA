
class Student001 {
	// 멤버변수
	String name;
	int ban, no, kor, eng, math;

	Student001() {}

	@Override
	public String toString() {
		return "[name=" + name + ", ban=" + ban + ", no=" + no + ", kor=" + kor + ", eng=" + eng + ", math="
				+ math + "]";
	}

}

public class Ex003 {

	public static void main(String[] args) {
		Student001 s1 = new Student001();
		System.out.println(s1);

	}

}
