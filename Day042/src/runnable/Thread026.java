package runnable;

import java.util.ArrayList;
import java.util.Scanner;

class Hello implements Runnable{
	ArrayList<Object> user;
	
	Hello(){
		super();
		 user= new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "Hello [user=" + user + "]";
	}
	
	@Override
	public void run() {
		for(int i=40;i>0;i++) {
			System.out.println("HELLO");
			try {Thread.sleep(2000);} 
			catch (InterruptedException e) {break;}
		}
	}
	
}

class Input implements Runnable{
	String id;
	Hello hello;
	Thread thread;
	
	Input(){
		super();
		this.id="";
		this.hello = new Hello();
		this.thread = new Thread();
	}
	Input(Hello hello){
		super();
		this.id="";
		this.hello=hello;
		this.thread = new Thread();
	}
	Input(Thread thread){
		super();
		this.id="";
		this.hello = new Hello();
		this.thread = thread;
	}
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("유저의 아이디를 입력하시오 > ");
		id=scanner.next();
		System.out.println(id+"안녕");
		hello.user.add(id);
		System.out.println(hello.user.toString());
		if(!hello.user.isEmpty()) {thread.interrupt();}
		}
	}
}


public class Thread026 {
	public static void main(String[] args) {
		Hello hello = new Hello();
		Thread thd1 = new Thread(hello);
		Input input = new Input(thd1);
		Thread thd2 = new Thread(input);
		thd1.start();
		thd2.start();
		
		
		
	}

}
