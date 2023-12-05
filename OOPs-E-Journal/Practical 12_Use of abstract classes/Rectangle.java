package shapes;

public class Rectangle extends Shapes{

	private int input2;
	public void enterInputs()
	{
		System.out.print("Enter length : ");
		input1 = sc.nextInt();
		System.out.print("Enter breadth : ");
		input2 = sc.nextInt();
	}
	
	public void area()
	{
		System.out.println("Area of Rectangle = " + input1 * input2);
	}
	
	public void perimeter()
	{
		System.out.println("Perimeter of Rectangle = " + 2 * input1 * input2);
	}

}
