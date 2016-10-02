/*This class inherits the GradeActivity class*/
public class GradeActivityInheritance  extends GradeActivity{
	//This class focus on the final exam score.
	private int numQuestions;
	private double pointsEach;
	private int numMissed;
	
	//The constructor
	public GradeActivityInheritance(int questions, int missed)
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
}
