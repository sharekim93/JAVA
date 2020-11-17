package component;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Gui024{
	JFrame frame;
	JPanel panel,panel2;
	JLabel label;
	JComboBox<String> combobox;
	String[] names;
	ImageIcon[] imgs;
	Gui024(){
		super();
		frame = new JFrame("COMBOBOX+IMAGECON");
		imgs = new ImageIcon[] {new ImageIcon("image/neo.jpg"),new ImageIcon("image/muzi&con.gif"),new ImageIcon("image/jayg.jpg")};
		label = new JLabel(imgs[0]);
		
		names = new String[] {"네오","무지와 콘","제이지"};
		combobox = new JComboBox<String>(names);
		
		combobox.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int index = combobox.getSelectedIndex();
				label.setIcon(imgs[index]);
			}
		});
	}
	
	void create() {
		frame.setLayout(new FlowLayout());
		frame.setSize(400,500);
		
		frame.add(combobox,0);
		frame.add(label,1);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

public class Gui024_comboBoximg {
	public static void main(String[] args) {
		new Gui024().create();
	}

}
