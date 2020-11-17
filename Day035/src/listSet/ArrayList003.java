package listSet;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class UserInfo{

	static int no;
	private int cnt;
	private String name;
	private int age;
	
	UserInfo(){super();}
	UserInfo(String name, int age){
		super();
		this.cnt = no++;
		this.name	=	name;
		this.age	=	age;
	}
	
	
	@Override
	public String toString() {
		return "UserInfo"+cnt+ "[name=" + name + ", age=" + age + "]";
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

}

public class ArrayList003 {
	public static void main(String[] args) {
		ArrayList users = new ArrayList();
		UserInfo[] info = {new UserInfo("IRON",50),new UserInfo("HULK",40),new UserInfo("CAPTAIN",120)};
		users.add(info[0]);
		users.add(info[1]);
		users.add(info[2]);
		
		System.out.println(info[0].toString());
		System.out.println("==============");
		System.out.println("NAME\tAGE");
		System.out.println("==============");
		for(int i=0;i<users.size();i++) {
			if(users.get(i).equals(info[0])) {System.out.println(info[0].getName()+"\t"+info[0].getAge());}
			if(users.get(i).equals(info[1])) {System.out.println(info[1].getName()+"\t"+info[1].getAge());}
			if(users.get(i).equals(info[2])) {System.out.println(info[2].getName()+"\t"+info[2].getAge());}
		}
		String text="";
		for(int i=0;i<users.size();i++) {
			text+=(info[i].getName()+info[i].getAge()+"\n-------------------------\n");
		}
		JOptionPane.showMessageDialog(null, text);
	}

}
