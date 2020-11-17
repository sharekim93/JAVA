package listSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList002 {
	public static void main(String[] args) {
		ArrayList avengers = new ArrayList();
		String[] heros = new String[] {"IRON","HULK","CAPTAIN"};
		
		for(int i=0;i<heros.length;i++) {
			avengers.add(heros[i]);
		}
			for(;;) {
				System.out.println("당신의 영웅의 번호(1,2,3)를 입력해주세요\n4번 입력 시 종료");
				String number = JOptionPane.showInputDialog("당신의 영웅의 번호를 입력해주세요");
				if (Integer.decode(number)==1) {System.out.println(number +"\n부자남자\t"+avengers.get(0)+"\n");
												JOptionPane.showMessageDialog(null, "부자남자\t"+avengers.get(0));}
				else if (Integer.decode(number)==2) {System.out.println("초록색 남자\t"+avengers.get(1)+"\n");
													JOptionPane.showMessageDialog(null, "초록색 남자\t"+avengers.get(1));}
				else if (Integer.decode(number)==3) {System.out.println("항상대장\t"+avengers.get(2)+"\n");
													JOptionPane.showMessageDialog(null, "항상대장\t"+avengers.get(2));}
				else if (Integer.decode(number)==4) {JOptionPane.showMessageDialog(null, "종료");break;}
				else {System.out.println();JOptionPane.showMessageDialog(null, "잘못 입력하셨습니다.");}
			}

	}
}
