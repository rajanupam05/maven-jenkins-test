package statements;

public class thiscontrictor 
{
	public thiscontrictor()
	{
		this(10, 20);
		System.out.println("default constructor");
	}
	public thiscontrictor(int a)
	{
		this();
		System.out.println("single paramterized constructor");
	}
	public thiscontrictor(int a, int b)
	{
		System.out.println("two parameterized constructor");
	}
	public static void main(String[] args) {
		thiscontrictor xyz=new thiscontrictor(10);
	}
}
