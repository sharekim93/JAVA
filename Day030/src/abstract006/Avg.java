package abstract006;

class Avg extends Process {

	public Avg() {
		super();
	}

	@Override
	double exec(int kor, int eng, int math) {
		return 0;
	}

	@Override
	double exec(int total) {
		return total/3d;
	}

	@Override
	String exec(double avg) {
		return null;
	}

}
