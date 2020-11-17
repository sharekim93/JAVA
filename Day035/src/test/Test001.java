package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class Gui{
	JFrame frame;
	JButton[] btn;
	String[] names;
	
	Gui(){
		frame	=	new JFrame();
		btn		=	new JButton[5];
		names	=	new String[]{"ONE","TWO","THREE","FOUR","FIVE"};
	}
	
	void create() {
		frame.setSize(500,150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLayout(new FlowLayout());
		
		for(int i=0;i<btn.length;i++) {
			btn[i]	=	new JButton(names[i]);
			btn[i].setPreferredSize(new Dimension(80,80));
			btn[i].addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					if(e.getSource().equals(btn[0])){JOptionPane.showMessageDialog(null, names[0]);
													btn[0].setBackground(Color.black);}
					else if(e.getSource().equals(btn[1])){JOptionPane.showMessageDialog(null, names[1]);
													btn[1].setBackground(Color.red);}
					else if(e.getSource().equals(btn[2])){JOptionPane.showMessageDialog(null, names[2]);
													btn[2].setBackground(Color.green);}
					else if(e.getSource().equals(btn[3])){JOptionPane.showMessageDialog(null, names[3]);
													btn[3].setBackground(Color.blue);}
					else if(e.getSource().equals(btn[4])){JOptionPane.showMessageDialog(null, names[4]);
													btn[4].setBackground(Color.white);}
				}
			
			});
			frame.add(btn[i]);
		}
		frame.setVisible(true);
		
		
	}
}

public class Test001 {
	public static void main(String[] args) {
		new Gui().create();
	}

}
