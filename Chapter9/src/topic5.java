/*Common Errors to Avoid*/
public class topic5 {
	public String print()
	{
		return "1. Attempting to directly access a private superclass member from a subclass.\n"
				+ "2. Forgetting to explicitly call a superclass constructor when the superclass has no default constructor or programmer-defined no-arg constructor.\n"
				+ "3. Allowing the superclass`s default constructor or no-arg constructor to be implicityly called when you intend to call another superclass constructor.\n"
				+ "4. Forgetting to precede a call to an overridden superclass method with super.\n"
				+ "5. Forgetting a class member`s access specifier.\n"
				+ "6. Writting a body for an abstrct method.\n"
				+ "7. Forgetting to terminate an abstrct method`s header with a semicolon.\n"
				+ "8. Failing to override an abstract method.\n"
				+ "9. Overloading an abstract method instead of overriding it.\n"
				+ "10. Trying to instantiate an abstract class.\n"
				+ "11. Implementing an interface but forgetting to override all of its methods.\n"
				+ "12. Overloading an interface method instead of overrideing it.\n";
	}
}
