/*List Window and unchangeable label text*/

import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class ListWindow extends JFrame{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList monthList;
	private JTextField selectedMonth;
	private JLabel label;
	
	private String[] months ={"January",
			"February","March","April", "May","June",
			"July","Augest","September","October","november","December"};
	
	public ListWindow()
	{
		//call the JFram constructor to setup the title.
		super("List Window Demo");
		
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
		buildMonthPanel();
		buildSelectedMonthPanel();
		
		add(monthPanel, BorderLayout.CENTER);
		add(selectedMonthPanel, BorderLayout.SOUTH);
	}
	
	private void buildMonthPanel()
	{
		//Create a panel to hold the list.
		monthPanel=new JPanel();
		
		//create the list 
		monthList=new JList(months);
		
		//set the selection mode to single selection
		monthList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		//Register the list selection listener
		monthList.addListSelectionListener(new ListListener());
		
		//add the list to the panel.
		monthPanel.add(monthList);
	}
	
	private void buildSelectedMonthPanel()
	{
		//create a panel to hold the text field
		selectedMonthPanel =new JPanel();
		// create the label
		label =new JLabel("You selected: ");
		//create the text field
		selectedMonth = new JTextField(10);
		//Make the text field uneditable
		selectedMonth.setEnabled(false);
		//Add the label and text field to the panel
		selectedMonthPanel.add(label);
		selectedMonthPanel.add(selectedMonth);
	}
	
	private class ListListener implements ListSelectionListener
	{
		public void valueChanged(ListSelectionEvent e)
		{
			//Get the selected string from the list
			String selection = (String) monthList.getSelectedValue();
			
			//Store the selected string in the text field
			selectedMonth.setText(selection);
		}
	}
}
