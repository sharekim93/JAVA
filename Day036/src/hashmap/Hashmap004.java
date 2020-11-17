package hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class Hashmap004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String,String> map = new HashMap<>();
		map.put("first", "1111");
		map.put("second","2222");
		map.put("third", "3333");
		
		while(true) {
		System.out.print("id와 password를 입력해주세요.\nid > ");
		String temp_id = scanner.nextLine();
		System.out.print("password > ");
		String temp_pass = scanner.nextLine();
		
		try {
			if(!map.containsKey(temp_id)){throw new Exception("입력하신 유저는 존재하지 않습니다. 다시 입력해주세요\n");}
			else if(!map.containsValue(temp_pass)) {throw new Exception("비밀번호가 일치하지 않습니다.\n");}
			else {System.out.println("id와 비밀번호가 일치합니다.\n");}
		}
		catch(Exception e){System.out.println(e.getMessage());}
		}
	}

}
