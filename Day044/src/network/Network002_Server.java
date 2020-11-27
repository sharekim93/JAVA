package network;

import java.net.ServerSocket;
import java.net.Socket;


public class Network002_Server extends Thread {
	Network002_GUI gui;
	ServerSocket serversocket;
	Socket		 socket;
	
	Network002_Server(){
		gui	= new Network002_GUI(this.toString());
		serversocket = null;
		socket	= null;
	}
	
	@Override
	public String toString() {
		return "SERVER";
	}

	@Override
	public void run() {
		 try
			{
			gui.create();
			serversocket = new ServerSocket(523);
			socket = serversocket.accept();
			gui.pane.append("상담이 시작 되었습니다.\n");
			Sender	 sender		=	new Sender(socket,gui);
			Receiver receiver	=	new Receiver(socket,gui);
			sender.start();
			receiver.start();
			}
			catch (Exception e) {e.printStackTrace();}
	}
}


