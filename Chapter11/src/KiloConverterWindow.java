/*Creating Windows*/
import javax.swing.*;
import java.awt.event.*;
public class KiloConverterWindow extends JFrame{
	private JPanel panel;
	private JLabel messageLabel;
	private JTextField kiloTextField;
	private JButton calcButton;
	private final int WINDOW_WIDTH=320;
	private final int WINDOW_HEIGHT=100;
	
	public KiloConverterWindow()
	{
		//call the JFram constructor to setup the title.
		super("Kilometer Converter");
		
		//Set the size of the window.
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		//add the panel to the frame`s content pane;
		add(panel);
		
		//Display the window.
		setVisible(true);
	}
	
	private void buildPanel()
	{
		//create the label, text field, and button components.
		messageLabel = new JLabel("Enter a distance in kilometers");
		kiloTextField =new JTextField(10);
		calcButton = new JButton("Calculate");
		
		//Add an action listener to the button
		calcButton.addActionListener(new CalcButtonListerner());
		
		//create a panel to hold the components.
		
		panel =new JPanel();
		panel.add(messageLabel);
		panel.add(kiloTextField);
		panel.add(calcButton);
	}
	
	private class CalcButtonListerner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String str;
			double miles;
			// get the number of kilometers entered in the text field. The input is a string.
			str= kiloTextField.getText();
			
			//Convert the kilometers to miles.
			miles = Double.parseDouble(str) * 0.6214;
			
			//Display a message dialog showing the miles.
			JOptionPane.showMessageDialog(null, str+" Kilometers is "+ miles + " miles.");
		}
	}
}
