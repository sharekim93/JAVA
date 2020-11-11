package review;
import java.util.Vector;

public class Day034_1 {
	public static void main(String[] args) {
		Vector mycolor = new Vector();
		
		mycolor.add(new Classinfo("Red",1000));
		mycolor.add(new Classinfo("Yello",1200));
		mycolor.add(new Classinfo("Green",1500));
		
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");
		System.out.println("\tNAME\tPRICE");
		System.out.println(":::::::::::::::::::::::::::::::::::::::::::::");

		for (int i=0;i<mycolor.size();i++) {
			System.out.println(mycolor.get(i));
		}
		
	}
}
