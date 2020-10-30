package score_ver2;

class Process{
	Process(){super();}
	double[] exec(int kor, int eng, int math) {
		double[] result=new double[2];
		result[0]=kor+eng+math;
		result[1]=result[0]/3;
	return result;
	}
	//		리턴값  : String,  double []    
	//		메서드명 : exec(     국어점수, 영어점수, 수학점수    );
	//		파라미터 : 국어점수, 영어점수, 수학점수

	String pass(double aver) {
		if (aver >= 60) {return "합격";}
		else {return "불합격";}
	}
	// 리턴값    :  합격/불합격  String
	// 메서드명   :  pass
	// 파라미터   :  double aver
	

	String scholar(double aver) {
		if (aver >= 90) {
			return "장학생";
		}
		else return "";
	}
	// 리턴값   :  String
	// 메서드명  :  scholar
	// 파라미터  :  double aver

	String star(double aver) {
		String result="";
		for (int i = 0; i <(int)(aver/10); i++) {
			result+="*";
		}
		return result;
	}
	// 리턴값    : String
	// 메서드명   :  star
	// 파라미터   : double aver

	void show(Member iron) {
		double result[]=this.exec(iron.getKor(),iron.getEng(),iron.getMath());
		iron.setTotal((int)result[0]);
		iron.setAver(result[1]);
		iron.setPass(this.pass(result[1]));
		iron.setScholar(this.scholar(result[1]));
		iron.setRank(this.star(result[1]));
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t이름\t국어\t영어\t수학\t총점\t평균\t합격여부\t장학생\t랭킹");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\t" + iron.getName() + "\t" + iron.getKor() + "\t" + iron.getEng() + "\t" + iron.getMath() + "\t" + iron.getTotal()
				+ "\t" + String.format("%.2f", iron.getAver()) + "\t" + iron.getPass() + "\t" + iron.getScholar() + "\t" + iron.getRank());
	}
	// 리턴값   :  void
	// 메서드명  :  show
	// 파라미터  :  Score_ver2  iron
}