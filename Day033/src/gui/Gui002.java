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

class GUI2 implements ActionListener{
	JFrame frame;
	JButton btn[];
	String num[];
	Color colors[];
	GUI2(){
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
		if(e.getSource().equals(btn[0])) {JOptionPane.showMessageDialog(null,this.btn[0].getText());btn[0].setLabel("일");}
		else if(e.getSource().equals(btn[1])) {JOptionPane.showMessageDialog(null,this.btn[1].getText());btn[1].setLabel("이");}
		else if(e.getSource().equals(btn[2])) {JOptionPane.showMessageDialog(null,this.btn[2].getText());btn[2].setLabel("삼");}
		else if(e.getSource().equals(btn[3])) {JOptionPane.showMessageDialog(null,this.btn[3].getText());btn[3].setLabel("사");}
		else if(e.getSource().equals(btn[4])) {JOptionPane.showMessageDialog(null,this.btn[4].getText());btn[4].setLabel("오");}
		
	}
	
}

public class Gui002 {
	public static void main(String[] args) {
		new GUI2();
	}

}
