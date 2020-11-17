package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap006 {
	public static void main(String[] args) {
		String[] data = {"A","D","A","D","B","D","A","D","E","C","B"};
		HashMap<String,Integer> map = new HashMap<>();
		
		for(int i=0; i<data.length;i++) {
			if(!map.containsKey(data[i])) {map.put(data[i], 1);}
			else {map.put(data[i], map.get(data[i])+1);}
			}

		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.print(temp+" : ");
			for(int i=0;i<map.get(temp);i++) {
				System.out.print("#");
			}
			System.out.println(" "+map.get(temp));
		}
	}
}
