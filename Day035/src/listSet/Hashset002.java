package listSet;

import java.util.HashSet;
import java.util.Iterator;

class Milk{

	private String mname;
	private int mprice;
	
	public Milk() {super();}
	public Milk(String mname, int mprice) {
		super();
		this.mname = mname;
		this.mprice = mprice;
	}
	
	@Override
	public String toString() {
		return mname + "\t" + mprice;
	}
	
	public String getMname() {
		return mname;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public void setMprice(int mprice) {
		this.mprice = mprice;
	}
	
}

public class Hashset002 {
	public static void main(String[] args) {
		HashSet<Object> set= new HashSet<>();
		set.add(new Milk("바나나우유",1300));
		set.add(new Milk("메론맛우유",1800));
		set.add(new Milk("커피우유",1500));
		set.add(new Milk("커피우유",1500));
	
		System.out.println("개수 : "+set.size()+"개. 커피우유가 이름과 가격이 같은 Milk Object지만 주소가 다름");
		Iterator<Object> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next().hashCode()+"\t");
		}
		iter = set.iterator();
		System.out.println("\n------------------------");
		System.out.println("NAME\tPRICE");
		System.out.println("------------------------");
		while(iter.hasNext()) {
			System.out.println(((Milk)iter.next()).toString()+"\n------------------------");
		}
	}

}
