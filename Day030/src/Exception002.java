import javax.swing.JOptionPane;

public class Exception002 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println(10/0);
			int [] a= {10,20,30};
			for(int i=0; i<=3;i++) {
				System.out.println(a[i]);
				Integer b=null;
				System.out.println(b/10);
			}
		}
		catch(ArithmeticException e){
			System.out.println("error1 : ArithmeticException");
			JOptionPane.showMessageDialog(null, "error1 : ArithmeticException");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "error2 : ArrayIndexOutOfBoundsException");
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "error3 : NullPointerException");
		}
		*/
	
	try {
		System.out.println(10/0);
		int [] a= {10,20,30};
		for(int i=0; i<=3;i++) {
			System.out.println(a[i]);
			Integer b=null;
			System.out.println(b/10);
		}
	}
	catch(Exception e) {JOptionPane.showMessageDialog(null, "오류 있어요");}
	}


}
