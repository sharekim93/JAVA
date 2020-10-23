import java.util.Calendar;

public class MethodApi006 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		
		System.out.print(today.get(1)+"년\t");
		System.out.print(today.get(2)+1+"월\t");
		System.out.println(today.get(5)+"일\t");
		
		System.out.print(today.get(Calendar.YEAR)+"년\t");
		System.out.print(today.get(Calendar.MONTH)+1+"월\t");
		System.out.println(today.get(Calendar.DATE)+"일\t");
		
		System.out.print(today.get(Calendar.HOUR)+"시\t");
		System.out.print(today.get(Calendar.MINUTE)+"분\t");
		System.out.println(today.get(Calendar.SECOND)+"초\t");
		
	}

}
