package inner_anonymous;

class Kimbob{
	String name;
	int price;
	class Danmugi{public void show() {System.out.println("단무지 추가요");}	}
	class Rice{public void show() {System.out.println("밥 한 공기 추가요");}}
	class Kim{public void show() {System.out.println("김 좀 더주세요");}}
	
	public void order() {
		Kim k = new Kim(); k.show();
		Rice r = new Rice(); r.show();
		Danmugi d = new Danmugi(); d.show();
	}
}


public class Inner001 {
	public static void main(String[] args) {
		Kimbob kimbob = new Kimbob();
		Kimbob.Danmugi danmugi = new Kimbob(). new Danmugi();
		kimbob.order();
		danmugi.show();
		
	}
}
