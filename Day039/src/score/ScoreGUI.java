package score;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ScoreGUI implements ActionListener{
	JFrame frame;
	JLabel[] label;
	JPanel[] panel;
	JButton[] btn;
	String[] btnStr;
	JTextField[] text;
	
	ScoreGUI(){
		frame	= new JFrame("::::FILE");
		label	= new JLabel[] {new JLabel("JAVA SCORE",JLabel.CENTER),
								new JLabel("ID",JLabel.RIGHT),
								new JLabel("JAVA",JLabel.RIGHT),
								new JLabel("JSP",JLabel.RIGHT),
								new JLabel("SPRING",JLabel.RIGHT),
								new JLabel("PROJECT",JLabel.RIGHT)};
		btnStr	= new String[]{"1)성적입력","2)성적확인","전체성적확인"};
		panel	= new JPanel[]{new JPanel(),new JPanel(),new JPanel()};
		btn		= new JButton[] {new JButton(btnStr[0]),new JButton(btnStr[1]),new JButton(btnStr[2])};
		text 	= new JTextField[] {new JTextField(),
									new JTextField(),
									new JTextField(),
									new JTextField(),
									new JTextField()};
	}
	
	void create() {
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(3,1,2,2));
		for(int i=0;i<3;i++) {
			frame.add(panel[i]);
		}
		panel[0].setLayout(new BorderLayout());
		panel[0].add(label[0],BorderLayout.CENTER);
		label[0].setFont(new Font(Font.DIALOG,Font.BOLD,30));
		
		panel[1].setLayout(null);
		int y=25;
		for(int i=0;i<text.length;i++) {
		panel[1].add(label[i+1]);panel[1].add(text[i]);
		label[i+1].setBounds(10, y, 150, 25);text[i].setBounds(200,y,180,25);
		y+=25;
		}

		panel[2].setLayout(new GridLayout(1,3,2,2));
		for(int i=0;i<btn.length;i++) {
			btn[i].setBackground(Color.DARK_GRAY);
			btn[i].setForeground(Color.LIGHT_GRAY);
			btn[i].setFont(new Font(Font.DIALOG,Font.BOLD,15));
			btn[i].addActionListener(this);
			panel[2].add(btn[i]);
			
		}
		frame.setVisible(true);
	}
	ScoreModel input() {
		return new ScoreModel(text[0].getSelectedText(),
				Integer.parseInt(text[1].getSelectedText()),
				Integer.parseInt(text[2].getSelectedText()),
				Integer.parseInt(text[3].getSelectedText()),
				Integer.parseInt(text[4].getSelectedText()));
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(btn[0])) {}
		
	}
}