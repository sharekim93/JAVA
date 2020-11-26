package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Network001 {
	public static void main(String[] args) {		

}
class SocketServer{
	ServerSocket server;
	DataOutputStream writer;
	DataInputStream reader;
	Socket socket;
	
	public SocketServer() {
	System.out.println("1. 서버 생성");
	try {server = new ServerSocket(523);}catch (IOException e) {e.printStackTrace();}
	System.out.println("2. 연결을 기다리는 중");
	try {
		socket = server.accept();
		System.out.println("3. 연결되었습니다.");
		writer	= new DataOutputStream(socket.getOutputStream());			
		reader	= new DataInputStream(socket.getInputStream());
		
		writer.writeUTF("[SERVER] 안녕하세요 고객님");
		System.out.println("6.상담사 연결확인 메시지 보내기");

		if(socket !=null&&!socket.isClosed()) {socket.close();}
	}
	catch(IOException e) {e.printStackTrace();}

}
}
	
	
class WriterThread implements Runnable{
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String txt = scanner.next();
			System.out.println(txt);
			
		}
		}
	}
	
}
