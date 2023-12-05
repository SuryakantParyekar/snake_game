package tryexecpt;

public class TryExcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a = args.length;
			System.out.println("Value of a = "+a);
			int c[]= {1,4,5,3,6};
			//c[20] = 89;	
			int b=9,d;
			d=b/0;
			System.out.println("Value of d = "+d);
		}
		catch(ArithmeticException e) {
			System.out.println("Divisible by zero\n");
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bound\n");
		}
		finally {
			System.out.println("Final block");
		}
	}

}
