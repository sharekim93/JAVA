package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Network001_Client {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			Socket socket = new Socket("127.0.0.1",523);
			System.out.println("3. [CLIENT] 서버연결시도");
			
			while(true) {
			DataOutputStream write 	= new DataOutputStream(socket.getOutputStream());			
			DataInputStream read = new DataInputStream(socket.getInputStream());
			System.out.println("[CLIENT] 서버로부터 받은 메시지 : "+read.readUTF());
			
			String txt = scanner.next();
			write.writeUTF(txt);

			if(socket !=null&&!socket.isClosed()) {socket.close();}
			}
			
		}
		catch (UnknownHostException e) {e.printStackTrace();}
		catch (IOException e) {e.printStackTrace();}
	}
	
}
