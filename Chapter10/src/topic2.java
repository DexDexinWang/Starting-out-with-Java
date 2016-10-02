/*Common Errors to Avoid*/
public class topic2 
{
	public String print()
	{
		return "1. Assuming that all statement inside a try block will execute.\n"
				+ "2. Getting the try, catch, and finally clauses out of order.\n"
				+ "3. Writting two eatch the same exception in the same try statment.\n"
				+ "4. When catching multiple exceptions that are related to one another through inheritance, listing the more general exceptions first.\n"
				+ "5. Forgetting to write a throws clause on a method that can throw a checked exception but does not handle the exception.\n"
				+ "6. Calling a method but not hanlding an exception that it might throw.\n"
				+ "7. In a custom exception, forgetting to pass an error message to the superclass`s constructor.\n"
				+ "8. Serializing an object with members that are not serializable.\n";
	}
}
