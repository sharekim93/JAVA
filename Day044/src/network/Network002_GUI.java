package network;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Network002_GUI {
	JFrame frame;
	JPanel panel,panel2;
	JTextArea pane;
	JTextField field;
	JButton	send;
	
	public Network002_GUI(){
		super();
		frame	=	new JFrame("JAVA TALK");
		panel	=	new JPanel();
		panel2	=	new JPanel();
		pane	=	new JTextArea();
		field	=	new JTextField(20);
		send	=	new JButton("전송");
	}
	
	public Network002_GUI(String name){
		super();
		frame	=	new JFrame("JAVA TALK : "+name);
		panel	=	new JPanel();
		panel2	=	new JPanel();
		pane	=	new JTextArea();
		field	=	new JTextField(20);
		send	=	new JButton("전송");
	}
	
	void create() {
		frame.setBounds(600,300,500,550);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(null);
	
		panel.setBounds(10, 20, 500, 500);
		panel.setLayout(null);
		
		pane.setBounds(10, 20, 440, 400);
		panel.add(pane);
		
		field.setBounds(10, 440, 340, 30);
		panel.add(field);
		
		send.setBounds(360, 440, 90, 30);
		send.setBackground(new Color(217,217,217));
		send.setFont(new Font("맑은 고딕",Font.BOLD,15));
		
		panel.add(send);
		frame.add(panel);
		
	}
	public String input() {
		return field.getText();
	}
	public void addListener(ActionListener a) {
		send.addActionListener(a);
	}
}

