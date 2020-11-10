package collection;

import java.util.Vector;

class UserInfo{
	public static int no;
	private int cnt;
	private String name;
	private int age;
	
	UserInfo(){super();}
	UserInfo(String name, int age){
		super(); this.cnt = ++no;this.name=name; this.age=age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "USER"+cnt+" : " + name + " / " + age;
	}
}

public class Collection004 {
	public static void main(String[] args) {
		Vector user = new Vector();
		user.add(new UserInfo("아이언맨",50));
		user.add(new UserInfo("헐크",40));
		user.add(new UserInfo("캡틴",120));

		for (int i=0;i<user.size();i++) {
			System.out.println(user.get(i));
		}
	}

}
