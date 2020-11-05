package abstract006;

class ScoreUsing {
	ScoreDto user;
	Process process;
	Print print;
	
	ScoreUsing(){super();}
	ScoreUsing(String name,int kor, int eng, int math){
		super(); 
		user = new ScoreDto(name,kor,eng,math);
	}
	
	void exec1() {
		process = new Total();
		user.setTotal((int)process.exec(user.getKor(), user.getEng(), user.getMath()));
		process = new Avg();
		user.setAvg(process.exec(user.getTotal()));
		process = new Jang();
		user.setJang(process.exec(user.getAvg()));
		process = new Star();
		user.setStar(process.exec(user.getAvg()));
		process = new Pass();
		user.setPass(process.exec(user.getAvg()));
	}
	
	void exec2() {
		print = new StdPrint();
		print.show(user);
	}
}
