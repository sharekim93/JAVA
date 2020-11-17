package listSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ArrayList001 {

	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		
		numbers.add("ONE");
		numbers.add("TWO");
		numbers.add("THREE");
		
		String number = JOptionPane.showInputDialog("1,2,3 중에 입력해주세요");
		try {
		if(Integer.decode(number)==1) {JOptionPane.showMessageDialog(null, numbers.get(0));}
		else if(Integer.decode(number)==2) {JOptionPane.showMessageDialog(null, numbers.get(1));}
		else if(Integer.decode(number)==3) {JOptionPane.showMessageDialog(null, numbers.get(2));}
		else {throw new Exception("잘못 입력하셨습니다");}
		}
		catch(Exception e) {JOptionPane.showMessageDialog(null,e.getMessage());}
	}

}
