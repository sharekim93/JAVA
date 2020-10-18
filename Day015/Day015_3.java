
public class Day015_3 {

	public static void main(String[] args) {
		
		//for
		System.out.println("=====for 버전=====");
		boolean first=true;
		for(int i=0;i<3;i++)
		{
			if (first) {first=false;}
			else {System.out.print(" , ");}
			System.out.print("APPLE");
		}
		System.out.println();
		
		//while
		System.out.println("=====while 버전=====");
		first=true;
		int i=0;
		while(i<3)
		{
			if (first) {first=false;}
			else {System.out.print(" , ");}
			System.out.print("APPLE");
			i++;
		}
		System.out.println();
		
		//do~while
		System.out.println("=====while 버전=====");
		first=true;
		i=0;
		do
		{
			if (first) {first=false;}
			else {System.out.print(" , ");}
			System.out.print("APPLE");
			i++;
		}
		while(i<3);
	}

}
