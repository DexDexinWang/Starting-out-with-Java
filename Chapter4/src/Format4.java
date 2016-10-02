import java.text.DecimalFormat;
public class Format4 {
	public void example()
	{
		double  number1 = 0.12,
				number2 = 0.05;

		
		DecimalFormat formatter = new DecimalFormat("#0%");
		
		System.out.println(formatter.format(number1));
		System.out.println(formatter.format(number2));
		
		/*
		 12%
		 5%
		 */
		
	}
}
