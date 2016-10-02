import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxWindow extends JFrame
{
	private JPanel coffeePanel;
	private JPanel selectedCoffeePanel;
	private JComboBox coffeeBox;
	private JLabel label;
	private JTextField selectedCoffee;
	
	private String[] coffee ={"Regular Coffee","Dark Roast", "Cappuccino","Espresso","Decaf"};
	
	public ComboBoxWindow()
	{
		//call the JFram constructor to setup the title.
		super("Combo Box Demo");
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Create a BorderLayout manager for the content pane.
		setLayout(new BorderLayout());
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		
		//Display the window.
		pack();
		setVisible(true);
	}
	
	private void buildPanel()
	{
		buildCoffeePanel();
		buildSelectedCoffeePanel();
		
		add(coffeePanel,BorderLayout.CENTER);
		add(selectedCoffeePanel,BorderLayout.SOUTH);
	}
	
	private void buildCoffeePanel()
	{
		//create a panel to hold the combo box.
		coffeePanel =new JPanel();
		
		//Create the combo box
		coffeeBox=new JComboBox(coffee);
		
		//Register an action listener
		coffeeBox.addActionListener(new ComboBoxListener());
		
		//add the combo box to the panel
		coffeePanel.add(coffeeBox);
	}
	
	private void buildSelectedCoffeePanel()
	{
		//create a apanel to hold the text field
		selectedCoffeePanel =new JPanel();
		
		//create the label.
		label=new JLabel("You Selected:");
		
		//create the uneditable the text field.
		selectedCoffee =new JTextField(10);
		selectedCoffee.setEditable(false);
		
		//add the label and text field to the panel
		selectedCoffeePanel.add(label);
		selectedCoffeePanel.add(selectedCoffee);
	}
	
	private class ComboBoxListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String selection = (String) coffeeBox.getSelectedItem();
			selectedCoffee.setText(selection);
		}
	}
}
