package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class GUI3 implements ActionListener{
	JFrame frame;
	JButton btn;
	String num;

	GUI3(){
		frame = new JFrame("BOX");
		frame.setSize(300, 150);
		frame.setLocation(800, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new FlowLayout());

		btn = new JButton("홍길동");
		btn.setPreferredSize(new Dimension(100,100));
		btn.setBackground(Color.RED);
		btn.setFont(new Font(Font.DIALOG, Font.BOLD, 10));
		btn.addActionListener(this);
		frame.add(btn);
		frame.setVisible(true);
		}
		
		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String label = "Hello!"+this.btn.getText();
		JOptionPane.showMessageDialog(null,label);
		this.btn.setLabel(label);
		}

	
	
}

public class Gui003 {
	public static void main(String[] args) {
		new GUI3();
	}

}
