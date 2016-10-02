/*Dialog Boxes*/
import javax.swing.JOptionPane;

public class topic11 {
	public String print()
	{
		return "1. Message Dialog, A dialog box that displays a message; an OK button is also displayed.\n"
				+ "2. Input Dialog, A dialog box that prompts that user for input and provides a text  field where input is typed; an OK button and a Cancel button are also displayed.\n"
				+ "3. Methods for converting strings to numbers:\n"
				+ "Byte.parseByte, convert a string to a bye.\n"
				+ "Double.parseDouble, convert a string to a double.\n"
				+ "Float.parseFloat, convert a string to a floag.\n"
				+ "Integer.parseInt, convert a string to an int.\n"
				+ "Long.parseLong, convert a string to a long. \n"
				+ "Short.parseShort, convert a string to a shot. \n";
	}
	public void example()
	{
		String inputString;
		String name;
		int hours;
		double payRate;
		double grossPay;
		
		name =JOptionPane.showInputDialog("What is your name?");
		
		inputString = JOptionPane.showInputDialog("How many hours did you work this week?");
		hours=Integer.parseInt(inputString);
		
		inputString = JOptionPane.showInputDialog("What is your hourly pay rage?");
		payRate=Double.parseDouble(inputString);
		
		grossPay=hours * payRate;
		
		JOptionPane.showMessageDialog(null, "Hello "+ name+". Your gross pay is $"+ grossPay);
		
	}
}
