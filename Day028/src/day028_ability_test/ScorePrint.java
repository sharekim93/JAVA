package day028_ability_test;

class ScorePrint {
	void show(Score[] std) {
		System.out.println("==================================================");
		System.out.println("\t국어\t영어\t수학\t평균\t합격여부");
		System.out.println("==================================================");
		for(int i=0; i<std.length;i++) {
			System.out.println(std[i].getName()
					+"\t"+std[i].getKor()
					+"\t"+std[i].getEng()
					+"\t"+std[i].getMath()
					+"\t"+String.format("%.2f",std[i].getAvg())
					+"\t"+std[i].getPass());
		}
	}
}
