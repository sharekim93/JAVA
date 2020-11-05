package abstract007;

class StdPrint extends Print{
	
	public StdPrint() {super();}
	
	void show(ScoreDto std) {
		System.out.println("======================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("======================================================================");
		System.out.println(std.getName()+"\t"
				+std.getKor()+"\t"
				+std.getEng()+"\t"
				+std.getMath()+"\t"
				+String.format("%.2f",std.getAvg())+"\t"
				+std.getPass()+"\t"
				+std.getJang()+"\t"
				+std.getStar()
				);
	}
	void show(ScoreDto[] std) {
		System.out.println("======================================================================");
		System.out.println("이름\t국어\t영어\t수학\t평균\t합격여부\t장학생\t랭킹");
		System.out.println("======================================================================");
		for(int i=0;i<std.length;i++) {
			System.out.println(std[i].getName()+"\t"
					+std[i].getKor()+"\t"
					+std[i].getEng()+"\t"
					+std[i].getMath()+"\t"
					+String.format("%.2f",std[i].getAvg())+"\t"
					+std[i].getPass()+"\t"
					+std[i].getJang()+"\t"
					+std[i].getStar()
					);
		}
	}
}
