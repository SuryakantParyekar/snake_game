package shapesInterface;

public class Square implements Shapes{
	private Float input1;
	public void enterInputs()
	{
		System.out.print("Enter Side : ");
		input1 = sc.nextFloat();
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
