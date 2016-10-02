import java.io.*;
import java.util.Scanner;
public class FileWriteDemo {
	public void example() throws IOException
	{
		String filename;
		String friendName;
		int numFriends;
		
		Scanner keyboard =new Scanner(System.in);
		
		//Get the number of friends.
		System.out.print("How many friends do you have? ");
		numFriends=keyboard.nextInt();
		
		//Consume the remaining newline character.
		keyboard.nextLine();
		
		//Get the filename
		System.out.print("Enter the filename: ");
		filename=keyboard.nextLine();
		
		//Make sure the fiel does not exist.
		File file =new File(filename);
		
		if(file.exists())
		{
			System.out.printf("The file %s already exists.",filename);
			
			System.exit(0);
		}
		
		PrintWriter outputFile=new PrintWriter(file);
		
		//Get data and write it to the file 
		
		for(int i=1; i<=numFriends;i++)
		{
			//Get the name of a friend.
			System.out.print("Enter the name of friend number "+i+":");
			friendName=keyboard.nextLine();
			outputFile.println(friendName);
		}
		
		outputFile.close();
		System.out.println("Data written to the file.");
	}
}
