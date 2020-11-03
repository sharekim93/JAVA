package day028_ability_test;

class Score{
	// 멤버변수
	private String name, pass;
	private int kor, eng, math;
	private double avg;
	
	//생성자
	Score(){super();}
	Score(String name, int kor, int eng, int math){
		super();
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	
	//Getter,setter
	public String getName() {return name;}
	public String getPass() {return pass;}
	public int getKor() {return kor;}
	public int getEng() {return eng;}	
	public int getMath() {return math;}
	public double getAvg() {return avg;}
	
	public void setName(String name) {this.name = name;}
	public void setPass(String pass) {this.pass = pass;}
	public void setKor(int kor) {this.kor = kor;}
	public void setEng(int eng) {this.eng = eng;}
	public void setMath(int math) {this.math = math;}
	public void setAvg(double avg) {this.avg = avg;}
	
	//override toString
	@Override
	public String toString() {
		return "Score [name=" + name + ", pass=" + pass + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg="
				+ avg + "]";
	}	
}


