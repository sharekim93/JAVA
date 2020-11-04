package exercise;

abstract class Unit {
	int x,y;
	abstract void move(int x,int y);
	abstract void stop();
}

class Marine extends Unit{
	int x,y;
	
	Marine(){super();}
	void move(int x,int y) {};
	void stop() {};
	void SteamPack() {}
}
class Tank extends Unit{
	int x,y;
	Tank(){super();}
	
	void move(int x,int y) {};
	void stop() {};
	void changeMode() {}
}
class Dropship extends Unit{
	int x,y;
	Dropship(){super();}
	
	void move(int x,int y) {};
	void stop() {};
	void load() {}
	void unload() {}
}

public class Ex004 {
	public static void main(String[] args) {	
		
	}

}
