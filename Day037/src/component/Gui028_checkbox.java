package component;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class Checkbox implements ActionListener {
	
	JFrame frame;
	JLabel[] label;
	JPanel[] panel;
	JCheckBox[] chkbox;
	JRadioButton[] rbtn;
	
	Checkbox(){
		super();
		frame	= new JFrame();
		label	= new JLabel[] {new JLabel("CHECKBOX"),new JLabel("RADIO")};
		panel	= new JPanel[] {new JPanel(new GridLayout(3,1)),new JPanel(new GridLayout(2,1))};
		chkbox	= new JCheckBox[]{new JCheckBox("JAVA",false),new JCheckBox("JSP",false),new JCheckBox("SPRING",false)};
		for(int i=0;i<chkbox.length;i++) {
			chkbox[i].addActionListener(this);
		}
		rbtn	= new  JRadioButton[] {
				new JRadioButton("이메일 수신에 동의합니다.",true),
				new JRadioButton("이메일 수신에 동의하지 않습니다.",false)
		};
	}
	
	void create() {
		frame.setLayout(new GridLayout(2,2));
		frame.add(label[0]);
		frame.add(panel[0]);panel[0].add(chkbox[0]);panel[0].add(chkbox[1]);panel[0].add(chkbox[2]);
		frame.add(label[1]);
		frame.add(panel[1]);panel[1].add(rbtn[0]);	panel[1].add(rbtn[1]);
		
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
}

public class Gui028_checkbox {
	public static void main(String[] args) {
		new Checkbox().create();
	}

}
