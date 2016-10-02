/*Reading Keyboard Input*/
import java.util.Scanner;
public class topic10 {
	public String print()
	{
		return "1. System.in. That is a JAVA API object, which refers to the standard input device.\n"
				+ "E.g. Scanner keyboard=new Scanner(System.in);\n"
				+ "Scanner keyboard. This declares a variable named keyboard. The variable can reference an object of the Scanner class.\n"
				+ "new Scanner(System.in). This creates a Scanner object in memory. The object will read input from System.in.\n"
				+ "The = operator assigns the address of the Scanner object to the Keyboar vaiable.\n"
				+ "2. Some of the Scanner class methods:\n"
				+ "nextByte()\n"
				+ "nextDouble()\n"
				+ "nextFloat()\n"
				+ "nextInt()\n"
				+ "nextLine()\n"
				+ "nextLong()\n"
				+ "nextShort()\n"
				+ "3. Import Statement such as \"import java.util.Scanner;\". The scanner class is not automatically available to your Java programs.";
	}
	
	public void example()
	{
		String name;
		int age;
		double income;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.println("What is your age?");
		age=keyboard.nextInt();
		
		System.out.println("What is your annual income?");
		income=keyboard.nextDouble();
		
		System.out.println("What is your name?");
		name=keyboard.nextLine();
		
		System.out.println("Hello " + name + ". Your age is " + age + 
				" and your income is $"+ income);
		keyboard.close();
	}
}
