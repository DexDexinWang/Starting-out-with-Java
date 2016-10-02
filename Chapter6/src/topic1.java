/*Static Class Members*/
/*Overload methods and constructors*/
public class topic1 
{
	public String print()
	{
		return "1. A Static member belongs to the class, not objects instantiated from the class.\n"
				+ "2. When a field is ddeclared static, there will be only one copy of the field in memory, regardless of the number of instances of the class that might exist.\n"
				+ "3. When a class contains a static method, it is not necessary for an instance of the class to be created to execute the method.\n"
				+ "4. A static method. It is declared as static, they belong to the class and may be called without any instances of the class being in existence.\n"
				+ "E.g. Math.PI or Math.sqrt(number)\n"
				+ "5. Two or more methods in a class may have the sdame name as long as their signatures are different.\n"
				+ "E.g. public static int Square(int number){} and public static int Square (double number){}. These parameters are signatures of methods.\n"
				+ "6. The rules for overloading constructors are the same for overloading other methods: each version of the constructor must have a different signature.\n"
				+ "";
	}
}
