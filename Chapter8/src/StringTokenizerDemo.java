/*The DateComponent class extracts the month, day, and year from a string containing a data*/
import java.util.StringTokenizer;
public class StringTokenizerDemo {
	private String month,day,year;
	//The constructor
	public StringTokenizerDemo(String dateStr)
	{
		//"/" is the delimiter. you can write multiple delimiter such as "/.$@"
		StringTokenizer strTokenizer= new StringTokenizer("/");
		month =strTokenizer.nextToken();
		day= strTokenizer.nextToken();
		year=strTokenizer.nextToken();
	}
	
	public String getMonth(){return month;}
	public String getDay(){return day;}
	public String getYear(){return year;}
	
}
