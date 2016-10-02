/*This class holds data for a computer science student*/
public class AbstractStudentCIS extends AbstractStudent
{
	private final int MATH_HOURS=20, CS_HOURS=40,GEN_ED_HOURS=60;
	
	private int mathHours, csHours, genEdHours;
	
	public AbstractStudentCIS(String n, String id, int year)
	{
		super(n,id,year);
	}
	
	public void setMathHours(int math)
	{
		mathHours=math;
	}
	
	public void setCsHours(int cs)
	{
		csHours=cs;
	}
	
	public void setGenEdHours(int genEd)
	{
		genEdHours=genEd;
	}
	
	public int getRemainingHours()
	{
		int reqHours, remainingHours;
		
		reqHours = MATH_HOURS + CS_HOURS + GEN_ED_HOURS;
		remainingHours= reqHours -(mathHours + csHours+genEdHours);
		
		return remainingHours;
	}
}
