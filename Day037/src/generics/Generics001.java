package generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Generics001 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		Iterator<Integer> iter = list.iterator();
		
		int sum=0;
		while(iter.hasNext()) {
			Integer temp =iter.next(); 
			sum+=temp;
		}
		System.out.println("평균 : " +sum/list.size());
	}

}
