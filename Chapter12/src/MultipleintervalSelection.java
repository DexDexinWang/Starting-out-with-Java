
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;
import javax.swing.*;

public class MultipleintervalSelection extends JFrame{
	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JPanel buttonPanel;
	private JList monthList;
	private JList selectedMonthList;
	private JButton button;
	
	private String[] months ={"January",
			"February","March","April", "May","June",
			"July","Augest","September","October","november","December"};
	
	public MultipleintervalSelection()
	{
		//call the JFram constructor to setup the title.
		super("List Demo");
		
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
		//build two panels.
		buildMonthPanel();
		buildSelectedMonthPanel();
		buildButtonPanel();
		
		//add these panels into BorderLayout
		add(monthPanel, BorderLayout.NORTH);
		add(selectedMonthPanel, BorderLayout.CENTER);
		add(buttonPanel,BorderLayout.SOUTH);
	}
	
	private void buildMonthPanel()
	{
		//Create a panel to hold the list.
		monthPanel=new JPanel();
		
		//create the list 
		monthList=new JList(months);
		
		//set the selection mode to single selection
		monthList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		//set the number of visible rows to 6.
		monthList.setVisibleRowCount(6);
		
		//Add the list to a scroll pane.
		JScrollPane scrollPane =new JScrollPane(monthList);
		
		//add the scroll panel to the month panel.
		monthPanel.add(scrollPane);
	}
	
	private void buildSelectedMonthPanel()
	{
		//create a panel to hold the text field
		selectedMonthPanel =new JPanel();
		// create the a list
		selectedMonthList =new JList();
		//setup the rows to display
		selectedMonthList.setVisibleRowCount(6);
		//
		JScrollPane scrollPane2 =new JScrollPane(selectedMonthList);

		selectedMonthPanel.add(scrollPane2);
	}
	
	private void buildButtonPanel()
	{
		//create a panel to hold the button.
		buttonPanel =new JPanel();
		
		//Create the button.
		button = new JButton("Get Sections");
		
		//add an action listener to the button
		button.addActionListener(new ButtonListener());
		
		buttonPanel.add(button);
	}
	
	
	private class ButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			//Get the selected string from the list
			Object[] selections =  (Object[]) monthList.getSelectedValue();
			
			//Store the selected string in the text field
			selectedMonthList.setListData(selections);
		}
	}
}
