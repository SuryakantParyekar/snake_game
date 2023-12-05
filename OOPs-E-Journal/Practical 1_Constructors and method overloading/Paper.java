package paperProject;

public class Paper {
	private String Pcode;
	private String Pname;
	private String ClassName;
	private int MaxMarks;
	private int MinMarks;
	
	public Paper()
	{
		this.Pcode="";
		this.Pname="";
		this.ClassName="";
		this.MaxMarks=0;
		this.MinMarks=0;
		
	}
	public Paper(String Pcode,String Pname,String ClassName,int MinMarks,int MaxMarks)
	{
		this.Pcode=Pcode;
		this.Pname=Pname;
		this.ClassName=ClassName;
		this.MaxMarks=MaxMarks;
		this.MinMarks=MinMarks;
	}
	public void setDetails()
	{
		this.Pcode="";
		this.Pname="";
		this.ClassName="";
		this.MaxMarks=0;
		this.MinMarks=0;
	}
	public void setDetails(String Pcode,String Pname,String ClassName,int MinMarks,int MaxMarks)
	{
		this.Pcode=Pcode;
		this.Pname=Pname;
		this.ClassName=ClassName;
		this.MaxMarks=MaxMarks;
		this.MinMarks=MinMarks;
	}
	public void Display()
	{
		System.out.println("Pcode is : " + this.Pcode + " \nPname is : " + this.Pname + " \nClass Name is : " + this.ClassName + " \nMin Marks is : " + this.MinMarks + " \nMax Marks is : " + this.MaxMarks);
	}
	
}
