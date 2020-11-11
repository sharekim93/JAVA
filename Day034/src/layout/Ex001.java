package layout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class UserId{
	JFrame frame;
	JLabel label;
	JTextField input;
	JButton button;
	
	UserId(){
		frame = new JFrame("USERID");
		frame.setSize(250,80);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new FlowLayout());
		
		label = new JLabel("아이디");
		
		input = new JTextField();
		input.setPreferredSize(new Dimension(100,25));
		
		button = new JButton("입력");
		button.setFont(new Font(Font.DIALOG,Font.PLAIN,11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
			
		});
		
		frame.add(label);
		frame.add(input);
		frame.add(button);
		
		frame.setVisible(true);
	}
}

public class Ex001 {
	public static void main(String[] args) {
		new UserId();

	}

}
