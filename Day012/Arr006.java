
public class Arr006 {

	public static void main(String[] args) {

		float arrfloat[] = new float[5];
		float data = 1.1f;
		boolean first =true;
		for (int i = 0; i < arrfloat.length; i++) {
			arrfloat[i] = data;data += 0.1f;
			if(first) {first=false;}
			else {System.out.print(", ");}
			System.out.print(String.format("%.1f",arrfloat[i]));}
		
	
	}

}
