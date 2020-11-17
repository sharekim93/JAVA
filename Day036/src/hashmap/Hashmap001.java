package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Hashmap001 {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		String[] keys = {"스타","샤인","큐티","낄낄","갓"};
		String[] values = {"혁재","지예","유진","하늘","준홍"};
		
		for(int i=0;i<keys.length;i++) {
			map.put(keys[i], values[i]);
		}
		//1. keySet 
		System.out.println("---ver. Keyset");
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext())
		{
			String temp = iter.next();
			System.out.println(temp+"\t"+map.get(temp));
		}
		
		//2. entrySet
		System.out.println("---ver. entryset");
		Iterator<Entry<String,String>> iter2 = map.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<String,String> temp = iter2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
		
	}

}
