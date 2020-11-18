package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Scanner;

class MilkDtoF1{
	private int mno;
	private String mname;
	private int mprice;
	
	
	public MilkDtoF1() {
		super();
	}
	public MilkDtoF1(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}
	
	@Override
	public String toString() {
		return "MilkDtoF1 [mno=" + mno + ", mname=" + mname + ", mprice=" + mprice + "]";
	}
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}	
}

public class File002 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<MilkDtoF1> list = new ArrayList<>();
		
		int cnt=0;
		while(true) {
		MilkDtoF1 milk = new MilkDtoF1();
		milk.setMno(++cnt);
		System.out.print("□ 우유이름입력 > ");
		milk.setMname(scanner.next());
		System.out.print("□ 우유가격입력 > ");
		milk.setMprice(scanner.nextInt());
		
		list.add(milk);
		System.out.print("입력이 다 끝났습니까? (y/n) > ");
		if(scanner.next().trim().toLowerCase().equals("y")) {break;}
		}
		
		String date = ""+Calendar.getInstance().get(Calendar.YEAR)
				+(Calendar.getInstance().get(Calendar.MONTH)+1)
				+Calendar.getInstance().get(Calendar.DATE);
		String folderPath = "\\\\523-t\\★JAVA ORACLE\\DAY038\\김나눔12\\output";
		String filePath = "\\write2.txt";
		
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
			Iterator<MilkDtoF1> iter = list.iterator();
			while(iter.hasNext()) {
				MilkDtoF1 temp = iter.next();
				write.write(""+temp.getMno());write.append('\s');
				write.write(temp.getMname());write.append('\s');
				write.write(""+temp.getMprice());write.append('\s');
				write.newLine();
			}
			write.close();	
		}
		catch(IOException e) {e.getStackTrace();}
	}

}
