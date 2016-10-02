/*Common Errors to Avoid*/
public class topic4 
{
	public String print()
	{
		return "1. Trying to overload methods by giving them different return types.\n"
				+ "2. Forgetting to write a no-arg constructor for a class that you want to be able to create instances of without passing arguments to the constructor.\n"
				+ "3. In a method that accepts an ojbect as an argument, writing code that accidentally modifies the objet.\n"
				+ "4. Allowing a null reference to be used.\n"
				+ "5. Forgetting to use the fully qualified name of an enum constant. \n"
				+ "6. Attempting to refer to an instance field or instance method in a static method.\n"
				+ "";
	}
}
