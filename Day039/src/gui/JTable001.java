package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class GUI{
	JFrame frame;
	JTable table;
	JScrollPane jscrollPane;
	Object[][] data; 
	Object[] columns;
	
	GUI(){
		frame = new JFrame(":::: JTABLE 예제");
		data = new Object[][]{{1,"RED"},{2,"GREEN"},{3,"BLUE"}};
		columns = new Object[]{"NO","NAME"};
		table = new JTable(data,columns);
		jscrollPane = new JScrollPane(table);
	}
	
	public void create() {
		frame.add(jscrollPane);
		frame.setSize(400,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JTable001 {
	public static void main(String[] args) {
		new GUI().create();
	}
}
