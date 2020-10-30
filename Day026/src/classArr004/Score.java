package classArr004;

/*
	[1] Score
	클래스의 기능 : 데이터를 받아서 전달하는 기능 : DTO
	1) 멤버변수 : name 이름, kor 국어, eng 영어, math 수학, avg 평균, pass 합격
	2) 생성자 : Score(), Score(String name, int kor, int eng, int math)
	3) 멤버함수 : 없음
*/
class Score {
	//멤버변수
	private String name;
	private int kor,eng,math;
	private double avg;
	private String pass;
	
	Score(){super();}
	Score(String name, int kor, int eng, int math){
		super();
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//toString
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + ", pass="
				+ pass + "]";
	}
	
	//getter
	public String getName() {return name;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}
	public int getMath() {return math;}
	public double getAvg() {return avg;}
	public String getPass() {return pass;}
	
	//setter
	public void setName(String name) {this.name = name;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public void setAvg(double avg) {this.avg = avg;}
	public void setPass(String pass) {this.pass = pass;}
}
