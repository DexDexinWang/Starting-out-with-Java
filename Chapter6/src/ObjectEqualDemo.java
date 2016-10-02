
public class ObjectEqualDemo {
	private String symbol;
	private double sharePrice;
	
	//Constructor
	public ObjectEqualDemo(String sym, double price)
	{
		symbol =sym;
		sharePrice =price;
	}
	//Object Euqal function
	public boolean equals(ObjectEqualDemo object2)
	{
		boolean status;
		if(symbol.equals(object2) && sharePrice ==object2.sharePrice)
		{
			status =true;
		}
		else
		{
			status = false;
		}
		return status;
	}
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public double getSharePrince()
	{
		return sharePrice;
	}
	
	public String toString()
	{
		String str = "Trading symbol: "+ symbol + "\nShare price: "+sharePrice;
		return str;
	}
}
