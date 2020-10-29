package day025_class005_modifier;

/*
Q. MyTv2 isPowerOn, channel,volume 클래스의 멤버변수를 
클래스[외부에서 접근할 수 없도록 제어자] 를 붙이고 
대신 이 변수들의 값을 어디서나 읽고 변경할 수 있도록 getter,setter를 추가하시오.
*/

final class MyTv2{
	private boolean isPowerOn;
	private int channel;
	private int volume;
	final int MAX_VOLUME =100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL =100;
	final int MIN_CHANNEL = 1;
	
	//생성자
	MyTv2(){
		this.isPowerOn=false;
		this.channel=MIN_CHANNEL;
		this.volume=MIN_VOLUME;
	}

	public boolean isPowerOn() {
		return isPowerOn;
	}

	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = !isPowerOn;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		if(channel<=MAX_CHANNEL&&channel>=MIN_CHANNEL) {this.channel = channel;}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if(volume<=MAX_VOLUME&&volume>=MIN_VOLUME){this.volume = volume;}
	}
	
	//getter, setter
	
}
public class Ex021 {

	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		t.setChannel(10);
		System.out.println("CH:"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL:"+t.getVolume());
	}

}
