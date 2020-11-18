package file;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class File007 {
	public static void main(String[] args) {
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔1234\\output";
		String filePath = "//write2.txt";
		
		Path input	=	Paths.get(folderPath+filePath);
		BufferedReader reader = null;
		
		File folder	=	new File(folderPath);
		File file	=	new File(folderPath+filePath);
		
		if(!folder.exists()||!file.exists()) {
			JOptionPane.showMessageDialog(null, "경로를 찾을 수 없습니다.");
		}
		else {
			try {
				reader = Files.newBufferedReader(input,StandardCharsets.UTF_8);
				while(true) {
					String readLine = reader.readLine();
					if(readLine==null) {break;}
					System.out.println(readLine);
				}
			}
			catch (Exception e) {e.getStackTrace();}
		}
	
	}

}
