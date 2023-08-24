package method;

import java.util.Scanner;

public class calculator {

	public void calc(int a, int b)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("please enter the operator: ");
		int op=s.nextInt();
		switch(op)
		{
		case 1:
			int r=a+b;
			System.out.println(r);
			break;
		case 2:
			int sub=a-b;
			System.out.println(sub);
			break;
		default:
			System.out.println("please enter correct operator");
			break;
		}
		
	}
	public static void main(String[] args) {
		calculator c=new calculator();
		c.calc(10, 12);
	}
}
