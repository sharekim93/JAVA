package network;

public class Network002 {

	public static void main(String[] args) {
		Network002_Server server = new Network002_Server();
		Network002_Client client = new Network002_Client();
		
		server.start();
		try {Thread.sleep(500);} 
		catch (InterruptedException e) {e.printStackTrace();}
		client.start();
	}

}
