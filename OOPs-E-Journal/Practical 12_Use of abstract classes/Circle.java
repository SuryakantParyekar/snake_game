package shapes;
public class Circle extends Shapes{

	//System.out.println("Enter Radius : ");
	//input1 = sc.nextInt();
	
	public void enterInputs()
	{
		System.out.print("Enter Radius : ");
		input1 = sc.nextInt();
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
