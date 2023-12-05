package shapesInterface;
import java.util.Scanner;

interface Shapes {
	Scanner sc = new Scanner(System.in);
	final float PI = 3.14f;
	
	public void area();
	public void perimeter();
	public void enterInputs();
}
