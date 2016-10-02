/*The cube class which inherits the rectangle class*/
public class RectangleInheritanceCube extends RectangleDemo {
	private double height;
	
	public RectangleInheritanceCube(double len, double w, double h)
	{
		super(len,w);
		height = h;
	}
	
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double h)
	{
		height = h;
	}
	public double getSurfaceAres()
	{
		return getArea() * 6;
	}
	public double getVolum()
	{
		return getArea() * height;
	}
}
