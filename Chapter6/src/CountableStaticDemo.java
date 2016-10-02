//This class demonstrates a static field.
public class CountableStaticDemo {
	private static int instanceCount=0;
	
	public CountableStaticDemo()
	{
		instanceCount++;
	}
	
	public int getInstanceCount()
	{
		return instanceCount;
	}
}
