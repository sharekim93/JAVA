package gui;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Gui001 {
	Frame frame;
	Button button;
	
	public Gui001() {
		frame = new Frame("BOX");
		button = new Button ("BTN1");
	}
	public void create() {
		//1. 프레임.add(컴포넌트)
		//2. 프레임.setSize(사이즈 지정)
		//3. 프레임.setVisible
		frame.add(button);
		frame.setSize(300,300);
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {		}

			@Override
			public void windowClosed(WindowEvent arg0) {	}

			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				}
			@Override
			public void windowDeactivated(WindowEvent arg0) {	}

			@Override
			public void windowDeiconified(WindowEvent arg0) {	}

			@Override
			public void windowIconified(WindowEvent arg0) {		}

			@Override
			public void windowOpened(WindowEvent arg0) {	}
			
		});
	}
}

public class Gui001_awt{
	public static void main(String[] args) {
		new Gui001().create();
	}
}
