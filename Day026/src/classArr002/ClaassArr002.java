package classArr002;

public class ClaassArr002 {

	public static void main(String[] args) {
		Apple apple[]=new Apple[3];
			
		apple[0]=new Apple("RED",2,1000,"iron");
		apple[1]=new Apple("GREEN",1,1500,"hulk");
		apple[2]=new Apple("GOLD",3,2000,"captain");
		
		for (int i=0;i<apple.length;i++) {
			System.out.println(apple[i]);
		}
	}

}
