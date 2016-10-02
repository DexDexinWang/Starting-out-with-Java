/*Overloading and Overriding */

public class SubClass3 extends SuperClass3{
	//overriding
	public void showValue(int arg)
	{
		System.out.print("SUBCLASS: The int argument was "+ arg+".");
	}
	
	//overloading the base class
	public void showValue(double arg)
	{
		System.out.print("SUBCLASS: The int argument was "+ arg+".");
	}
}

/*	Operating:
 * 	SubClass3 myObject =new SubClass3();
 * 	myObject.show(10);
 *  myObject.show(1.2);
 *  myObject.show("Hello");
 * */

/*	Results:
 *  SUBCLASS: The int argument was 10.
 *  SUBCLASS: The int argument was 1.2.
 *  SUPERCLASS: The int argument was Hello.
 * */
