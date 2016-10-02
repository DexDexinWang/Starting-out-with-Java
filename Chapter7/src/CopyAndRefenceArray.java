/*Copy and refence for 2 arrays.*/
public class CopyAndRefenceArray 
{
	public void example()
	{
		final int ARRAY_SIZE=5;
		
		int[] array1={2,4,6,8,10};
		//It demonstrates that two variables can reference the same array.
		int[] array3=array1;
		
		//Make array 2 reference a copy of array1
		int[] array2=new int[ARRAY_SIZE];
		for(int index=0; index <array1.length; index++)
		{
			array2[index]=array1[index];
		}
		
		//To print results.
		System.out.println("The contents of array1:");
		for(int value : array1)
		{
			System.out.println(value + " ");
		}
		System.out.println();
		
		System.out.println("The contents of array2:");
		for(int value : array2)
		{
			System.out.println(value + " ");
		}
		System.out.println();
	}
}
