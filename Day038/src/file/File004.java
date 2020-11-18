package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class File004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔123\\output";
		String filePath = "\\write004.txt";
		
		File folder = new File(folderPath);
		File file = new File(filePath);	
		
		try{
		if(!folder.exists()) {folder.mkdirs();}
		if(!file.exists()) {file.createNewFile();}
		}
		catch(Exception e) {e.getStackTrace();}
		Path output = Paths.get(folderPath+filePath);
			
		try {
			BufferedWriter write = Files.newBufferedWriter(output,StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			System.out.println("콘솔실행");
			System.out.print("\t강아지이름은 > ");
			String name = scanner.next();
			write.write(name); write.write('\s');
			System.out.println(name+"이(가) 추가되었습니다.");
			write.close();
		}
		catch(IOException e) {e.getStackTrace();}
	}
}
