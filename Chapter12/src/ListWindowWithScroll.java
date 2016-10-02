
import java.awt.*;
import javax.swing.event.*;
import javax.swing.*;

public class ListWindowWithScroll extends JFrame {

	private JPanel monthPanel;
	private JPanel selectedMonthPanel;
	private JList monthList;
	private JTextField selectedMonth;
	private JLabel label;
	
	private String[] months ={"January",
			"February","March","April", "May","June",
			"July","Augest","September","October","november","December"};
	
	public ListWindowWithScroll()
	{
		//call the JFram constructor to setup the title.
		super("The List with Scroll");
		
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
		
		//add these panels into BorderLayout
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
