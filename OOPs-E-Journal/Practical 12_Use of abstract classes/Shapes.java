package shapes;
import java.util.Scanner;

public abstract class Shapes {
	
	Scanner sc = new Scanner(System.in);
	final protected float PI = 3.14f;
	public int input1;
	
	public abstract void area();
	public abstract void perimeter();
	public abstract void enterInputs();
}
