/*This class uses an inner class.*/

import java.text.DecimalFormat;
public class InnerClassDemo 
{
	private String description;
	private int itemNumber;
	private CostData cost; //inner class.
	
	public InnerClassDemo(String desc, int itemNum, double wholesale, double retail)
	{
		description =desc;
		itemNumber =itemNum;
		cost =new CostData(wholesale, retail);
	}
	
	public String toString()
	{
		String str; 
		DecimalFormat dollar =new DecimalFormat("#,##0.00");
		str = "Description: " + description
				+"\nItem Number: " + itemNumber
				+"\nWhole sale : $" + dollar.format(cost.wholesale)
				+"\nRetail Price: $" + dollar.format(cost.retail);
		return str;
	}
	
	//CostData Inner Class
	private class CostData
	{
		public double wholesale, retail;
		
		public CostData(double w, double r)
		{
			wholesale =w;
			retail =r;
		}
	}
	
}
