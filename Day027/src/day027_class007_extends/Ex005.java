package day027_class007_extends;

import java.util.Arrays;

class SutdaCard extends Object{
	int num;
	boolean isKwang;
	
	public SutdaCard() {this(1,true);}
	public SutdaCard(int num, boolean isKwang) {
		super();this.num=num; this.isKwang=isKwang;}
	
	@Override
	public String toString() {
		return ""+num+(isKwang? "K":"");
	}	
}

class StudaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards= new SutdaCard[20];
	StudaDeck(){super();
		for(int i=0;i<CARD_NUM;i++) {
			int j;
			boolean kwang=false;
			if((i+1)%10==0) {j=10;}
			else {j=(i+1)%10;}
			
			if (i+1==1||i+1==3||i+1==8) {kwang=true;}
			cards[i]=new SutdaCard(j,kwang);
		}	
	}

	@Override
	public String toString() {
		return "StudaDeck [CARD_NUM=" + CARD_NUM + ", cards=" + Arrays.toString(cards) + "]";
	}
}

public class Ex005 {
	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(); System.out.println(card1);
		SutdaCard card2 = new SutdaCard(3,false); System.out.println(card2);
		System.out.println("------------------------------");
		StudaDeck deck = new StudaDeck(); System.out.println(deck);
	}// end main
}//end class
