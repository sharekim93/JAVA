package abstract005;

class Total extends Process {
	
	public Total() {
		super();
	}

	@Override
	double exec(int kor, int eng, int math) {
		return (kor+eng+math);
	}

	@Override
	double exec(int total) {
		return 0;
	}

	@Override
	String exec(double avg) {
		return null;
	}
	

}
