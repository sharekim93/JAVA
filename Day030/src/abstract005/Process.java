package abstract005;

abstract class Process {
		
	public Process() {
		super();
	}
	
	abstract double exec(int kor, int eng, int math);
	abstract double exec(int total);
	abstract String exec(double avg);
}
