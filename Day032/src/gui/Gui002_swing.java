package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui002{
	JFrame frame;
	JButton button;
	
	
	public Gui002() {
		super();
		frame = new JFrame("BOX");
		button = new JButton("BTN1");
	}
	
	public void create() {
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui002_swing {
	
}
