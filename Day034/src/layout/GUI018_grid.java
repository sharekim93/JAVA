package layout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class Gui017 implements ActionListener{
	JFrame frame;
	JButton button[];
	String names[];
	JPanel panel;
	
	Gui017(){
		names = new String[]{"One","TWO","THREE","FOUR","FIVE","SIX"};
		
		frame = new JFrame("box");
		frame.setSize(400,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,1));		
		
		button = new JButton[6];
		for(int i=0;i<button.length;i++) {
			button[i] = new JButton(names[i]);
			button[i].setBackground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			button[i].setForeground(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			button[i].addActionListener(this);
			}
		
				
		frame.setLayout(new BorderLayout());
		frame.add(button[0],BorderLayout.NORTH);
		frame.add(button[1],BorderLayout.WEST);
		panel.add(button[2]);
		panel.add(button[3]);
		frame.add(panel,BorderLayout.CENTER);
		frame.add(button[4],BorderLayout.EAST);
		frame.add(button[5],BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0;i<button.length;i++)
		{if(e.getSource().equals(button[i])) {JOptionPane.showMessageDialog(null,this.button[i].getText());break;}}
	}
}

public class GUI018_grid {
	public static void main(String[] args) {
		new Gui017();
	}
}
