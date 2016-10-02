
public class selectionSort {
	public static void example(int[] array)
	{
		int startScan, index, minIndex, minValue;
		
		//The first loop is to choose values from array[0] to array[n-2] which will compare with others.
		for (startScan = 0 ; startScan <(array.length-1); startScan++)
		{
			minIndex =startScan;
			minValue = array[startScan];
			
			//The second loop is to choose values which positions are after the startScan`s position. Then, compare them. 
			for (index= startScan+1; index < array.length;index++)
			{
				//find the smallest value and store the value and positon.
				if(array[index]<minValue)
				{
					minValue =array[index];
					minIndex=index;
				}
			}
			
			//the startScan`s value will exchange with the smallest value.
			array[minIndex] = array[startScan];
			array[startScan]= minValue;
		}
	}

}
