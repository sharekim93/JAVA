package score_ver2;

class Member {
	//멤버변수
	private String name, pass, scholar, rank;
	private int kor, eng, math, total;
	private double aver;
	
	//getter,setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getPass() {return pass;}
	public void setPass(String pass) {this.pass = pass;}

	public String getScholar() {return scholar;}
	public void setScholar(String scholar) {this.scholar = scholar;}

	public String getRank() {return rank;}
	public void setRank(String rank) {this.rank = rank;}

	public int getKor() {return kor;}
	public void setKor(int kor) {this.kor = kor;}

	public int getEng() {return eng;}
	public void setEng(int eng) {this.eng = eng;}

	public int getMath() {return math;}
	public void setMath(int math) {this.math = math;}

	public int getTotal() {return total;}
	public void setTotal(int total) {this.total = total;}

	public double getAver() {return aver;}
	public void setAver(double aver) {this.aver = aver;}
	
	Member(){
		super();
		this.name="";
		this.kor=0;
		this.eng=0;
		this.math=0;
		this.total=0;
		this.aver=0;
		this.pass="";
		this.rank="";
		this.scholar="";	
	}
	Member(String name, int kor, int eng, int math){
		this();
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}