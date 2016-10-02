/*It shows JOptionPane class*/
import javax.swing.JOptionPane;
public class DialogBoxDemo {
	
	//Showing Message Dialog 
	public static void showMD()
	{
		//error
		JOptionPane.showMessageDialog(null, "Error Message", "Error", JOptionPane.ERROR_MESSAGE);
		//Information
		JOptionPane.showMessageDialog(null, "Information Message", "Information", JOptionPane.INFORMATION_MESSAGE);
		//Warning
		JOptionPane.showMessageDialog(null, "Warning Message", "Warning", JOptionPane.WARNING_MESSAGE);
		//Question
		JOptionPane.showMessageDialog(null, "Question Message", "Question", JOptionPane.QUESTION_MESSAGE);
		//Plain
		JOptionPane.showMessageDialog(null, "Plain Message", "Message", JOptionPane.PLAIN_MESSAGE);
	}
	
	//Showing Input Dialog
	public static void showID()
	{
		String value; // value will get the value from the input dialog.
		value = JOptionPane.showInputDialog(null, "Enther the value again.", "Enter  Carefully!", JOptionPane.WARNING_MESSAGE);
	}
	
	//Showing Comfirm Dialog
	public static void showCD()
	{
		int value; 
		value = JOptionPane.showConfirmDialog(null, "Are you sure?");
		if(value == JOptionPane.YES_OPTION)
		{
			System.out.println("Yes");
		}
		else if (value == JOptionPane.NO_OPTION)
		{
			System.out.println("No");
		}
		else if(value == JOptionPane.CANCEL_OPTION)
		{
			System.out.println("Cancel");
		}
	}
}
