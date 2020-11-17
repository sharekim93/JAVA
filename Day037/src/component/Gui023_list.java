package component;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class Gui023{
	JFrame frame;
	JLabel label;
	JComboBox<String> combobox;
	String[] items;
	
	Gui023(){
		super();
		frame = new JFrame("COMBO BOX");
		label = new JLabel("항목선택");
		items = new String[] {"선택하세요","ONE","TWO","THREE"};
		combobox = new JComboBox<>(items);
		combobox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int index = combobox.getSelectedIndex();
				JOptionPane.showMessageDialog(null, items[index]);	
			}
		});
	}
	
	void create() {
		frame.setLayout(new FlowLayout());
		frame.setSize(200,80);
		frame.add(label);
		frame.add(combobox);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui023_list {
	public static void main(String[] args) {
		new Gui023().create();
	}

}
