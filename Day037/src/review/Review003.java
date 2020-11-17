package review;

import java.util.HashMap;
import java.util.Iterator;

public class Review003 {

	public static void main(String[] args) {
		HashMap<Integer,Object> hash = new HashMap<Integer,Object>();
		hash.put(1, new Model("white",1000));
		hash.put(2, new Model("choch",1200));
		hash.put(3, new Model("banana",1300));
		
		Iterator<Integer> iter = hash.keySet().iterator();
		System.out.println(
				"==============================\n"
				+ "NO\tNAME\tPRICE\n"
				+ "==============================");
		
		while(iter.hasNext()){
			Integer temp = iter.next();
			System.out.println(temp+"\t"+hash.get(temp));
		}
	}

}
