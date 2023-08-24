package statements;

public class parentconst 
{
	int a;
	public parentconst()
	{
		System.out.println("default constructor");
	}
	public parentconst(int a)
	{
		this();
		System.out.println("single parameter constructor");
	}
	public parentconst(int a, int b)
	{
		this(10);
		System.out.println("two parameter constructor");
	}
}
