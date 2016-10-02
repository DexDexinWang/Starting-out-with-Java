/*Classes, Variables, and Scope*/
/*Packages and import Statements*/
public class topic4 
{
	public String print()
	{
		return "1. Variables are declared in 3 locations:\n"
				+ "Inside a mothod; Variable declared inside a method are known as local variables.\n"
				+ "Inside a class, but not inside any method; \n"
				+ "Inside the parentheses of a method header;\n"
				+ "2. Three types of variables for the scope:\n"
				+ "Local vaiables. A local variable`s scope is the method in which it is declared, from the variable`s declaration to the end of the method. Only statements in this area can access the variable.\n"
				+ "Fields.  For now we will define a field`s scope as the entire class in which it is declared. A field can be accessed by the methods that are members of the same class as the field.\n"
				+ "Paramether. A parameter vaiable`s scope is the method in which it is declared.\n"
				+ "3. The classes in the Java API are origanized into packages. \n"
				+ "4. An import statement tells the compiler in which package a class is located.\n"
				+ "5. Two import statements: explicit (import Java.util.Scanner) and wildcard (import Java.util.*). \n"
				+ "6. Java.lang. It is automatically imported into every Java program. This package comtains general classes, such as String and System, that are fundamental to the Java program language.\n"
				+ "7. Other API packages:\n"
				+ "java.apple, to create an applet. \n"
				+ "java.awt, Abstrct Windowing Toolkit to drawing images and creating graphical user interfaces.\n"
				+ "java.io, perform various types of input and output"
				+ "java.lang, a general classes for Java.\n"
				+ "java.net, for network communications.\n"
				+ "java.security, to implement security features.\n"
				+ "java.sql, to access databases using structured query language.\n"
				+ "java.test, for formatting text.\n"
				+ "java.util, provides various utility classes.\n"
				+ "javax.swing, to create graphical user interfaces.\n"
				+ "8. One of the first steps in creating an object-oriented applicationis determining the classes that are necessary, and their responsibilities within the applicaiton.\n"
				+ "9. Two responsibilities: the things that the class is responsible for knowing. The actions that the class is resposible for doing.\n";
	}
}
