package abstract005;

public class Main {
	public static void main(String[] args) {
		ScoreDto std = new ScoreDto("헐크",100,100,99);
		Process[] process = {new Total(),new Avg(),new Jang(),new Star(),new Pass()};
		
		std.setTotal((int)process[0].exec(std.getKor(), std.getEng(), std.getMath()));
		std.setAvg(process[1].exec(std.getTotal()));
		std.setJang(process[2].exec(std.getAvg()));
		std.setStar(process[3].exec(std.getAvg()));
		std.setPass(process[4].exec(std.getAvg()));
		
		Print print = null;
		print = new StdPrint(); print.show(std);
	}

}
