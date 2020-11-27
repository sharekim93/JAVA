package network;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Network003_Server {
	public static void main(String[] args) {
		ServerSocket serversocket=null;
		Socket		 socket=null;
		try {
			System.out.println(">>> 서버 연결을 시도합니다.");
			serversocket = new ServerSocket(523);
			System.out.println("서버와 연결 되었습니다.");
			socket = serversocket.accept();
			System.out.println("상담이 시작되었습니다.");
			
			Sender2	 sender		=	new Sender2(socket);
			Receiver2 receiver	=	new Receiver2(socket);
			
			sender.start();
			receiver.start();
		}
		catch (Exception e) {e.printStackTrace();}
	}
}

class Sender2 extends Thread{
	Socket socket;
	DataOutputStream out;
	
	public Sender2(Socket socket){
		this.socket=socket;
		try {
			out = new DataOutputStream(socket.getOutputStream());
		}
		catch(Exception e) {e.printStackTrace();}
	}

	@Override
	public void run() {
		Scanner scanner	=	new Scanner(System.in);
		while(out!=null) {
			try {
				out.writeUTF(scanner.nextLine());
			}
			catch(IOException e) {}
		}
	}
}

class Receiver2 extends Thread{
	Socket socket;
	DataInputStream in;
	String txt;
	Timer timer;
	String name;
	
	public Receiver2(Socket socket){
		timer = new Timer();
		timer.start();
		this.socket=socket;
		try {
			in = new DataInputStream(socket.getInputStream());
			if(socket.getPort()==523) {name = "SERVER";}
			else {name = "CLIENT";}
		}
		catch(Exception e) {e.printStackTrace();}
	}

	@Override
	public void run() {
		while(in!=null) {
			try {
				txt = "["+name + " "+timer.time+"] "+in.readUTF();
				System.out.println(txt);
			}
			catch(IOException e) {e.printStackTrace();}
		}
	}
}
class Timer2 extends Thread{
	SimpleDateFormat sdf;
	String time;
	Timer2(){
		super();
		sdf = new SimpleDateFormat("HH:mm:ss");
		time = "";
	}

	@Override
	public void run() {
		while(true) {
		time = sdf.format(System.currentTimeMillis());
		try {sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
		}
	}
}