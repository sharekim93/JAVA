package network;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Network002_Client extends Thread {
	Network002_GUI gui;
	Socket socket;
	Network002_Client(){
		gui = new Network002_GUI(this.toString());
		socket = null;
		}
	@Override
	public void run() {
		gui.create();
		
		try {
			socket = new Socket("127.0.0.1",523);
			gui.pane.append("상담이 시작되었습니다.\n");
			Sender sender = new Sender(socket,gui);
			Receiver receiver = new Receiver(socket,gui);
			
			sender.start();
			receiver.start();
		}
		catch(ConnectException ce) {ce.printStackTrace();}
		catch(IOException ie) {ie.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
	}
	@Override
	public String toString() {
		return "CLIENT";
	}

}

