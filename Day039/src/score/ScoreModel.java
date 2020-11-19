package score;

public class ScoreModel {
	private int no,java,jsp,spring,project,sum;
	private String name;
	private double avg;
	
	public ScoreModel() {
		super();
	}

	public ScoreModel(String name,int java, int jsp, int spring, int project) {
		super();
		this.no = no++;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
		this.sum = (java+jsp+spring+project);
		this.name = name;
		this.avg = (java+jsp+spring+project)/4;
	}

	@Override
	public String toString() {
		return "Score_DTO [no=" + no + ", java=" + java + ", jsp=" + jsp + ", spring=" + spring + ", project=" + project
				+ ", sum=" + sum + ", name=" + name + ", avg=" + avg + "]";
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
