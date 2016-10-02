
public class OverloadDemo 
{
	//overload constructors; 
	public OverloadDemo()
	{
		
	}
	
	public OverloadDemo(String str)
	{
		
	}
	
	//overload methods;
	public static double getWeeklyPay(int hours, double payRate)
	{
		return hours * payRate;
	}
	
	public static double getWeeklyPay(double yearlySalary)
	{
		return yearlySalary /52;
	}
}
