/*chapter 3.5 example*/
import java.util.Scanner;
public class CellPhoneTest 
{
	public void example()
	{
		String testMan;
		String testMod;
		double testPrice;
		
		Scanner keyboard= new Scanner(System.in);
		
		System.out.print("Enter the manufacter: ");
		testMan=keyboard.nextLine();
		System.out.print("Enter the model number: ");
		testMod=keyboard.nextLine();
		System.out.print("Enter the retail price: ");
		testPrice=keyboard.nextDouble();
		
		CellPhone phone = new CellPhone (testMan,testMod,testPrice);
		
		System.out.println("The 3 parameters");
		System.out.println(phone.getManufact());
		System.out.println(phone.getModel());
		System.out.println(phone.getRetailPrice());
	}
}
