package day025_class005_modifier;

public class Class035 {

	public static void main(String[] args) {
		Score_ver2 iron = new Score_ver2("아이언맨",100,100,99);
		Process process = new Process();
		Pass 	pass 	= new Pass();
		Scholar scholar = new Scholar();
		Star	star	= new Star();
		Show	show	= new Show();
		
		String result[] = new String[9];
		result[0]=iron.getName();
		result[1]=""+iron.getKor();
		result[2]=""+iron.getEng();
		result[3]=""+iron.getMath();
		result[4]=""+(int)process.exec(iron.getKor(),iron.getEng(),iron.getMath())[0];
		result[5]=""+String.format("%.2f", process.exec(iron.getKor(),iron.getEng(),iron.getMath())[1]);
		result[6]=pass.exec(process.exec(iron.getKor(),iron.getEng(),iron.getMath())[1]);
		result[7]=scholar.exec(process.exec(iron.getKor(),iron.getEng(),iron.getMath())[1]);
		result[8]=star.exec(process.exec(iron.getKor(),iron.getEng(),iron.getMath())[1]);
		
		show.exec(result);
	}
}

class Score_ver2 {
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
	
	Score_ver2(){
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
	Score_ver2(String name, int kor, int eng, int math){
		this();
		setName(name);;
		setKor(kor);
		setEng(eng);
		setMath(math);
	}
}
class Process{
	Process(){super();}
	double[] exec(int kor, int eng, int math) {
		double result[]=new double[2];
		result[0]=kor+eng+math;
		result[1]=result[0]/3;
	return result;
	}
}
class Pass{
	Pass(){super();}
	String exec(double aver) {
		if (aver >= 60) {return "합격";}
		else {return "불합격";}
	}
}
class Scholar{
	Scholar(){super();}
	String exec(double aver) {
		if (aver >= 90) {
			return "장학생";
		}
		else return "";
	}
}

class Star {
	Star(){super();}
	String exec(double aver) {
		String result="";
		for (int i = 0; i <(int)(aver/10); i++) {
			result+="*";
		}
		return result;
	}
}

class Show {
	Show(){super();}
	void exec(String result[]) {
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t" + result[0] + "\t" + result[1] + "\t" + result[2] + "\t" + result[3] + "\t" + result[4]
				+ "\t" + result[5] + "\t" + result[6] + "\t" + result[7] + "\t" + result[8]);
	}
}
