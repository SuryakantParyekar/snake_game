package shapesInterface;

public class SemiCircile implements Shapes{
	private float input1;
	public void enterInputs()
	{
		System.out.print("Enter Radius : ");
		input1 = sc.nextFloat();
	}
	
	public void area()
	{
		System.out.println("Area of SemiCircle = " + ((PI * input1 * input1)/2));
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of SemiCircle = " +  PI * input1 + (input1 + input1));
	}
}
