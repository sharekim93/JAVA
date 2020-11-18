package file;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JOptionPane;

public class File008 {
	public static void main(String[] args) {
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔123456\\output";
		String filePath = "\\write3.txt";
		
		Path input = Paths.get(folderPath+filePath);
		BufferedReader reader=null;
		
		File folder = 	new File(folderPath);
		File file 	=	new File(folderPath+filePath);
		
		if(!folder.exists()||!file.exists()) {
			JOptionPane.showMessageDialog(null, "파일을 찾을 수 없습니다.");
		}
		else {
			try {
				reader = Files.newBufferedReader(input);
				while(true) {
					if(reader.lines()==null) {break;}
					else {String[] lines = reader.readLine().split(" ");
							if (lines[0].matches("[0-9].*")) {
								for(int i=0;i<lines.length;i++) {
									System.out.print(lines[i]+"\s");
								}
								System.out.println();
							}
					}
				}
			}
			catch(Exception e) {e.getStackTrace();}
		}
	}

}
