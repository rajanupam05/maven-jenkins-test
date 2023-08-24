package method;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readctoc 
{
	public void method() throws IOException
	{
		FileReader fr=new FileReader(new File("../sec/test.txt"));
		int a;
		while((a=fr.read()) != -1)
		{
			System.out.println((char)a);
		}
	}
	public static void main(String[] args) throws IOException {
		readctoc r=new readctoc();
		r.method();
	}
}
