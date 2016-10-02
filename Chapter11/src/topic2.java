/*Common Errors to Avoid*/
public class topic2 
{
	public String print()
	{
		return "1. Misspelling the name of the javax.swing package in an import statment.\n"
				+ "2. Forgetting to specify the action taken when the user clicks on JFrame`s close button.\n"
				+ "3. Forgetting to write an event listener for each event you wish an application to respond to.\n"
				+ "4. Forgettin to register an event listener.\n"
				+ "5. When writting the actionPerformed method in an action listener class, not using the exact signature required by the ActionListener.\n"
				+ "6. Placing components directly into the regions of a container governed by a BorderLayout manager when you do not want the compoents resized or you want to add more than one component per region.\n"
				+ "7. Placing components directly into the cells of a container governed by a GridLayout manager when you do not want the components resized or you wang to add more than one component per cell.\n"
				+ "8. Forgetting to add JRadioButton components to a ButtonGroup object.\n";
	}
}
