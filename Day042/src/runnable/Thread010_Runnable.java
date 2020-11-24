package runnable;

class Candy{
	String cname;
	int cprice;
	public Candy() {
		super();
	}
	public Candy(String cname, int cprice) {
		super();
		this.cname = cname;
		this.cprice = cprice;
	}	
}

class Mentos extends Candy implements Runnable{
	int num;
	
	public Mentos() {
		super();
		num=0;
		super.cname="멘토스";
		super.cprice=200;
	}
	
	
	@Override
	public void run() {
		while(true) {
			System.out.println(super.cname+ "- 가격 : "+super.cprice+" 판매수 : "+num++);
			try {
			Thread.sleep(1000);
			}
			catch (InterruptedException e) {e.printStackTrace();}
		}
	}
	
	
}


public class Thread010_Runnable {
	public static void main(String[] args) {
		/*
		Mentos th1		=	new Mentos();
		Thread mymen 	=	new Thread(th1); mymen.start();
		*/
		new Thread(new Mentos()).start();
	}

}
