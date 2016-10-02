/*To insert a value to an arraylist in a specific position*/
/*To replace a value to an arraylist in a specific position*/

import java.util.ArrayList;
public class ArrayListAddAndReplace {
	public static void example()
	{
		ArrayList<String> nameList =new ArrayList<String>();
		
		nameList.add("James");
		nameList.add("Catherine");
		nameList.add("Bill");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: "+ index + " Name: "+ nameList.get(index));
		}
		
		//Insert a record in a specific position in an ArrayList.  
		nameList.add(1,"Mary");
		
		//remove a string value from an arraylist.
		nameList.remove(0);
		
		//replce an item from an arraylist.
		nameList.set(2, "Dex");
		
		for (int index = 0; index < nameList.size(); index++)
		{
			System.out.println("Index: "+ index + " Name: "+ nameList.get(index));
		}
		
	}
}
