/*It reads test scores as tokens from a file and calculates the average.*/
import java.util.Scanner;
import java.io.*;
public class TestScoreReader {
	private Scanner inputFile;
	private String line;
	
	public TestScoreReader(String filename) throws IOException
	{
		
		File file =new File(filename);
		inputFile =new Scanner(file);
	}
	
	public boolean readNextLint() throws IOException
	{
		boolean lineRead;
		lineRead=inputFile.hasNext();
		if(lineRead)
		{
			line = inputFile.nextLine();
		}
		return lineRead;
	}
	
	public double GetAverage()
	{
		int total=0;
		double average;
		
		String[] tokens=line.split(",");
		for(String str: tokens)
		{
			total += Integer.parseInt(str);
		}
		
		average =(double) total/tokens.length;
		return average;
	}
	
	public void close() throws IOException
	{
			inputFile.close();
	}
}
