package statements;

public class childconst 
{
	public childconst()
	{
		this(10, 20);
		System.out.println("default child");
	}
	public childconst(int a)
	{
		this();
		System.out.println("single paramter child");
	}
	public childconst(int a, int b)
	{
		System.out.println("two parameter child"); 
	}
	public static void main(String[] args) {
		parentconst pa=new parentconst(10);
		childconst ch=new childconst(10);
	}
}
