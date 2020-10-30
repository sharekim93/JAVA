package classArr003;

public class ClassArr003 {

	public static void main(String[] args) {
		Apple user1[] = new Apple[3];
		for (int i=0;i<user1.length;i++) {
			user1[i] = new Apple();
		}
		
		Apple_print print = new Apple_print();
		print.show(user1[0]);
		print.show(user1);
	}

}
