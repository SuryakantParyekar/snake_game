package array_2nd;
import java.util.Scanner;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Book Name : ");
		String book = sc.next();
		System.out.print("Enter Subject : ");
		String sub = sc.next();
		Book b = new Book(book, sub);
		b.Display();
	}

}
