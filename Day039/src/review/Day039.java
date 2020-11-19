package review;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

class Apple_coll{
	private String type;
	private int price;
	@Override
	public String toString() {
		return "Apple_coll [type=" + type + ", price=" + price + "]";
	}
	public Apple_coll() {
		super();
	}
	public Apple_coll(String type, int price) {
		super();
		this.type = type;
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}	
}

class KimBab{
	private String type;
	private int num;
	@Override
	public String toString() {
		return "KimBab [type=" + type + ", num=" + num + "]";
	}
	public KimBab() {
		super();
	}
	public KimBab(String type, int num) {
		super();
		this.type = type;
		this.num = num;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
}

class JavaStd{
	private String id;
	private String name;
	@Override
	public String toString() {
		return "JavaStd [id=" + id + ", name=" + name + "]";
	}
	public JavaStd() {
		super();
	}
	public JavaStd(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}	
}

public class Day039 {
	public static void main(String[] args) {
		String[] apple_types = {"red","green","red","red"};
		int[] apple_prices = {100,1200,1000,1000};
		String[] kimbob_types = {"rice","danmugi","danmugi","kim"};
		int[] kimbob_prices = {1,1,1,1};
		String[] JavaStd_id = {"std1111","std2222","std3333"};
		String[] JavaStd_pass = {"iron","hulk","captain"};
				
		System.out.println("==========Apple_coll");
		//Apple_coll
		ArrayList<Apple_coll> apple_list = new ArrayList<>();
		
		for(int i=0;i<apple_types.length;i++) {
		apple_list.add(new Apple_coll(apple_types[i],apple_prices[i]));
		}
		
		Iterator<Apple_coll> iter = apple_list.iterator();
		while(iter.hasNext()) {
			Apple_coll temp = iter.next();
			System.out.println(temp.getType()+"\t"+temp.getPrice());
		}
		System.out.println("==========KimBab");
		//KimBab
		HashSet<KimBab> kimbab_list = new HashSet<>();
		for(int i=0;i<kimbob_types.length;i++) {
		kimbab_list.add(new KimBab(kimbob_types[i],kimbob_prices[i]));
		}
		
		Iterator<KimBab> iter2 = kimbab_list.iterator();
		while(iter2.hasNext()) {
			KimBab temp = iter2.next();
			System.out.println(temp.getType()+"\t"+temp.getNum());
		}
		System.out.println("==========JavaStd");
		//JavaStd
		HashMap<Integer,JavaStd> std_list = new HashMap<>();
		for(int i=0;i<JavaStd_id.length;i++) {
			std_list.put(i, new JavaStd(JavaStd_id[i],JavaStd_pass[i]));
		}
		
		Iterator<Integer> iter3 = std_list.keySet().iterator();
		while(iter3.hasNext()) {
			Integer temp = iter3.next();
			System.out.println(std_list.get(temp).getId()+"\t"+std_list.get(temp).getName());
		}
	}

}
