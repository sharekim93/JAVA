package review;

import java.util.ArrayList;

public class Review001 {
	public static void main(String[] args) {
		ArrayList<Object> arr = new ArrayList<Object>();
		arr.add(new Model("white",1000));
		arr.add(new Model("choco",1200));
		arr.add(new Model("banana",1300));
		
		System.out.println(
				"==============================\n"
				+ "NO\tNAME\tPRICE\n"
				+ "==============================");
		for(int i=0;i<arr.size();i++) {
			System.out.println((i+1)+"\t"+arr.get(i));
		}
	}

}
