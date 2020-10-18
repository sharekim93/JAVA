
public class Arr005 {

	public static void main(String[] args) {

		int arr[] = new int[3];

		/*
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		*/
		int data=0;
		for(int i=0;i<arr.length;i++)
		{data+=10; arr[i]=data;}
		

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
