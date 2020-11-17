package generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class MilkDto1{
	private int mno;
	private String mname;
	private int mprice;
	public MilkDto1() {
		super();
	}
	public MilkDto1(int mno, String mname, int mprice) {
		super();
		this.mno = mno;
		this.mname = mname;
		this.mprice = mprice;
	}
	@Override
	public String toString() {
		return mno + "\t" + mname + "\t" + mprice ;
	}
	public int getMno() {
		return mno;
	}
	public String getMname() {
		return mname;
	}
	public int getMprice() {
		return mprice;
	}
}

class WildPrint<Object>{
	private Object a;

	public WildPrint(Object a) {
		super();
		this.a = a;
	}

	@Override
	public String toString() {
		return "WildPrint [a=" + a + "]";
	}

	public Object getA() {
		return a;
	}

	public void setA(Object a) {
		this.a = a;
	}
	
	void show() {
		
		
		System.out.println("===============================\n"
				+ "NO\tNAME\tPRICE\n"
				+ "===============================");
		if(a instanceof ArrayList){
			Iterator<Object> iter = ((ArrayList) a).iterator();
			while(iter.hasNext()) {
				Object temp = iter.next();
				System.out.println(temp);
			}	
		}
		else if(a instanceof HashSet) {
			Iterator<Object> iter = ((HashSet) a).iterator();
			while(iter.hasNext()) {
				Object temp = iter.next();
				System.out.println(temp);
			}
		}
		else if(a instanceof HashMap) {
			Iterator<Object> iter = ((HashMap) a).keySet().iterator();
			while(iter.hasNext()) {
				Object temp = iter.next();
				System.out.println(((HashMap) a).get(temp));
			}
		}
	}
	
}

public class Generics004 {
	public static void main(String[] args) {
		System.out.println("\n\n■ [001] ArrayList");
		ArrayList<MilkDto1> list = new ArrayList<MilkDto1>();
		list.add(new MilkDto1(1,"white",1000));
		list.add(new MilkDto1(2,"choco",1200));
		
		System.out.println("\n\n■ [002] HashSet");
		HashSet<MilkDto1> set = new HashSet<MilkDto1>();
		set.add(new MilkDto1(1,"white",1000));
		set.add(new MilkDto1(2,"choco",1200));
		
		System.out.println("\n\n■ [003] HashMap");
		HashMap<Integer, MilkDto1> map = new HashMap<Integer,MilkDto1>();
		map.put(1,new MilkDto1(1,"white",1000));
		map.put(2,new MilkDto1(2,"choco",1200));
		
		WildPrint<?>print = new WildPrint<ArrayList>(list); print.show();
					print = new WildPrint<HashSet>(set); print.show();
					print = new WildPrint<HashMap>(map); print.show();
	}

}
