/*This program displays a table of speeds in kph and mph.*/
public class SpeedTable 
{
	public void example()
	{
		final int STARTING_KPH=60;
		final int MAX_KPH=130;
		final int INCREMENT=10;
		
		double kph;
		double mph;
		
		SpeedConverter converter = new SpeedConverter();
		
		System.out.println("KPH\t\tMPH");
		System.out.println("-----------");
		
		for(kph=STARTING_KPH; kph<=MAX_KPH; kph += INCREMENT)
		{
			mph=converter.getMPH(kph);
			
			System.out.printf("%.1f\t\t%.1f\n",kph,mph);
		}
	}
}
