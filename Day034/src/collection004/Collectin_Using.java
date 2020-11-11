package collection004;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JOptionPane;

class Collectin_Using implements ActionListener{
	Vector vec;
	CollectionGui gui;
	
	public Collectin_Using() {
		vec	=	new Vector();
		gui =	new CollectionGui(); gui.create();
		for(int i=0;i<gui.button.length;i++) {gui.button[i].addActionListener(this);}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			if(e.getSource().equals(gui.button[0])) {add();}
			if(e.getSource().equals(gui.button[1])) {get();}
			if(e.getSource().equals(gui.button[2])) {remove();}
			if(e.getSource().equals(gui.button[3])) {showAll();}
		}
		catch(Exception e1) {JOptionPane.showMessageDialog(null,"숫자를 입력해주세요");gui.area.setText(null);}
		
	}
	void add() {
		String text="";
		text = gui.area.getText();
		if(text.contains(" ")||text.isBlank()) {JOptionPane.showMessageDialog(null, "빈칸이 입력 되었습니다.\n확인해주세요");}
		else {JOptionPane.showMessageDialog(null,text.trim()+"을 추가했습니다.");vec.add(text.trim());}
		gui.area.setText(null);
	}
	void showAll() {
		String text="";
		for(int i=0;i<vec.size();i++) {
			text+="["+i+"]"+vec.get(i)+"\n";
		}
		if(text==""||text.isBlank()) {JOptionPane.showMessageDialog(null, "입력된 값이 없습니다" );}
		else{JOptionPane.showMessageDialog(null, text );}
	}
	void get() throws Exception {
		String text="";
		int i=0;
		text = gui.area.getText();
		if(text.contains(" ")||text.isBlank()) {JOptionPane.showMessageDialog(null, "빈칸을 입력하셨습니다");}
		else if (Integer.decode(text)<vec.size()){i=Integer.decode(text);JOptionPane.showMessageDialog(null, vec.get(i));}
		else {JOptionPane.showMessageDialog(null, "잘못입력하셨습니다.");}
		gui.area.setText(null);
	}
	void remove() {
		String text="";
		int i=0;
		text = gui.area.getText();
		if(text.contains(" ")||text.isBlank()) {JOptionPane.showMessageDialog(null, "빈칸을 입력하셨습니다");}
		else if (Integer.decode(text)<vec.size()){i=Integer.decode(text);JOptionPane.showMessageDialog(null, vec.remove(i)+"가 삭제 되었습니다.");}
		else {JOptionPane.showMessageDialog(null, "잘못입력하셨습니다.");}
		gui.area.setText(null);
	}
}
