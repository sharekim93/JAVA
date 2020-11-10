package gui;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui004{
	JFrame frame;
	JButton button[];
	String names[];
	Color colors[];
	int num=5;
	
	Gui004(){
		frame = new JFrame("프레임이에요");
		frame.setLayout(new FlowLayout());
		
		button=new JButton[num];
		names=new String[]{"ONE","TWO","THREE","FOUR","FIVE"};
		colors = new Color[] {Color.BLUE,Color.WHITE,Color.RED,Color.green,Color.gray};
		for(int i=0;i<num;i++) {button[i] = new JButton(names[i]);}
	}
	
	void create() {
		for(int i=0; i<num;i++) {
			frame.add(button[i]);
			button[i].setSize(100,100);
			button[i].setBackground(colors[i]);
			button[i].setForeground(colors[colors.length-1-i]);
		}
		frame.setSize(600,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui004_arr {
	public static void main(String[] args) {
		new Gui004().create();

	}
}
