package tryexecpt;

public class TryExecpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d, a;
		try {
			d = 0;
			a = 42/d;
			try {
				int b[] = {1};
				b[5] = 9;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array index out of Index");
			}
		} catch(ArithmeticException e) {
			System.out.println("Division by zero");
		}
		finally{
			System.out.println("Last Statement");
		}
	}

}
