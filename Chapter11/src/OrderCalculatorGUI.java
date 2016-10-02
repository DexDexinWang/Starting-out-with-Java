/*It contains Label, Text Field, Button, Radio Buttons,and Check Buttons*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class OrderCalculatorGUI extends JFrame{
	//The following constant is fro the sales tax rate.
	private final double TAX_RATE=0.09;
	
	//The follwoing canstants are used to indicate the cost of each products
	private final double WHITE_BAGEL=1.25;
	private final double WHEAT_BAGEL=1.5;
	private final double CREAM_CHEESE=0.5;
	private final double BUTTER=0.25;
	private final double PEACH_JELLY=0.75;
	private final double BLUEBERRY_JAM=0.75;
	private final double NO_COFFEE=0.0;
	private final double REGULAR_COFFEE=1.25;
	private final double DECAF_COFFEE=1.25;
	private final double CAPPUCCINO=2.00;
	
	
	
	//The following variables will refernce the custom panel objects.

	//Create 5 panels for border panel
	private JPanel banner;
	private JPanel bagels;
	private JPanel toppings;
	private JPanel coffee;
	private JPanel buttonPanel; 
	
	//create a label within banner
	private JLabel greeting;
	
	//create radio button group with two radio buttons within bagels
	private ButtonGroup bg;
	private JRadioButton whiteBagel;
	private JRadioButton wheatBagel;
	
	//create check boxes for the available toppings.
	private JCheckBox creamCheese;
	private JCheckBox butter;
	private JCheckBox peachJelly;
	private JCheckBox blueberryJam;
	
	//create radio button group with four radio buttons within coffee
	private JRadioButton noCoffee;
	private JRadioButton regularCoffee;
	private JRadioButton decafCoffee;
	private JRadioButton cappuccino;
	private ButtonGroup bg1;
	
	//create two buttons: Calculate and Exit
	private JButton calcButton;
	private JButton exitButton;
	
	//Constructor
	public OrderCalculatorGUI()
	{
		//call the JFram constructor to setup the title.
		super("Order Calculator");
		
		//Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Build the panel and add it to the frame.
		buildPanel();
		
		//Add a BorderLayout manager to the content pane.
		setLayout(new BorderLayout());
		add(banner,BorderLayout.NORTH);
		add(bagels,BorderLayout.WEST);
		add(toppings,BorderLayout.CENTER);
		add(coffee,BorderLayout.EAST);
		add(buttonPanel,BorderLayout.SOUTH);
		

		
		//pack and display the window which replace the	setSize(WINDOW_WIDTH,WINDOW_HEIGHT) function;
		pack();
		
		//Display the window.
		setVisible(true);
	}
	
	
	private void buildPanel()
	{
		//five panels
		banner =new JPanel();
		bagels =new JPanel();
		toppings =new JPanel();
		coffee =new JPanel();
		buttonPanel =new JPanel();

		//1st panel
		greeting=new JLabel("Welcome to Dex`s Bagel House");
		banner.add(greeting);
		
		//second panel
		whiteBagel = new JRadioButton("White",true);
		wheatBagel = new JRadioButton("Wheat");
		bg=new ButtonGroup();
		bg.add(whiteBagel);
		bg.add(wheatBagel);
		bagels.add(whiteBagel);
		bagels.add(wheatBagel);
		bagels.setBorder(BorderFactory.createTitledBorder("Bagel"));//add a border around the panel

		//third panel
		toppings.setLayout(new GridLayout(4,1));
		creamCheese = new JCheckBox("Cream cheese");
		butter = new JCheckBox("Butter");
		peachJelly = new JCheckBox("Peach jelly");
		blueberryJam = new JCheckBox("Blueberry jam");
		
		toppings.add(creamCheese);
		toppings.add(butter);
		toppings.add(peachJelly);
		toppings.add(blueberryJam);
		toppings.setBorder(BorderFactory.createTitledBorder("Toppings"));
		
		//fourth panel
		coffee.setLayout(new GridLayout(4,1));
		noCoffee = new JRadioButton("None");
		regularCoffee = new JRadioButton("Regular Coffee", true);
		decafCoffee = new JRadioButton("Decaf Coffee");
		cappuccino = new JRadioButton("Cappuccino");
		bg1 = new ButtonGroup();
		bg1.add(noCoffee);
		bg1.add(regularCoffee);
		bg1.add(decafCoffee);
		bg1.add(cappuccino);
		coffee.add(noCoffee);
		coffee.add(regularCoffee);
		coffee.add(decafCoffee);
		coffee.add(cappuccino);
		coffee.setBorder(BorderFactory.createTitledBorder("Coffee"));
		
		//fifth panel
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		calcButton.addActionListener(new CalcButtonListerner());
		exitButton.addActionListener(new ExitButtonListerner());
		
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	
	public double getBagelCost()
	{
		double bagelCost=0.0;
		if(whiteBagel.isSelected())
			bagelCost =WHITE_BAGEL;
		else
			bagelCost=WHEAT_BAGEL;
		return bagelCost;
	}
	
	public double getToppingCost()
	{
		double toppingCost=0.0;
		
		if(creamCheese.isSelected())
			toppingCost += CREAM_CHEESE;
		if(butter.isSelected())
			toppingCost += BUTTER;
		if(peachJelly.isSelected())
			toppingCost += PEACH_JELLY;
		if(blueberryJam.isSelected())
			toppingCost += BLUEBERRY_JAM;
		
		return toppingCost;
	}
	
	public double getCoffeeCost()
	{
		double coffeeCost=0.0;
		if(noCoffee.isSelected())
			coffeeCost =NO_COFFEE;
		else if (regularCoffee.isSelected())
			coffeeCost=REGULAR_COFFEE;
		else if (decafCoffee.isSelected())
			coffeeCost=DECAF_COFFEE;
		else if (cappuccino.isSelected())
			coffeeCost=CAPPUCCINO;
		return coffeeCost;
	}
	
	private class CalcButtonListerner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double subtotal;
			double tax;
			double total;
			
			subtotal=getBagelCost() + getToppingCost() + getCoffeeCost();
			tax=subtotal * TAX_RATE;
			total = subtotal +tax;
			
			DecimalFormat dollar =new DecimalFormat("0.00");
			
			JOptionPane.showMessageDialog(null,"Subtotal:$"+dollar.format(subtotal)+"\n"+
											"Tax:$" + dollar.format(tax)+ "\n"+ 
											"Total:$" + dollar.format(total));
		}
	}
	
	private class ExitButtonListerner implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
}
