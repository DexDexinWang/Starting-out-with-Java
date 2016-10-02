/*The print and println Methods, and the Java API*/
public class topic2 {
	public String print()
	{
		return 	  "\n1. Relationship among the System class, the out object, and the print and println methods.\n"
				+ "such as \"System.out.print();\"\n"
				+ "System class. The System class holds the out object as well as other members.\n"
				+ "out object. The out object is a member of the System class.\n"
				+ "print. The print method is a member of the out object.\n"
				+ "println. The println method is a member of the out object.\n"
				+ "printf. The printf method allows you to format output in a variety of ways."
				+ "2. Common escape sequences:"
				+ "\\n, Newline. Advances the cursor to the next line for subsequent printing.\n"
				+ "\\t, Horizontal tab. Causes the cursor to skip over to the next tab stop.\n"
				+ "\\b, Backspace. Causes the cursor to bak up, or move left, one position.\n"
				+ "\\r, Return. Causes the cursor to go to the beginning of the current line, not the next line.\n"
				+ "\\\\, Backslash. Causes a backslash to be printed.\n"
				+ "\\\', Single quote. Causes a single quotation mark to be printed.\n"
				+ "\\\", Double quote. Causes a double quotation mark to be printed.\n";
	}
	
	public void example()
	{
		int dogs=2, cats=4;
		//The %d is a format specifier for a decimal integer. 
		System.out.printf("We have %d dogs and %d cats. \n", dogs, cats);
		//The %6d indicates that the argument number should be printed in a field that is 6 places wide.
		//If the value in number is shorter than 6 places, it will be right justified.
		//If the value in number is longer than 6 places, it will automatically expended to accommodate the number.
		System.out.printf("We have %d dogs and %d cats. \n", dogs, cats);

		double grossPay=12345678.12;
		//The %8.2 specify both the field width and the number of decimal places together.
		//The %, is to group digits in a number.
		System.out.printf("Your pay is %,8.2f\n",grossPay);
		
		String name1="George", name2="Franklin";
		//The 10s format specifier prints a string in a field that is 10 spaces wide.
		System.out.printf("%10s %10s\n", name1,name2);
	}
}
