//This pogram 
public class CountableTestDemon {
	public void example()
	{
		int objectCount;
		
		//create three instances of the countable class
		CountableStaticDemo object1= new CountableStaticDemo();
		CountableStaticDemo object2= new CountableStaticDemo();
		CountableStaticDemo object3= new CountableStaticDemo();
		
		//get the number of instance from
		
		objectCount = object1.getInstanceCount();
		
		System.out.println(objectCount + " instances of the class were created.");
	}
}
