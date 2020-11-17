package listSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet001 {

	public static void main(String[] args) {
		HashSet<String> ironHash = new HashSet<>();
		ironHash.add("iron");
		ironHash.add("hulk");
		ironHash.add("captain");
		
		Iterator<String> iter = ironHash.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

		if(ironHash.contains("hulk")) {ironHash.remove("hulk");ironHash.add("hulk-BEST");}
		
		iter = ironHash.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		HashSet<String> fruitHash = new HashSet<>();
		fruitHash.add("apple");
		fruitHash.add("banana");
		fruitHash.add("coconut");
		fruitHash.add("coconut");
		
		System.out.println(fruitHash.size()+"개");
		Iterator<String> iter2 = fruitHash.iterator();
		
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
	}
}
