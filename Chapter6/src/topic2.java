/*Passing Objects as Arguments to Methods*/
/*Compare and Copy Objects*/
/*The this reference variable*/
public class topic2 
{
	public String print()
	{
		return "1. To pass an ojbect as a method argument, you pass an object reference (passed by reference).\n"
				+ "2. To pass a variable as method argumetn, you pass an object value (passed by value).\n"
				+ "3. toString(); Most classes can benefit from having a method named toString, which is implicitly called under certain circumstances. Typically, the mehod returns a string that represents the state of an object.\n"
				+ "4. You cannot determine whether two objects contain the same data by comparing them with == operator. Instead, the class must have a method such as equals for comparing the contents of objects.\n"
				+ "5. Copy Objects, You can simplify the processof duplicating objects by equipping a class with a method that returns a copy of an object.\n"
				+ "6. Aggregation occurs when an instance of a class is a field in another class.\n"
				+ "7. The this key word is the name of a reference variable that an object can use to refer to itself. It is available to all nonstatic methods.\n"
				+ "E.g. public Stock (String sym) { this(sym, 0.0);} \n"
				+ "";
	}
}
