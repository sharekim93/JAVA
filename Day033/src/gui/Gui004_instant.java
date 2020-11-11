package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

class Gui4_instant {

	JFrame frame;
	JLabel label;
	JButton button;
	JTextField field;
	
	Gui4_instant(){
	frame = new JFrame("COMPONENTS");
	frame.setSize(900,200);
	frame.setLocation(800, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setLayout(new GridLayout(1,3));

	label = new JLabel("주문할 우유 이름을 적으시오.",JLabel.CENTER); //가운데 정렬
	label.setFont(new Font(Font.DIALOG,Font.BOLD,18));
	//label.setHorizontalAlignment(SwingConstants.CENTER); //가운데 정렬 2


	frame.add(label);
	
	field = new JTextField("choco"); //text입력방법 1
	//field.setText("choco"); text입력방법 2
	field.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
	frame.add(field);
	
	button = new JButton("CLICK");
	button.setBackground(Color.CYAN);
	button.setFont(new Font(Font.DIALOG,Font.BOLD,20));
	button.setForeground(Color.MAGENTA);
	button.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if(!field.getText().contains("MILK")) {field.setText(field.getText()+" MILK~!");}
		}
	});
	frame.add(button);
	
	frame.setVisible(true);
	}


}

public class Gui004_instant {
	public static void main(String[] args) {
		new Gui4();

	}

}
