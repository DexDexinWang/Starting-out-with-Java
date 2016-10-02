
public class ObjectCopyDemo {
	private String symbol;
	private double sharePrice;
	
	//Constructor
	public ObjectCopyDemo(String sym, double price)
	{
		symbol =sym;
		sharePrice =price;
	}
	
	//Object copy function by constructor.
	
	public ObjectCopyDemo (ObjectCopyDemo object2)
	{
		symbol = object2.symbol;
		sharePrice = object2.sharePrice;
	}
	
	// How to use? 
	// ObjectCopyDemo company1 = new ObjectCopyDemo("XYZ", 9.62);
	// ObjectCopyDemo company2 = new ObjectCopyDemo(company1);
	
	
	//Object copy function by a method.
	public ObjectCopyDemo copy()
	{
		ObjectCopyDemo copyObject =new ObjectCopyDemo(symbol, sharePrice);
		return copyObject;
	}
	
	// How to use? 
	// ObjectCopyDemo company1 = new ObjectCopyDemo("XYZ", 9.62);
	// ObjectCopyDemo company2;
	// company2 = company1.copy();
	
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

