/*This class is an abstract class that holds general data about student. 
 * Classes representing specific types of students should inherit from this class.*/
public abstract class AbstractStudent {
	private String name;
	private String idNumber;
	private int yearAdmitted;
	
	//constructor
	public AbstractStudent(String n, String id, int year)
	{
		name =n;
		idNumber =id;
		yearAdmitted=year;
	}
	
	//This abstract method should be overridden in a subclass.
	public abstract int getRemainingHours();
}
