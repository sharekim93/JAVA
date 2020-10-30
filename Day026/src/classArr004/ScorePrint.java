package classArr004;

/*
	[3] ScorePrint
	클래스의 기능 : 클래스를 넘겨 받아 출력해주는 기능
	1) 멤버변수 : 없음
	2) 생성자 : 없음
	3) 멤버함수 : 
	- A : 클래스 한 개를 받아 출력해주는 기능
		public void show(Score std)
	- B : 클래스 배열을 받아서 출력해주는 기능
		public void show(Score[] std)
	- C : 타이틀을 출력해주는 기능
		public void show_title()
*/
class ScorePrint {
	/*안 씀
	public void show(Score std) {
		this.show_title();
		System.out.println(std.getName() + "\t" + std.getKor() + "\t" + std.getEng() + "\t"
				+ std.getMath() + "\t" + String.format("%.2f",std.getAvg()) + "\t" + std.getPass());
	}
	*/
	ScorePrint(){super();}
	public void show(Score[] std) {
		this.show_title();
		for (int i = 0; i < std.length; i++) {
			System.out.println(std[i].getName() + "\t" + std[i].getKor() + "\t" + std[i].getEng() + "\t"
					+ std[i].getMath() + "\t" + String.format("%.2f",std[i].getAvg()) + "\t" + std[i].getPass());
		}
	}

	public void show_title() {
		System.out.println("==============================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("==============================================================");
	}
	
}
