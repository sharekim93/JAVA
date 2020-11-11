package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Button{
	JFrame frame;
	JPanel panel[];
	JLabel label[];
	JButton button;
	int n=1;
	
	Button(){
		frame = new JFrame();
		frame.setSize(200,200);
		frame.setLocation(800, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		panel = new JPanel[3];
		label = new JLabel[]{
				new JLabel("PANEL1",JLabel.CENTER),
				new JLabel("PANEL2",JLabel.CENTER),
				new JLabel("PANEL3",JLabel.CENTER)
				};
		for(int i=0;i<panel.length;i++) {
			panel[i]=new JPanel();
			panel[i].add(label[i]);
		}
		
		button = new JButton("BTN");
		button.setFont(new Font(Font.DIALOG,Font.PLAIN,11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int i=1;
				frame.add(panel[i++],BorderLayout.CENTER);
				frame.add(button,BorderLayout.SOUTH);
				if(i==4) {i=0;}
			}
			
		});
		
		frame.add(panel[0],BorderLayout.CENTER);
		frame.add(button,BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
	
}


public class GUI019 {
	public static void main(String[] args) {
		new Button();
	}
}
