
class TV001{
	String channel;
	int volume;
	
	void show() {
		System.out.println("===== TV\nTV채널 : "+channel+"\nTV볼륨 : "+volume);
	}
}

public class Class004 {

	public static void main(String[] args) {
		TV001 tv=new TV001();
		tv.channel="JTBC";
		tv.volume=5;
		
		tv.show();

	}

}
