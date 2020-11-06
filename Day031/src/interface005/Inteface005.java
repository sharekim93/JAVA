package interface005;

class Unit {int x; int y; int power;}
class Fighter{}
class Fighter2 extends Fighter implements Fightable {

	@Override
	public void move(int x, int y) {}

	@Override
	public void attack(Unit c) {}

}

interface Moveable {void move(int x, int y);}
interface Attackable {void attack(Unit c);}
interface Fightable extends Moveable, Attackable {}


class Inteface005 {

	public static void main(String[] args) {
		Fighter2 myc = new Fighter2();
		if(myc instanceof Fightable) {System.out.println("□ FIghtable1 기능 구현묶음 사용");}
	}
}
