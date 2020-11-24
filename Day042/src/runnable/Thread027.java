package runnable;

import java.util.HashMap;
import java.util.Scanner;

class UserInfo {
	HashMap<String,Integer> user;
	
	UserInfo(){
		super();
		 user= new HashMap<>();
		 user.put("aaa",111);
		 user.put("bbb",222);
		 user.put("ccc",333);
	}
	
	@Override
	public String toString() {
		return "UserInfo [user=" + user + "]";
	}
}

class Find implements Runnable{
	String id;
	UserInfo userinfo;
	Thread thread;
	
	Find(){
		super();
		this.id="";
		this.userinfo = new UserInfo();
		this.thread = new Thread();
	}
	Find(UserInfo userinfo){
		super();
		this.id="";
		this.userinfo=userinfo;
		this.thread = new Thread();
	}
	Find(Thread thread){
		super();
		this.id="";
		this.userinfo = new UserInfo();
		this.thread = thread;
	}
	@Override
	public void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
		System.out.println("유저의 아이디를 입력하시오 > ");
		id=scanner.next();
		if(userinfo.user.containsKey(id)) {
			System.out.println(userinfo.user.get(id));
		}
		else {System.out.println("일치하는 정보가 없습니다.");}
		}
	}
}


public class Thread027 {
	public static void main(String[] args) {
		UserInfo userinfo = new UserInfo();
		Find find = new Find(userinfo);
		Thread thd2 = new Thread(find);
		thd2.start();
		
		
		
	}

}
