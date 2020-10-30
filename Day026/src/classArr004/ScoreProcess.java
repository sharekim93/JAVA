package classArr004;
/*
	[2] ScoreProcess
	클래스의 기능 : 데이터를 받아 성적처리를 해주는 기능
	1) 멤버변수 : 없음
	2) 생성자 : ScoreProcess()
	3) 멤버함수
	void process_avg(Scroe [] std) - 평균을 구해주는 기능
	void process_pass(Scroe [] std) - 합격여부를 구해주는 기능
*/
class ScoreProcess {
	ScoreProcess(){super();}
	public void process_avg(Score[] std) {
		for (int i=0;i<std.length;i++) {
			std[i].setAvg((std[i].getKor()+std[i].getEng()+std[i].getMath())/3d);
		}
	}
	public void process_pass(Score[] std) {
		for(int i=0;i<std.length;i++) {
			if(std[i].getAvg()>=60&&(std[i].getKor()<40||std[i].getEng()<40||std[i].getMath()<40)){std[i].setPass("과락");}
			else if(std[i].getAvg()>=60) {std[i].setPass("합격");}
			else {std[i].setPass("불합격");}
		}
	}
	
}
