package gui;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

class Gui005{
	
	JFrame frame;
	JButton button[];
	
	Gui005(){
		frame = new JFrame();
		button = new JButton[] {new JButton("ONE"),new JButton("TWO"),new JButton("THREE"),
				new JButton("FOUR"),new JButton("FIVE")};
	}
	
	void create() {
		button[0].setBackground(Color.DARK_GRAY);
		button[0].setForeground(Color.LIGHT_GRAY);
		
		button[0].setFont(new Font(Font.SERIF, Font.BOLD, 20));
		button[1].setFont(new Font(Font.DIALOG, Font.ITALIC, 20));
		
		button[0].setCursor(new Cursor(Cursor.WAIT_CURSOR));
		button[1].setCursor(new Cursor(Cursor.HAND_CURSOR));
		button[2].setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
		
		button[2].setEnabled(false);
		
		button[0].setPreferredSize(new Dimension(50,50));
		
		frame.setLayout(new FlowLayout());
		for (int i=0;i<button.length;i++) {
			frame.add(button[i]);
		}
		frame.setSize(700,200);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class Gui005_Font {
	public static void main(String[] args) {
		new Gui005().create();
	}

}
