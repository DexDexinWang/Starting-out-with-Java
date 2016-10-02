/*Overrding Superclass Methods*/
/*Protected Members*/
public class topic2 {
	public String print()
	{
		return "1. A subclass may have a method with the same signature as a superclass method. In such a case, the subclass method overrides the superclass method.\n"
				+ "2. Overloading methods have the same name and different signatures, it is when a method has the smae name as one or more other methods, but a different parameter list. \n"
				+ "3. Overrides methods have the same name and the same signatures.\n"
				+ "4. A method in a subclass can overload a method in the surper class.\n"
				+ "5. A method cannot override another method in the same class.\n"
				+ "6. Proteced member of a class can be accessed by methods in a subclass, and by methods in the same package as the class.\n"
				+ "7. A protected member of a class can be directly accessed by methods of the same class or methods of a subclass.\n"
				+ "8. A supper class can also inherit from another class.\n"
				+ "9. When a class does not use the extends key word to inherit from another class, JAVA automatically extends it from the Ojbect class.\n"
				+ "";
	}
}
