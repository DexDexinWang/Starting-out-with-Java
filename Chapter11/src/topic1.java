/*GUI Introduction*/
/*Dialog Boxes*/
/*Creating Windows*/
public class topic1 
{
	public String print()
	{
		return "1. Java Foundation Classes, it is to create a praphical user interface for your application.\n"
				+ "2. Within the JFC you use the Abstract Windowing Toolkit(AWT) or Swing classes to create a graphical user interface.\n"
				+ "3. JOptionPane, allows you to quickly display a dialog box, which is a small graphical window displaying a message or requesting input.\n"
				+ "4. Swing, allows you to create windows containing various GUI componenets.\n"
				+ "5. Pane is a container that is part of every JFrame object. You cannot see the content pane and it does not have a border, but any component added to a JFram must be added to its content pane.\n"
				+ "6. Event listener, is an object that responds to evetns. if the soure component is connected to an event listener, then the event object is passed toa specific method in the event listener.\n"
				+ "7. Layout, it refers to the positioning and sizing of components.\n"
				+ "8. Layout manager, is an object that has its own rules about how components are to be positioned and sized, and it makes adjustments when necessary.\n"
				+ "9. Splash Screen, A splash screen is a graphic image that is displayed while an application loads into memory and starts up.\n"
				+ "E.g. java -splash:BrandiLogo.jpg ClassName\n";
	}
}
