package abstract005;

class Jang extends Process {

	public Jang() {
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
		if(avg>=95) {return "장학생";}
		else {return "";}
	}
}
