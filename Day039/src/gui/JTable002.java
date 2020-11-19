package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class table_ex002{
	JFrame frame;
	JTable table;
	JScrollPane pane;
	Object[][] rowdata;
	Object[] columns;
	
	table_ex002(){
		columns = new Object[]{"NO","NAME","PRICE","DESC"};
		rowdata = new Object[][]{{1,"white",1000,"우유는 하얗다"},{2,"CHOCO",1200,"초코는 까맣다"},{3,"BANANA",1300,"바나나는 노랗다"}};
		
		frame	=	new JFrame("JTable 예제");
		table 	=	new JTable(rowdata,columns);
		pane	=	new JScrollPane(table);
		
	}
	
	void create() {
		frame.setSize(450,120);
		frame.add(pane);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JTable002 {

	public static void main(String[] args) {
		new table_ex002().create();
	}

}
