package paperProject;

public class StartPaper {

	public static void main(String[] args) {
		Paper p1=new Paper();
		Paper p2=new Paper("cs103","computer science","CM",65,30);
		p2.Display();
		p1.setDetails("cs103","computer","CM",65,30);
		p1.Display();
	}
}
