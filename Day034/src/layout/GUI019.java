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
	static int n=0;
	
	Button(){
		frame = new JFrame();
		frame.setSize(200,200);
		frame.setLocation(800, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
		
		panel = new JPanel[3];
		label = new JLabel[3];
		for(int i=0;i<panel.length;i++) {
			panel[i]	=	new JPanel();
			label[i]	=	new JLabel("PANEL"+(i+1),JLabel.CENTER);
			panel[i].add(label[i]);
		}
		
		button = new JButton("BTN");
		button.setFont(new Font(Font.DIALOG,Font.PLAIN,11));
		button.setBackground(Color.DARK_GRAY);
		button.setForeground(Color.white);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {		
				n++;
				if(n==3   ) {n=0;}
				
			}
			
		});
		frame.add(panel[n],BorderLayout.CENTER);
		frame.add(button,BorderLayout.SOUTH);

		
		frame.setVisible(true);
	}
	
}


public class GUI019 {
	public static void main(String[] args) {
		new Button();
	}
}
