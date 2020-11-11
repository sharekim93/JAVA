package collection004;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CollectionGui {
	JFrame frame;
	JPanel panel[];
	JLabel label;
	JTextArea area;
	JButton button[];
	String btn_name[];
	
	CollectionGui(){
		frame		= new JFrame();
		panel 		= new JPanel[3];
		label		= new JLabel("COLLECTION",JLabel.CENTER);
		area		= new JTextArea();
		button	 	= new JButton[4];
		btn_name	= new String[]{"ADD","GET","REMOVE","SHOW-ALL"};
		
		for(int i=0;i<panel.length;i++) {panel[i]=new JPanel();}
		for(int i=0;i<button.length;i++) {button[i]=new JButton(btn_name[i]);}
	}
	
	void create() {
		frame.setSize(400,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new GridLayout(3,1));
		
		label.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
		label.setForeground(Color.white);
		panel[0].add(label);
		panel[0].setLayout(new GridLayout(1,1));
		panel[0].setBackground(Color.black);
		
		panel[1].add(area);
		panel[1].setBackground(Color.black);
		area.setPreferredSize(new Dimension(365,140));
		
		
		
		panel[2].setLayout(new GridLayout(4,1));
		for(int i=0;i<button.length;i++) {
			button[i].setBackground(Color.black);
			button[i].setForeground(Color.magenta);
			button[i].setFont(new Font(Font.SANS_SERIF,Font.BOLD,16));
			panel[2].add(button[i]);}			
		for(int i=0;i<panel.length;i++) {frame.add(panel[i]);}
		
		frame.setVisible(true);
	}
}
