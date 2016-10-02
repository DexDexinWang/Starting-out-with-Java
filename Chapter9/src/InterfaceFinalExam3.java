/*This class will determines the grade for a final exam*/
public class InterfaceFinalExam3 extends GradeActivity implements InterfaceRelatable 
{
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	public InterfaceFinalExam3(int questions, int missed)
	{
		double numericScore; 
		numQuestions =questions;
		numMissed =missed;
		
		pointsEach =100/questions;
		numericScore = 100-(missed * pointsEach);
		setScore(numericScore);
	}
	
	public double getPointsEach()
	{
		return pointsEach;
	}
	
	public int getNumMissed()
	{
		return numMissed;
	}
	
	
	
	public boolean equals (GradeActivity g)
	{
		boolean status;
		if(this.getScore() == g.getScore())
			status=true;
		else
			status =false;
		return status;
	}
	public boolean isGreater (GradeActivity g)
	{
		boolean status;
		if(this.getScore() > g.getScore())
			status=true;
		else
			status =false;
		return status;
	}
	public boolean isLess (GradeActivity g)
	{
		boolean status;
		if(this.getScore() < g.getScore())
			status=true;
		else
			status =false;
		return status;
	}
}
