/*This class computes a curved grade. It inherits from the GradedActivity class.*/
public class CurvedActivity extends GradeActivity{
	private double rawScore, percentage;
	public CurvedActivity(double percent)
	{
		percentage =percent;
		rawScore=0.0;
	}
	
	//this is override with superclass`s setScore function.
	public void setScore(double s)
	{
		rawScore=s;
		super.setScore(rawScore*percentage);
	}
	
	public double getRawScore()
	{
		return rawScore;
	}
	public double getPercentage()
	{
		return percentage;
	}
}
