package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GUI implements ActionListener{
	JFrame frame;
	JButton btn[];
	String num[];
	Color colors[];
	GUI(){
		num = new String[]{"ONE","TWO","THREE","FOUR","FIVE"};
		colors = new Color[] {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE};
		frame = new JFrame("NUMBER BOX");
		frame.setSize(500, 150);
		frame.setLocation(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame.setLayout(new FlowLayout());
		btn = new JButton[5];
		for (int i=0;i<5;i++) {
		btn[i] = new JButton(num[i]);
		btn[i].setPreferredSize(new Dimension(80,80));
		btn[i].setBackground(colors[i]);
		btn[i].setFont(new Font(Font.DIALOG, Font.BOLD, 10));
		if(i==0||i==4) {btn[i].setForeground(Color.white);;}
		btn[i].addActionListener(this);
		frame.add(btn[i]);
		}
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<btn.length;i++) {
			if(e.getSource().equals(btn[i])) {JOptionPane.showMessageDialog(null,this.btn[i].getText());}
		}		
	}
	
}

public class Gui001 {
	public static void main(String[] args) {
		new GUI();
	}

}
