
public class Ext001_bit {

	public static void main(String[] args) {
		System.out.println(16<<3); //128  16*2^3
		System.out.println(16>>3); //2    16/2^3
		
		// 1bit > 0,1
		// 2bit > (0,1) (0,1) > 2^2 = 4 
		// 8bit >  1byte
		// 1	2	4	8	16	32	64	128	256
		// 2^0	2^1	2^2	2^3	2^4	2^5	2^6	2^7	2^8
		
		System.out.println(3<<2);
		int x =2;
		System.out.println(1+x <<33); //int는 2^32까지라 overflow
	}

}
