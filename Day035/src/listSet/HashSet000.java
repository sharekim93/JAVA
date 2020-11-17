package listSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet000 {
	public static void main(String[] args) {
		//1. 다음 빈칸을 채우시오.
		//1-2. 콜렉션 프레임워크 핵심 인터페이스 : list / set / map
		//1-2. List 특징 : 순서 O , 데이터 중복허용 O,  사용가능 메서드 : add, get, size, remove
		//1-3. set 특징 : 순서 X , 데이터 중복허용 X,  사용가능 메서드 : add, size, remove (get X)
		System.out.println("\n001. list : 순서 [O], 데이터 중복허용 [O]");
		ArrayList<String> milks = new ArrayList<>();
		milks.add("white");
		milks.add("white");
		milks.add("choco");
		milks.add("banana");
		
		System.out.println("1-1 : "+milks);
		System.out.println("1-2 순서가 있기 때문에 : "+milks.get(0));
		System.out.println("1-3 개수 : "+milks.size());
		
		System.out.println("\n002. set : 순서 [X], 데이터 중복허용 [X]");
		HashSet<String> milks2 = new HashSet<>();
		
		milks2.add("white");
		milks2.add("white");
		milks2.add("choco");
		milks2.add("banana");
		System.out.println("2-1 :"+milks2);
		System.out.println("2-3 개수 : "+milks2.size());
		System.out.println("2-4 삭제 : "+milks2.remove("banana")+"\t"+milks2); //remove 는 boolean type
		System.out.println("get 대신에 사용할 수 있는 것. contains : "+milks2.contains("banana"));
		System.out.println("get 대신에 사용할 수 있는 것2. iterator : ");
		
		Iterator<String> iter = milks2.iterator(); //iterator() : set 모으기
		while (iter.hasNext()) {// hasNext(): 처리할 대상이 있는지 확인 => 있으면 true
			System.out.println(iter.next()); // next() : iter에서 꺼내기
		}
	}

}
