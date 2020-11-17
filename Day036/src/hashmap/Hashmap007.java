package hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmap007 {

	public static void main(String[] args) {
		HashMap<Object, Object> phoneBook = new HashMap<>();
		HashMap<Object, Integer> group = new HashMap<>();
		Object[][] data = new Object[][] {
			{"FRIENDS","first","010-111-1111"},
			{"FRIENDS","second","010-222-2222"},
			{"FRIENDS","third","010-333-3333"},
			{"COMPANY","red","010-444-4444"},
			{"COMPANY","green","010-555-5555"},
			{"COMPANY","blue","010-666-6666"},
			{"FAMILY","sally","010-777-7777"},
			{"FAMILY","alpha","010-888-8888"}
		};
		for(int i=0;i<data.length;i++) {
			phoneBook.put(data[i][1], data[i][2]);	
			if(group.containsKey(data[i][0])){group.put(data[i][0], group.get(data[i][0])+1);}
			else {group.put(data[i][0], 1);}
		}
		Iterator<Object> iter = group.keySet().iterator();
		Iterator<Object> iter2 = phoneBook.keySet().iterator();
		while(iter.hasNext()) {
			Object temp = iter.next();

			System.out.println("============================");
			System.out.println(" * "+temp+"["+group.get(temp)+"]");
			System.out.println("============================");
			/*
			while(iter2.hasNext()) {
				
			}
				
			if(group.get(temp)==phoneBook.get(group.get(temp))) {
				System.out.println(temp+"\t"+phoneBook.get(temp));
			
			}
			*/
		}
	}
}
