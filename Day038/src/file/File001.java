package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class File001 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYYMMddhhmmss");
		String date = sdf.format(Calendar.getInstance().getTime());
						
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔12\\output";
		String filePath = "\\write1_"+date+".txt";
		
		File folder = new File(folderPath);
		if(!folder.exists()) {folder.mkdirs();}
		
		File file = new File(folderPath+filePath);
		try {
		if(!file.exists()) {file.createNewFile();}
		}
		catch(Exception e) {e.getStackTrace();}
		
		Path output = Paths.get(folderPath+filePath);
		try {
			BufferedWriter write = Files.newBufferedWriter(output, StandardCharsets.UTF_8);
			System.out.print("■ 우유이름입력 >");
			write.write(scanner.next()); write.newLine();
			System.out.print("■ 우유가격입력 >");
			write.write(""+scanner.nextInt());write.newLine();
			write.close();
			System.out.println("파일쓰기 성공!");
		}
		catch(IOException e) {e.getStackTrace();}
	}

}
