import javax.swing.*;
import java.awt.BorderLayout;


public class BorderWindow extends JFrame 
{
	private final int WINDOW_WIDTH=400;
	private final int WINDOW_HEIGHT=300;
	
	public BorderWindow()
	{
		//call the JFram constructor to setup the title.
		super("Colors");
		
		//Set the size of the window.
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add a BorderLayout manager to the content pane.
		setLayout(new BorderLayout());
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		//Display the window.
		setVisible(true);
	}
	
	private void buildPanel()
	{
		
		JButton button1 = new JButton("North Button");
		JButton button2 = new JButton("South Button");
		JButton button3 = new JButton("East Button");
		JButton button4 = new JButton("West Button");
		JButton button5 = new JButton("Center Button");

		this.add(button1, BorderLayout.NORTH);
		this.add(button2, BorderLayout.SOUTH);
		this.add(button3, BorderLayout.EAST);
		this.add(button4, BorderLayout.WEST);
		this.add(button5, BorderLayout.CENTER);
	}
}
