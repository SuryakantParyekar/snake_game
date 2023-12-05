package shapesInterface;

public class Circle implements Shapes{
	private float input1;
	public void enterInputs()
	{
		System.out.print("Enter Radius : ");
		input1 = sc.nextFloat();
	}
	
	public void area()
	{
		System.out.println("Area of Circle = " + PI * input1 * input1);
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of Circle = " + 2 * PI * input1);
	}
}
