package review;

import java.util.ArrayList;

class UserInfo {
	private String name;
	private int age;
	
	UserInfo(){super();}
	UserInfo(String name, int age){super();this.name=name;this.age=age;}
	
	@Override
	public String toString() {return "UserInfo [name=" + name + ", age=" + age + "]";}
	public String getName() {return name;}

	public int getAge() {return age;}
	public void setName(String name) {this.name = name;}
	public void setAge(int age) {this.age = age;}
}

public class Day036_1 {
	public static void main(String[] args) {
		
		ArrayList<UserInfo> user = new ArrayList<UserInfo>();
		
		user.add(new UserInfo("IRON",50));
		user.add(new UserInfo("HULK",40));
		user.add(new UserInfo("CAPTAIN",120));
		
		System.out.println("=====================");
		System.out.println("NAME\tAGE");
		System.out.println("=====================");
		
		for(int i=0;i<user.size();i++) {
			System.out.println(user.get(i).getName()+"\t"+user.get(i).getAge());
		}
		
		
	}

}
