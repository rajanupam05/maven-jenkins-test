package assignmentsrevisiom;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class txtmethod 
{
	public void method1() throws IOException
	{
		File f=new File("../sec/test.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		Scanner s=new Scanner(System.in);
		System.out.print("line: ");
		int l=s.nextInt();
		for(int i=1;i<l;i++)
		{
			br.readLine();
		}
		System.out.println(br.readLine());
	}
	public void method2() throws IOException
	{
		File f=new File("../sec/test.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		Scanner s=new Scanner(System.in);
		System.out.print("initial line: ");
		int il=s.nextInt();
		System.out.print("end line: ");
		int el=s.nextInt();
		for(int i=il;i<=el;i++)
		{
			br.readLine();
			System.out.println(br.readLine());
		}
	}
	public void method3() throws IOException
	{
		File f=new File("../sec/test1.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		Scanner s=new Scanner(System.in);
		System.out.println("no. of lines: ");
		int rc=s.nextInt();
		System.out.println("line content: ");
		for(int i=0;i<=rc;i++)
		{
			String c=s.nextLine();
			bw.write(c);
			bw.newLine();
		}
		bw.close();
	}
	public void method4() throws IOException
	{
		File f=new File("../sec/test1.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		Scanner s=new Scanner(System.in);
		System.out.print("inital rowcount: ");
		int r=s.nextInt();
		System.out.print("end rowcount: ");
		int c=s.nextInt();
		System.out.println("content is: ");
		for(int i=0; i<c-1 ;i++)
		{
			if(i<r-3)
			{
				bw.newLine();				
			}
			else
			{
				String cont=s.nextLine();
				bw.newLine();		///one line gap wil come from here
				bw.write(cont);
			}
		}
		bw.close();
	}
	public static void main(String[] args) throws IOException {
		txtmethod t=new txtmethod();
		t.method4();
	}
}
