package network;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	Network002_GUI gui;
	Timer timer;
	String name;
	
	public Sender(Socket socket,Network002_GUI gui){
		timer = new Timer();
		timer.start();
		this.socket=socket;
		this.gui = gui;
		try {out = new DataOutputStream(socket.getOutputStream());}
		catch(Exception e) {e.printStackTrace();}
		name = (socket.getPort()==523)? "CLIENT":"SERVER";
	}

	@Override
	public void run() {
		gui.addListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			try {
				String text = "["+name+" "+timer.time+"] "+gui.field.getText()+"\n";
				out.writeUTF(text);
				gui.pane.append(text);
				gui.field.setText("");
			}
			catch(IOException ie) {ie.printStackTrace();}
			}
		});
	}
}
