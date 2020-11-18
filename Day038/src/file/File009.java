package file;

import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

class Milk{
	private String no;
	private String name;
	private String price;
	public Milk() {
		super();
	}
	public Milk(String no, String name, String price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return no + " " + name + " " + price ;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
}

public class File009 {
	public static void main(String[] args) {
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔123456\\output";
		String filePath = "\\write3.txt";
		ArrayList<Object> list = new ArrayList<>();
		String[] lines=null;
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
					else {lines = reader.readLine().split(" ");
							if (lines[0].matches("[0-9].*")) {
								for(int i=0;i<lines.length;i++) {
									System.out.print(lines[i]+"\s");
								}
								System.out.println("\n----------------");
								list.add(new Milk(lines[0],lines[1],lines[2]));
							}
					}
				}
				reader.close();
			}
			catch(Exception e) {e.getStackTrace();}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("■ 원하는 우유번호를 입력하세요 > ");
		System.out.println(list.get(scanner.nextInt()-1));
	}

}
