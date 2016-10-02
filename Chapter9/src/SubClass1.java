/*super class constructor always executes before the subclass constructor*/

public class SubClass1 extends SuperClass1 {
	public SubClass1()
	{
		System.out.println("This is the subclass constructor.");
	}
}

//SubClass1 object =new SubClass1(); 
//Result:
//This is the superclass constructor.
//This is the subclass constructor.