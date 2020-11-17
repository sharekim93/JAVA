package review;

import java.util.HashSet;
import java.util.Iterator;

public class Day036_2 {
	public static void main(String[] args) {
		// Day036_1에서 작성한 UserInfo를 인스턴트화
		HashSet<UserInfo> hash = new HashSet<UserInfo>();
		
		hash.add(new UserInfo("IRON",50));
		hash.add(new UserInfo("HULK",40));
		hash.add(new UserInfo("CAPTAIN",120));
		
		Iterator<UserInfo> iter = hash.iterator();
		
		System.out.println("=====================");
		System.out.println("NAME\tAGE");
		System.out.println("=====================");
		
		while(iter.hasNext()) {
			UserInfo content = iter.next();
			System.out.println(content.getName()+"\t"+content.getAge());
		}
	}
}
