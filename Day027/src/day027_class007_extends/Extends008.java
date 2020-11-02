package day027_class007_extends;

import java.util.Scanner;

class User{
	private String name;
	private String id;
	User(){super();}
	void show() {
		System.out.println("================================================================");
		System.out.println("이름\t아이디\tJAVA\tJSP\tMYSQL\tSPRING\tPROJECT\tTOTAL\tAVG");
		System.out.print(name+"\t"+id+"\t");
		
	}//end show()
	public String getName() {return name;}
	public String getId() {return id;}
	public void setName(String name) {this.name = name;}
	public void setId(String id) {this.id = id;}
}// end User

class Score_v1 extends User{
	private int java, jsp, mysql;
	Scanner scanner = new Scanner(System.in);
	
	Score_v1(){super();}
	
	void input() {
		System.out.print(":::: SCORE INPUT\n= NAME 입력 : ");
		super.setName(scanner.next());
		System.out.print("= ID 입력 : ");
		super.setId(scanner.next());
		System.out.print("= JAVA 점수입력 : ");
		this.java = scanner.nextInt();
		System.out.print("= JSP 점수입력 : ");
		this.jsp  = scanner.nextInt();
		System.out.print("= MYSQL 점수입력 : ");
		this.mysql = scanner.nextInt();
	}// end input()
	
	@Override
	void show() {
		super.show();System.out.print(java+"\t"+jsp+"\t"+mysql+"\t");
	}// end show()-Overrided
	
	public int getJava() {return java;}
	public int getJsp() {return jsp;}
	public int getMysql() {return mysql;}
	public void setJava(int java) {this.java = java;}
	public void setJsp(int jsp) {this.jsp = jsp;}
	public void setMysql(int mysql) {this.mysql = mysql;}
	
}// end Score_v1

class Score_v2 extends Score_v1{
	private int spring, project, total;
	private double avg;
	
	//생성자
	Score_v2(){super();}
	
	@Override
	void input() {
		super.input();
		System.out.print("= SPRING 점수입력 : ");
		this.setSpring(scanner.nextInt());
		System.out.print("= PROJECT 점수입력 : ");
		this.setProject(scanner.nextInt());
	}// end input() - Overrided
	
	void process_total() {
		this.total = (super.getJava()
				+super.getJsp()
				+super.getMysql()
				+this.getSpring()
				+this.getProject());
	}// end process_total()
	
	void process_avg() {
		this.avg = (this.getTotal()/5d);
	}// end process_avg()
	
	@Override
	void show() {
		super.show();
		System.out.println(this.spring+"\t"
				+this.project+"\t"
				+this.total+"\t"
				+String.format("%.1f", this.avg));
	}// end show()
	
	public int getSpring() {return spring;}
	public int getProject() {return project;}
	public int getTotal() {return total;}
	public double getAvg() {return avg;}
	public void setSpring(int spring) {this.spring = spring;}
	public void setProject(int project) {this.project = project;}
	public void setTotal(int total) {this.total = total;}
	public void setAvg(double avg) {this.avg = avg;}
	
}// end Score_v2

public class Extends008 {
	public static void main(String[] args) {
		Score_v2 iron = new Score_v2();
		iron.input();
		iron.process_total();
		iron.process_avg();
		iron.show();

	}//end main
}//end Extends008
