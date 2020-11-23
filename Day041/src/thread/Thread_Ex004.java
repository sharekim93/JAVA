package thread;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class GUI {
	JFrame frame;
	JPanel panel,panel2;
	JTextArea area;
	JTextField textfield;
	JButton send, close;
	JLabel time;
	
	public GUI(){
		frame	=	new JFrame("[JAVA TALK]");
		panel	=	new JPanel();
		panel2	=	new JPanel();
		area	=	new JTextArea();
		textfield	=	new JTextField();
		send	=	new JButton("전송");
		close	=	new JButton("닫기");
		time	=	new JLabel();
	}
	
	public void create() {
		frame.setBounds(400, 500, 500, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		
		//panel1
		panel.setPreferredSize(new Dimension(500,40));
		panel.setBackground(Color.DARK_GRAY);
		panel.setLayout(null);
		time.setBackground(Color.DARK_GRAY);
		time.setForeground(Color.white);
		time.setFont(new Font("맑은 고딕",Font.BOLD,15));
		time.setBounds(330, 10, 150, 20);
		
		panel2.setPreferredSize(new Dimension(500,40));
		panel2.setLayout(new FlowLayout());
		
		textfield.setPreferredSize(new Dimension(300,30));
		
		send.setPreferredSize(new Dimension(60,30));
		send.setBackground(Color.DARK_GRAY);
		send.setForeground(Color.white);
		send.setFont(new Font("맑은 고딕",Font.BOLD,13));
		
		close.setPreferredSize(new Dimension(60,30));
		close.setBackground(Color.DARK_GRAY);
		close.setForeground(Color.white);
		close.setFont(new Font("맑은 고딕",Font.BOLD,13));
		
		panel2.add(textfield);
		panel2.add(send);
		panel2.add(close);
		
		
		panel.add(time);
		frame.add(panel,BorderLayout.NORTH);
		frame.add(area,BorderLayout.CENTER);
		frame.add(panel2,BorderLayout.SOUTH);
		
	}
}
public class Thread_Ex004 {
	public static void main(String[] args) {
	new CurrentTimer().start();
	}

}
