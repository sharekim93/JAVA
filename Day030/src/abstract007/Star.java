package abstract007;

class Star extends Process {

	public Star() {
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
		String star="";
		for (int i=0;i<(int)(avg/10);i++){
			star+="★";
		}
		return star;
	}

}
