package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

class Chat{
	JFrame frame;
	JTextField input;
	JButton button;
	JScrollPane pan;
	JPanel panel,panel2;
	
	Chat(){
		frame = new JFrame();
		frame.setSize(400,600);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
			
		pan = new JScrollPane();

		panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
		input = new JTextField();
		input.setPreferredSize(new Dimension(150,25));
		panel.add(input);
		
		button = new JButton("입력");
		button.setFont(new Font(Font.DIALOG,Font.PLAIN,11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		panel.add(button);
		
		frame.add(pan,BorderLayout.CENTER);
		frame.add(panel,BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}

public class Ex002 {
	public static void main(String[] args) {
		new Chat();
	}

}
