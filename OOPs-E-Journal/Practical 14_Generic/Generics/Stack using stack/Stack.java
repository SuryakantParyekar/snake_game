package genericStack;
import javax.swing.JOptionPane;

public class Stack<T> {
	T element[];
	int top;
	
	Stack(T element[])
	{
		this.element = element;
		this.top = -1;
	}
	
	void push(T var)
	{
		try {
			element[++top] = var;
		} catch(ArrayIndexOutOfBoundsException e) {
			JOptionPane.showMessageDialog(null, "Overflow");
		}
	}
	
	T pop()
	{
		if(!empty())
			return element[top--];
		else
			return null;
	}
	
	boolean empty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	T stackTop()
	{
		if(top == -1)
			return null;
		else
			return element[top];
	}
	String display()
	{
		String str = "";
		for(int i=0; i<=top; i++)
		{
			str = str + (element[i]) + ' ';
		}
		return str;
	}
}
