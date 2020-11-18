package file;

import java.io.File;

public class File000 {
	public static void main(String[] args) {
		//	1. folder 확인
			File folder = new File("C:\\file");
			System.out.println("FOLDER EXIST : "+folder.exists());
		//	2. folder 만들기
			if(!folder.exists()) {folder.mkdir();}
			System.out.println("FOLDER EXIST : "+folder.exists());
		//	3. file 확인
			File file = new File("C:\\file\\"+"file000.txt");
			System.out.println("FILE EXIST : "+file.exists());
		//	4. file 만들기
			try {
				if(!file.exists()) {file.createNewFile();}
				System.out.println("FILE EXIST : "+file.exists());
			}
			catch(Exception e) {e.printStackTrace();}
	}

}
