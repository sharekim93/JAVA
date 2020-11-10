package gui;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class Gui003{
	JFrame frame;
	JButton button1,button2,button3;
	
	public Gui003() {
		frame = new JFrame("BOX");
		frame.setLayout(new FlowLayout());
		button1 = new JButton("ONE");
		button2 = new JButton("TWO");
		button3 = new JButton("THREE");
	}
	public void create() {
		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(600, 200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


public class Gui003_layout {
	public static void main(String[] args) {
		new Gui003().create();
	}
	
}
