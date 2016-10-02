/*The String class*/
public class topic8 
{
	public String print()
	{
		return "1. String. The class that is provied by the Java API for handling strings is named String.\n"
				+ "2. Primitive-type. This kind variables hold the actual data items with which they are associated.\n"
				+ "E.g. int number=25;\n"
				+ "3. Class-type. This kind vairables does not hold the acutal data item that it is associated with, but holds the memory address of the data item it is associated with.\n"
				+ "E.g. String str=\"abc\"\n"
				+ "4. A few String class methods:\n"
				+ "charAt(index), The argument index is an int value and specifies a character position in the string.\n"
				+ "E.g. char letter = name.charAt(3) \n"
				+ "lenght(), The method returns the number of characters in the string. The return value is of the type int.\n"
				+ "E.g. int stringSize = name.length();\n"
				+ "toLowerCase(), The method returns a new string that is the lowercase equivalent of the string contained in the calling object.\n"
				+ "E.g. String littleName= bigName.toLowerCase();\n"
				+ "toUpperCase(), The method returns a new string that is the uppercase equivalent of the string contained in the calling object.\n"
				+ "E.g. String bigName=smallName.toUpperCase();\n";
	}
}
