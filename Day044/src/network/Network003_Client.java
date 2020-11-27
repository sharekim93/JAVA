package network;

import java.io.IOException;
import java.net.ConnectException;
import java.net.Socket;

public class Network003_Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1",523);
			
			System.out.println("[CLIENT] AS센터와 연결되었습니다.");
			Sender2 sender = new Sender2(socket);
			Receiver2 receiver = new Receiver2(socket);
			
			sender.start();
			receiver.start();
		}
		catch(ConnectException ce) {ce.printStackTrace();}
		catch(IOException ie) {ie.printStackTrace();}
		catch(Exception e) {e.printStackTrace();}
	}
	
}
