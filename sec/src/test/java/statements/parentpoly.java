package statements;

public class parentpoly 
{
	public void poly(int a, String b)
	{
		System.out.println("default");
	}
	public void poly(int a)
	{
		System.out.println("true");
	}
	public static void main(String[] args) {
		parentpoly x=new parentpoly();
		x.poly(10);
	}
}
