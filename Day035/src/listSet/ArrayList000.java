package listSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList000 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("피자");
		list.add(4500);
		list.add(3);
		
		System.out.println("list 출력 : "+ list.toString());
		System.out.println("size 개수 출력 : "+list.size());
		System.out.println("4500원 출력 : "+list.get(1));
		System.out.println("for 구문 이용해서 출력 - 각각의 요소들 출력");
		for(int i=0; i<list.size();i++) {
			System.out.print(list.get(i)+"\t");
		}
		
		String name = JOptionPane.showInputDialog("당신의 이름을 입력하세요.");
		JOptionPane.showMessageDialog(null,name);
	}

}
