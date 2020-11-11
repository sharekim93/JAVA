package review;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GUI implements ActionListener{
	JFrame frame;
	JButton button[];
	String names[];
	Color colors[];
	
	GUI(){
		names = new String[]{"One","TWO","THREE","FOUR","FIVE"};
		colors = new Color[] {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.BLUE};
		
		frame = new JFrame("box");
		frame.setSize(600,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		button = new JButton[5];
		for(int i=0;i<button.length;i++) {
			button[i] = new JButton(names[i]);
			button[i].setBackground(colors[i]);
			button[i].setPreferredSize(new Dimension(100,100));
			if(i==4) {button[i].setForeground(Color.WHITE);}
			else{button[i].setForeground(Color.BLACK);}
			button[i].addActionListener(this);
			frame.add(button[i]);
		}
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<button.length;i++)
		{if(e.getSource().equals(button[i])) {JOptionPane.showMessageDialog(null,this.button[i].getText());break;}}
	}
}

public class Day034_2 {
	public static void main(String[] args) {
		new GUI();
	}

}
