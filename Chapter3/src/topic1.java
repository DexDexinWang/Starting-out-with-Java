/*Classes*/
public class topic1 {
	public String print()
	{
		return "1. Class, it is the blueprint for an object. It specifiies the attributes and methods that a priticular type of object has. From the class, one or more objects may be created. \n"
				+ "2. Class objects normally have methods that perform useful operations on their data.\n"
				+ "3. Primitive variables, however, only store data and have no methods.\n"
				+ "4. A class is not an object, but a description of an object.\n"
				+ "5. private, When the private access specifier is applied to a class member, the member cannot be accessed by code outside the class. The member can be accessed only by methods that are members of the same class.\n"
				+ "6. public, when the public access specifier is applied to a class member, the member can be accessed by code inside the class or outside.\n"
				+ "";
	}
	
	//example
	private double length, width;
	public void setLength(double len)
	{
		length=len;
	}
	public void setWidth(double w)
	{
		width=w;
	}
	public double getLength()
	{
		return length;
	}
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public void example()
	{
		topic1 box=new topic1();
		box.setLength(10.0);
		box.setWidth(20.0);
		System.out.println("The box`s length is "+box.getLength());
		System.out.println("The box`s width is "+box.getWidth());
		System.out.println("The box`s area is "+ box.getArea());
	}
}

