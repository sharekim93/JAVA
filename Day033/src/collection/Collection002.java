package collection;

import java.util.Vector;

public class Collection002 {

	public static void main(String[] args) {
		Vector color = new Vector();
		String colors[] = {"RED","GREEN","BLUE","BLACK"};
		for(int i=0;i<colors.length;i++) {
			color.add(colors[i]);
		}
		System.out.println("■ EX001");
		for(int i=0;i<color.size();i++) {
			System.out.println(color.get(i));
		}

		Vector milk = new Vector();
		String kinds[] = {"white","choco","banana"};
		for(int i=0;i<kinds.length;i++) {
			milk.add(kinds[i]);
		}
		System.out.println("\n■ EX002");
		for(int i=0;i<milk.size();i++) {
			System.out.println(milk.get(i));
		}
		
		Vector fruit = new Vector();
		String fruits[] = {"apple","banana","coconut"};
		for(int i=0;i<fruits.length;i++) {
			fruit.add(fruits[i]);
		}
		fruit.remove(1);
		System.out.println("\n■ EX003");
		for(int i=0;i<fruit.size();i++) {
			System.out.println(fruit.get(i));
		}
	}
}
