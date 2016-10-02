import javax.swing.*;
import java.awt.GridLayout;

public class BorderGridWindow extends JFrame{
	private final int WINDOW_WIDTH=400;
	private final int WINDOW_HEIGHT=300;
	
	public BorderGridWindow()
	{
		super("Colors");
		
		//Set the size of the window.
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Add a BorderLayout manager to the content pane.
		setLayout(new GridLayout(2,3));
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		//Display the window.
		setVisible(true);
	}
	
	private void buildPanel()
	{
		
		JButton button1 = new JButton(" Button1 ");
		JButton button2 = new JButton(" Button2 ");
		JButton button3 = new JButton(" Button3 ");
		JButton button4 = new JButton(" Button4 ");
		JButton button5 = new JButton(" Button5 ");
		JButton button6 = new JButton(" Button6 ");

		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
	}
}
