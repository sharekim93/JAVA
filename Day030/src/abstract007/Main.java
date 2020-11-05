package abstract007;

public class Main {
	public static void main(String[] args) {
		ScoreDto[] users = {new ScoreDto("아이언맨",100,100,100),
							new ScoreDto("헐크",80,90,99),
							new ScoreDto("토르",70,88,98)};
		
		Process process = null;
		for(int i=0;i<users.length;i++) {
		process = new Total();
		users[i].setTotal((int)process.exec(users[i].getKor(), users[i].getEng(), users[i].getMath()));
		process = new Avg();
		users[i].setAvg(process.exec(users[i].getTotal()));
		process = new Jang();
		users[i].setJang(process.exec(users[i].getAvg()));
		process = new Star();
		users[i].setStar(process.exec(users[i].getAvg()));
		process = new Pass();
		users[i].setPass(process.exec(users[i].getAvg()));
		}
		
		Print print =null;
		print = new StdPrint(); print.show(users);
	}

}
