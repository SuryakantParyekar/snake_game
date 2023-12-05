package shapes;

public class Square extends Shapes{

	//System.out.print("Enter the length : ");
	//input1 = sc.nextInt();
	
	public void enterInputs()
	{
		System.out.print("Enter Side : ");
		input1 = sc.nextInt();
	}
	
	public void area()
	{
		System.out.println("Area of Square = " + input1 * input1);
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of Square = " + 4 * input1);
	}
}
