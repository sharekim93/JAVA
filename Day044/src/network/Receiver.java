package network;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver extends Thread{
	Socket socket;
	DataInputStream in;
	String txt;
	Timer timer;
	Network002_GUI gui;
	
	public Receiver(Socket socket,Network002_GUI gui){
		this.socket = socket;
		this.gui=gui;
		txt="";
		timer = new Timer();
		timer.start();
		this.socket=socket;
		try {
			in = new DataInputStream(socket.getInputStream());
		}
		catch(Exception e) {e.printStackTrace();}
	}

	@Override
	public void run() {
		while(in!=null) {
			try {
				txt = in.readUTF();
				gui.pane.append(txt);
			}
			catch(IOException e) {e.printStackTrace();}
		}
	}
}
