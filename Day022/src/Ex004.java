
class Student002 {
	//멤버변수
	String name;
	int ban, no, kor,eng,math;
	
	//멤버함수
	int getTotal() {
		return (this.kor+this.eng+this.math);
	}
	float getAverage() {
		return (Math.round(this.getTotal()*10/3f)/10f);
	}
	Student002(){};
}
public class Ex004 {

	public static void main(String[] args) {
		Student002 s2 = new Student002();
		s2.name="홍길동";s2.ban=1;s2.no=1;s2.kor=100;s2.eng=60;s2.math=76;
		System.out.println("이름 : "+s2.name);
		System.out.println("총점 : "+s2.getTotal());
		System.out.println("평균 : "+s2.getAverage());

	}

}
