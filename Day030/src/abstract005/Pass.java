package abstract005;

class Pass extends Process {

	public Pass() {
		super();
	}

	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	String exec(double avg) {
		if(avg>=60) {return "합격";}
		else return "불합격";
	}

}
