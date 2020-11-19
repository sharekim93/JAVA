package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

class StdInfo{
	private int no,java,jsp,spring,project,sum;
	private String name;
	private double avg;

	@Override
	public String toString() {
		return name + "\t" + java + "\t" + jsp + "\t" + spring + "\t" + project
				+ "\t" + + sum + "\t" + avg;
	}

	public StdInfo() {
		super();
	}

	public StdInfo(int no, int java, int jsp, int spring, int project, int sum, String name, double avg) {
		super();
		this.no = no;
		this.java = java;
		this.jsp = jsp;
		this.spring = spring;
		this.project = project;
		this.sum = sum;
		this.name = name;
		this.avg = avg;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJsp() {
		return jsp;
	}

	public void setJsp(int jsp) {
		this.jsp = jsp;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}

	public int getProject() {
		return project;
	}

	public void setProject(int project) {
		this.project = project;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	

}

public class File010 {
	public static void main(String[] args) {
		String folderPath = "c:\\";
		String filePath = "\\score1.txt";
		
		File folder = new File(folderPath);
		File file = new File(folderPath+filePath);
		
		try {
		if(!folder.exists()) {folder.mkdirs();}
		if(!file.exists()) {file.createNewFile();}
		}
		catch (Exception e) {e.getStackTrace();}
		
		Path path = Paths.get(folderPath+filePath);
		
		try {
			Scanner scanner = new Scanner(System.in);
			ArrayList<StdInfo> std = new ArrayList<>();
			BufferedWriter writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8,StandardOpenOption.APPEND);
			while(true) {
				StdInfo temp = new StdInfo();
				System.out.print("■ 2020년 신입사원 평가 점수추가\n이름을 입력해주세요 > ");
				temp.setName(scanner.next());
				System.out.print("JAVA 점수를 입력해주세요 > ");
				temp.setJava(scanner.nextInt());
				System.out.print("JSP 점수를 입력해주세요 > ");
				temp.setJsp(scanner.nextInt());
				System.out.print("SPRING 점수를 입력해주세요 > ");
				temp.setSpring(scanner.nextInt());
				System.out.print("PROJECT 점수를 입력해주세요 > ");
				temp.setProject(scanner.nextInt());
				temp.setSum(temp.getJava()+temp.getJsp()+temp.getSpring()+temp.getProject());
				temp.setAvg(((int)((temp.getSum()/4d)*100))/100d);
				std.add(temp);
				System.out.println("파일추가성공");
				System.out.print("더 추가하시겠습니까?");
				if(scanner.next().trim().toLowerCase().equals("n")) {break;}
			}
			String text="";
			for(int i=0;i<std.size();i++) {
				text=std.get(i).toString();
				writer.append(text+"\n");
			}
			writer.close();
			BufferedReader reader = Files.newBufferedReader(path,StandardCharsets.UTF_8);
			try {
				System.out.println("2020년 신입사원 평가 점수\n"
						+ "===========================================================\n"
						+ "성명\tJAVA\tJSP\tSPRING\tPROJECT\tTOT\tAVG\n"
						+ "===========================================================");
				while(true) {
				String readline = reader.readLine();
				if(readline==null) {break;}
				System.out.println(readline);
				}
			}
			catch(Exception e1) {throw e1;}
		}
		catch(Exception e) {System.out.println(e.getStackTrace());}
		
		
	}
}
