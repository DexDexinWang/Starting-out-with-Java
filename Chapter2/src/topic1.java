/*The Parts of a Java Program*/
public class topic1 
{
	public String print()
	{
		return  "1.Language Elements:\n"
				+ "Key Words, These are words that have a special meaning in the programming language. They may be used for their intended purpose only. Key words are also known as reserved words.\n"
				+ "Programmer-Defined Names, Unlike key words, which are part of the programming lanuage, these are words or names that are defined by the programmer. They are used to identify storage locations in memory and parts of program that are created by the programmer. Programmer-defined names are often called identifiers.\n"
				+ "Operators, Operators are symbols or words that perform operations on one or more operands. An operand is usually an item of data, such as a number.\n"
				+ "Punctuation, Most programming languages require the use of puncuation characters. These characters serve specific purpose, such as makeing the begining or ending of a statement, or separating items in a list.\n"
				+ "Syntax, These are rules that must be followed when writing a program. Syntax dictates how key words and operators may be used, and where punctuation symbols must appear.\n"
				+ "2.Different between Compiler and Interpreter:\n"
				+ "Most programming lanugae compilers translate source code directly into files that contain machine lanugage instruction. These files are called executable files because they may be exectued directly by the computer`s CPU.\n"
				+ "The java complier, however, tranlates a java source file into a file that contains byte code instructions. Byte code instructions are not machine lanuage, and therefore connot be directly executed by CPU.\n"
				+ "Instead, they are executed by the Java Virtual Machine. The JVM is a program that reads Java byte code instructions and executed them as they are read.\n"
				+ "The term protable means that a program may be written on one type of computer and then run on a wide variety of computers, with little or no modification necessary. A compiled Java program may be run on any computer that has a JVM.\n"				
				+"3. Compile, in a cammand line, type \"javac *.java\" to compile a java file.\n"
				+"4. The complier will create another file named *.class, which contains the translated Java byte code. It could be executed with \"java *\".\n"
				+"5. Access specifiers such as public and private controls where the class may be accessed from. The public specifier means access to the class is unrestricted.\n"
				+"6. A Java file could have more than one class. However, you may only have one public class per Java file. Also, the name of public class must be the same as the name of Java file.\n"
				+"7. The main method,\"public static void main (String[] args){}\", is the strating poing of an application.\n"
				+"8. Braces, all of the programming statements that are part of the class are enclosed in a aset of braces. Everything between these braces is the body of the main method.\n"
				+"9. Speical characters:\n"
				+ "\\\\, Double slash. Marks the beginning of a comment;\n"
				+ "(), Opening and closing parentheses. Used in a method header;\n"
				+ "{}, Opening and closing braces. Encloses a group of statements, such as the contents of a class or a method;\n"
				+ "\"\", Quotation marks. Encloses a string of characters, such as a message that is to be printed on the screen;\n"
				+ ";, Semicolon. Marks the end of a complete programming statement;\n";
	}
	
}
