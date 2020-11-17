package hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

public class Hashmap002 {

	public static void main(String[] args) {
		HashMap<String,String> map2 = new HashMap<>();
		map2.put("피구왕","통키");
		map2.put("제빵왕", "김탁구");
		map2.put("요리왕", "비룡");
		
		//1.keySet 
		System.out.println("----ver.Keyset");
		Iterator<String> iter = map2.keySet().iterator();

		System.out.println("==================\nKING\tNAME\n==================");
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp+"\t"+map2.get(temp));
		}
		
		//2. entrySet
		System.out.println("----ver.entryset");
		Iterator<Entry<String,String>> iter2 = map2.entrySet().iterator();
		while(iter2.hasNext()) {
			Entry<String,String> temp = iter2.next();
			System.out.println(temp.getKey()+"\t"+temp.getValue());
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("KING의 정보를 제공중입니다.\n이름을 입력하세요>");
		String set = scanner.next();
		System.out.println("□ "+ set +" : " +map2.get(set));
		System.out.println("KING 몇명? size() 가능한가요?"+ map2.size());
	}

}
