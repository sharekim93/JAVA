package hashmap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;


public class Hashmap005 {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		int total=0,max=0,min=0;
		
		map.put("first",90);
		map.put("second", 88);
		map.put("three", 100);
		map.put("four",72);
		map.put("five", 94);

		Iterator<String> iter = map.keySet().iterator();
		System.out.println("NAME\tSCORE\n---------------");
		while(iter.hasNext()) {
			String temp = iter.next();
			System.out.println(temp+"\t"+map.get(temp));
			System.out.println("---------------");
			total+=map.get(temp);
			max = Collections.max(map.values());
			min = Collections.min(map.values());
			
		}
		System.out.println("참가자 명단 : "+map.keySet());
		System.out.println("총점 : "+total);
		System.out.println("평균 : "+(double)total/map.size());
		System.out.println("최고점수 : "+max);
		System.out.println("최저점수 : "+min);
	}

}
