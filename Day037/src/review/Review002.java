package review;

import java.util.HashSet;
import java.util.Iterator;

public class Review002 {

	public static void main(String[] args) {
		HashSet<Object> hash = new HashSet<Object>();
		hash.add(new Model("white",1000));
		hash.add(new Model("choco",1200));
		hash.add(new Model("banana",1300));
		
		Iterator<Object> iter = hash.iterator();
		
		System.out.println(
				"==============================\n"
				+ "NO\tNAME\tPRICE\n"
				+ "==============================");
		int i=1;
		while(iter.hasNext()) {
			System.out.print(i++ +"\t");
			System.out.println(iter.next());
		}
	}

}
