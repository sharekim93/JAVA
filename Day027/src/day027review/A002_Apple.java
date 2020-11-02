package day027review;

class A002_Apple {

	public static void main(String[] args) {
		Apple apple[]=new Apple[3];
		apple[0]=new Apple("RED",2);
		apple[1]=new Apple("GREEN",1);
		apple[2]=new Apple("GOLD",3);
		
		for (int i=0;i<apple.length;i++) {
			System.out.println(apple[i]);
		}
	}
	
}
