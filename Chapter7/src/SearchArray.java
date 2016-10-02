/*It is sequential search method searches an int array for a specified value*/
public class SearchArray {
	public static int example(int[] array, int value)
	{
		int index,element;
		boolean found;
		
		//starting pointing of the search
		index=0;
		
		//store the default values for element and found.
		element =-1;
		found=false;
		
		//search the array.
		while(!found && index< array.length)
		{
			if (array[index]==value)
			{
				element=index;
				found=true;
			}
			index++;
		}
		return element;
	}
}
