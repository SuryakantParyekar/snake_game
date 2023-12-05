package array_2nd;
import java.util.Scanner;

public class Book {
	Scanner sc = new Scanner(System.in);
	private String bookname;
	private String subject;
	private Publisher publisher;
	private Author []author = new Author[2];
	
	public Book(String bookname, String subject)
	{
		this.bookname = bookname;
		this.subject = subject;
		System.out.print("Enter the name of Publisher : ");
		String pname = sc.next();
		System.out.print("Enter publisher's Telephone Number : ");
		String ptelephone = sc.next();
		publisher = new Publisher(pname, ptelephone);
		for(int i=0; i<2; i++)
		{
			System.out.print("Enter the name of Author : ");
			String aname = sc.next();
			System.out.print("Enter author's Telephone Number : ");
			String atelephone = sc.next();
			System.out.print("Enter Author's address : ");
			String aaddress = sc.next();
			author[i] = new Author(aname, atelephone, aaddress);
		}
	}
	
	public void Display()
	{
		System.out.println("Book Name : " + this.bookname + ", Subject : " + this.subject);
		publisher.Display();
		for(int i=0; i<2; i++)
		{
			author[i].Display();
		}
	}
}
