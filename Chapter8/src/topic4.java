/*Sthe StringBuilder Class*/
public class topic4 {
	public String print()
	{
		return "1. The StringBuilder class is similar to he String class, except that you can change the contetns of StringBuilder object.\n"
				+ "E.g.\n"
				+ "String name; Creates the name variable. \n"
				+ "name = \"George\"; Creates a String object containing the string \"George\" and assigns its address to the name variable. \n "
				+ "name =\"Sally\"; Creates a new String object containing the string \"Sally\", and assigns its address to the name variable.\n"
				+ "2. Unlike String objects, StringBuilder objects have methods that allow you to modify their contents without creating a new object in memory. \n"
				+ "3. To consider using StringBuilder objects if your program needs to make a lot of changes to one or more strings.\n"
				+ "4. StringBuilder Constructors.\n"
				+ "StringBuilder() \n"
				+ "StringBuilder(int length) \n"
				+ "StringBuilder(String str) \n"
				+ "5. Methods: "
				+ "char charAt(int position)\n"
				+ "void getChars(int start, int end, char[] array, int arrayStart)\n"
				+ "int indexOf(String str)\n"
				+ "int indexOf(String str, int start)\n"
				+ "int lastIndexOf(String str)\n"
				+ "int lastIndexOf(String str, int Start)\n"
				+ "int length()\n"
				+ "String substring(int start)\n"
				+ "String substring(int start, int end)\n"
				+ "void append(String str)\n"
				+ "void repalce(int startPoints, int length, StringBuilder sb)\n"
				+ "StringBuilder delete(int start, int end)\n"
				+ "StringBuilder deleteCharAt(int position)\n"
				+ "void setCharAt(int position, char cn)\n";
	}
}
