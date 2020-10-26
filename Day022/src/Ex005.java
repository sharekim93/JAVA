
class Student003 {
	// 멤버변수
	String name;
	int ban, no, kor, eng, math;

	// 멤버함수
	int getTotal() {
		return (this.kor + this.eng + this.math);
	}

	float getAverage() {
		return (Math.round(this.getTotal() * 10 / 3f) / 10f);
	}

	public String info() {
		return this.name + "," 
				+ this.ban + "," 
				+ this.no + "," 
				+ this.kor + "," 
				+ this.eng + "," 
				+ this.math + ","
				+ this.getTotal() + ","
				+ this.getAverage();
	}

	// 생성자
	Student003() {};

	Student003(String nm, int b, int n, int k, int e, int m) {
		this.name = nm;
		this.ban = b;
		this.no = n;
		this.kor = k;
		this.eng = e;
		this.math = m;
	}

}

public class Ex005 {

	public static void main(String[] args) {
		Student003 s3 = new Student003("홍길동", 1, 1, 100, 60, 76);
		System.out.println(s3.info());

	}

}
