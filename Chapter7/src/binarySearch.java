
public class binarySearch {
	public static int binarySearch(int[] array, int value)
	{
		int first, last, middle, position;
		
		boolean found; //flag.
		
		//set the initial values.
		first =0; 
		last = array.length-1;
		position =-1;
		found=false;
		
		//search for the value.
		
		while (!found && first <=last)
		{
			middle =(first+last)/2; //find the middle position.
			if(array[middle]==value)
			{
				found=true;
				position =middle;
			}
			else if (array[middle]>value)
			{
				last =middle-1;
			}
			else
			{
				first =middle+1;
			}
		}
		return position;
	}

}
