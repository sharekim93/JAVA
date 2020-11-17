package component;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Gui022{
	JFrame frame;
	JLabel label;
	public Gui022() {
		super();
		frame = new JFrame("IMG");
		label = new JLabel(new ImageIcon("Image/dog.jpg"));
	}
	public void create() {
		frame.add(label);
		frame.setSize(500, 600);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

public class Gui022_img {
	public static void main(String[] args) {
		new Gui022().create();
	}
}
