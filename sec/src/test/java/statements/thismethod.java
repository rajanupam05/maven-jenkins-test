package statements;

public class thismethod 
{	
	public void method1()
	{
		this.method2(10);
		this.method3(10, 20);
		System.out.println("deafult method");
	}
	public void method2(int a)
	{
		System.out.println("single parameterized method");
	}
	public void method3(int a, int b)
	{
		System.out.println("double parameterized method");
	}
	public static void main(String[] args) {
		thismethod xyz=new thismethod();
		xyz.method1();
	}
}
