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

class Gui4 implements ActionListener{

	JFrame frame;
	JLabel label;
	JButton button;
	JTextField field;
	
	Gui4(){
	frame = new JFrame("COMPONENTS");
	frame.setSize(900,200);
	frame.setLocation(800, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	frame.setLayout(new GridLayout(1,3));

	label = new JLabel("주문할 우유 이름을 적으시오.",JLabel.CENTER); //가운데 정렬
	label.setFont(new Font(Font.DIALOG,Font.BOLD,18));
	//label.setHorizontalAlignment(SwingConstants.CENTER); //가운데 정렬 2


	frame.add(label);
	
	field = new JTextField();
	field.setText("choco");
	field.setFont(new Font(Font.SANS_SERIF,Font.BOLD,20));
	frame.add(field);
	
	button = new JButton("CLICK");
	button.setBackground(Color.CYAN);
	button.setFont(new Font(Font.DIALOG,Font.BOLD,20));
	button.setForeground(Color.MAGENTA);
	button.addActionListener(this);
	frame.add(button);
	
	frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		field.setText(this.field.getText()+" MILK~!");
		
	}
}

public class Gui004 {
	public static void main(String[] args) {
		new Gui4();

	}

}
