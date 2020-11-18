package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;

public class File001_Write001 {
	public static void main(String[] args) {
		//1. folder 만들기
		String date =""+ Calendar.getInstance().get(Calendar.YEAR)
				+(Calendar.getInstance().get(Calendar.MONTH)+1)
				+Calendar.getInstance().get(Calendar.DATE);
		String folderPath = "C:\\file\\file_"+date;
		String filePath	=	"\\write1.txt";
	
		File folder = new File(folderPath);
		System.out.println("FOLDER EXIST?"+folder.exists());
		if(!folder.exists()) {folder.mkdirs();}
		
		File file = new File(folderPath+filePath);
		try {
		if(!file.exists()) {file.createNewFile();}
		}
		catch(Exception e) {e.printStackTrace();
		}
		
		Path output = Paths.get(folderPath+filePath);
		try {
			BufferedWriter write = Files.newBufferedWriter(output,  StandardCharsets.UTF_8); // ★★ 대부분의 공공기관에서 쓰는 개념
			write.write("APPLE");	 write.newLine();
			write.write("BANANA");	 write.newLine();
			write.write("COCONUT");	 write.newLine();
			write.close(); // close를 안 하면 작성이 안 됨!!!
		}
		catch(IOException e) {e.printStackTrace();}
	}

}
