/*like sum method, sum(10,20) and sum(10,20,30) and sum(10,20,30,40) can work with one method*/
public class VariableLengthArgumentLists {
	//The ellipsis(three periods) that follows the data type indicates that numbers is a special type 
	//of parameter known as a vararg parameter. A varag parameter can take a variable number of arguments.
	public static int sum(int... numbers)
	{
		int total=0; //accumulator
		
		for(int val:numbers)
		{
			total += val;
		}
		
		return total;
	}
}
