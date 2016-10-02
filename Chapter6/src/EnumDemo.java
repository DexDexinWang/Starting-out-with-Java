public class EnumDemo 
{
	enum Day {SUNDAY, MONDAY, TUESDAY, WENDNESDAY, THRUSDAY, FRIDAY, SATURDAY}
	
	public void example()
	{
		//Declare a Day variable and assign it a value.
		Day workDay = Day.WENDNESDAY;
		
		System.out.println(workDay);
		
		System.out.println("The ordinal value for" + Day.SUNDAY + " is " + Day.SUNDAY.ordinal());
		//The ordinal value for SUNDAY is 0.
		
		//To compare 2 enum constants
		if(Day.FRIDAY.compareTo(Day.MONDAY) > 0)
		{
			System.out.println(Day.FRIDAY+ " is greater than "+ Day.MONDAY);
		}
		else
		{
			System.out.println(Day.FRIDAY+ " is smaller than "+ Day.MONDAY);
		}
			
	}
}
