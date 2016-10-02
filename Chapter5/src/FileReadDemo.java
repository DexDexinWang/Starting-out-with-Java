import java.util.Scanner;
import java.io.*;
public class FileReadDemo 
{
	public void example() throws IOException
	{
		Scanner keyboard =new Scanner(System.in);
		
		//Get the file name;
		System.out.print("Enter the file name:");
		String filename= keyboard.nextLine();
		
		File file =new File(filename);
		if(!file.exists())
		{
			System.out.printf("The file %s does not exist.\n",filename);
			System.exit(0);
		}
		
		Scanner inputFile= new Scanner(file);
		while(inputFile.hasNextLine())
		{
			String friendName=inputFile.nextLine();
			System.out.println(friendName);
		}
		
		inputFile.close();
		
	}
}
