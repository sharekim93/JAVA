package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap003 {

	public static void main(String[] args) {
		HashMap<String,String> site = new HashMap<>();
		site.put("danawa", "www.danawa.net"	);
		site.put("naver","www.naver_kid.com");
		site.put("daum", "www.daum_kidco.kr");
		
		System.out.println(site.keySet());
		System.out.print("사이트 키값을 입력하세요 : ");
		Scanner scanner = new Scanner(System.in);
		String key = scanner.next();
		System.out.println("value : "+site.get(key));
	}
}
