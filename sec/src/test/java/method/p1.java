package method;

public class p1 
{
	public int add(int a, int b)
	{
		int x=a+b;
		return x;
	}
	public int subtract(int a, int b)
	{
		int y=a-b;
		return y;
	}
	public void multiply(int x, int y)
	{	
		int z=x*y;
		System.out.println(z);
	}
	public static void main(String[] args) {
		p1 xyz=new p1();
		int sumresult=xyz.add(10, 12);
		int subresult=xyz.subtract(13, 10);
		xyz.multiply(sumresult, subresult);
		
	}
}
