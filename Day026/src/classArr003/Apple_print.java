package classArr003;

public class Apple_print {
	void show(Apple apple) {
		System.out.println(":::::: APPLE ORDER\nORDER\t: "+apple.getOrder()+"\nNAME\t: "+apple.getName()
						+"\nNUM\t: "+apple.getNum()+"\nPRICE\t: "+apple.getPrice());
	}
	void show(Apple[] apple) {
		for(int i=0;i<apple.length;i++) {
			System.out.println(":::::: APPLE ORDER\nORDER\t: "+apple[i].getOrder()+"\nNAME\t: "+apple[i].getName()
			+"\nNUM\t: "+apple[i].getNum()+"\nPRICE\t: "+apple[i].getPrice());
		}
	}
}
