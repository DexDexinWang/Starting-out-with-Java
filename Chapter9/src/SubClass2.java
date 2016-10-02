/*Call super class`s constructor with super key*/

public class SubClass2 extends SuperClass2{
	public SubClass2()
	{
		super(10);
		
		System.out.println("This is the subclass constructor.");
	}
}


//Result:
//The following argument was passed to the superclass constructor: 10
//This is the subclass constructor.