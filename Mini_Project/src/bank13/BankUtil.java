package bank13;

import java.util.ArrayList;
import java.util.Scanner;

public class BankUtil {
	Scanner scanner = new Scanner(System.in);
	ArrayList<Model> model = new ArrayList<Model>(3);

	public String[] userinfo() {
		String temp[]=new String[2];
		System.out.print("*ID :");
		temp[0] = scanner.nextLine();
		System.out.print("*PASS :");
		temp[1] = scanner.nextLine();
		return temp;
	}
	
	public double inputBal() {
		System.out.print("*BALANCE :");
		return scanner.nextDouble();
	}
	
	public int userIndex(String[] temp) {
		int index=-1;
		for(int i=0;i<model.size();i++) {
		if((temp[0].equals(model.get(i).getId())) && (temp[1].equals(model.get(i).getPass()))){index=i;}
		}
		return index;
	}
		
	public boolean validate_id(String id) {
		boolean result=true;
		try {
			for (int j=0; j<id.length();j++) {
				if(id.charAt(j)=='\s') {
				result=false;
				throw new Exception("ID에 빈칸이 입력 되었습니다.");
				}
			}
		}
		catch (Exception e) {System.out.println(e.getMessage());}
		return result;
}
	
	public boolean validate_pass(String pass) {
		String temp_pass =null;
		boolean result=false;
		
		try {
			for (int j=0; j<pass.length();j++) {
				if(pass.charAt(j)=='\s') {throw new Exception("비밀번호에 빈칸이 입력되었습니다.");}
			}
			System.out.println("비밀번호를 한 번 더 입력하세요 > ");
			temp_pass = scanner.nextLine();
	
			if(pass.equals(temp_pass)) result=true;
			else {throw new Exception("비밀번호가 일치하지 않습니다.");}
		}
		catch (Exception e) {System.out.println(e.getMessage());}
		return result;
	}
	
	public boolean validate_bal(double bal) {
		boolean result=false;
		try {
		if(bal>0) {result=true;}
		else {throw new Exception("입력 금액을 확인해주세요");}
		}
		catch(Exception e) {System.out.println(e.getMessage());}
		return result;
	}
	
	public void checkCapacity(ArrayList<Model> model) {
			try{
				if(model.size()>=3) {throw new Exception("더 이상 계좌를 추가할 수 없습니다.");}
			}
			catch(Exception e){System.out.println(e.getMessage());}
	}
}
