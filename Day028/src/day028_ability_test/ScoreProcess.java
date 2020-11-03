package day028_ability_test;

class ScoreProcess {
	void process_avg(Score[] std) {
		for (int i = 0; i < std.length; i++) {
			std[i].setAvg((std[i].getKor() 
					+ std[i].getEng() 
					+ std[i].getMath()) / 3d);
		}
	}

	void process_pass(Score[] std) {
		for (int i = 0; i < std.length; i++) {
			if (std[i].getAvg() >= 60) {
				std[i].setPass("합격");
			} else {
				std[i].setPass("불합격");
			}
		}
	}
}
