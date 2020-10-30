package classArr005;

public class ClassArr005 {

	public static void main(String[] args) {
		Money_ver1[] users = new Money_ver1[]
				{new Money_ver1("aaa",10000), new Money_ver1("bbb",20000),new Money_ver1("ccc",30000)};

		Money_Show_ver1 print = new Money_Show_ver1();
		print.show(users[0]);
		print.show(users);
	}

}
