import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.event.*;

public class BorderPanelWindow extends JFrame{

	public BorderPanelWindow()
	{

			//call the JFram constructor to setup the title.
			super("Colors");
			
			
			//Specify what happens when the close button is clicked.
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Add a BorderLayout manager to the content pane.
			setLayout(new BorderLayout());
			
			//Build the panel and add it to the frame.
			buildPanel();
			
			//pack and display the window which replace the	setSize(WINDOW_WIDTH,WINDOW_HEIGHT) function;

			pack();
			//Display the window.
			setVisible(true);
	}
	
	private void buildPanel()
	{
		JPanel panel1 =new JPanel();
		JPanel panel2 =new JPanel();
		JPanel panel3 =new JPanel();
		JPanel panel4 =new JPanel();
		JPanel panel5 =new JPanel();
		
		JButton button1 = new JButton("North Button");
		JButton button2 = new JButton("South Button");
		JButton button3 = new JButton("East Button");
		JButton button4 = new JButton("West Button");
		JButton button5 = new JButton("Center Button");
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		panel5.add(button5);
		
		this.add(panel1, BorderLayout.NORTH);
		this.add(panel2, BorderLayout.SOUTH);
		this.add(panel3, BorderLayout.EAST);
		this.add(panel4, BorderLayout.WEST);
		this.add(panel5, BorderLayout.CENTER);
	}
}
