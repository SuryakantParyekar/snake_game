package generic;

public class Ex1<T,U> {
	T x;
	U y;
	int z;
	Ex1(T x, U y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	void Display()
	{
		System.out.println("X = " + this.x);
		System.out.println("Y = " + this.y);
		System.out.println("Z = " + this.z);
	}
}
