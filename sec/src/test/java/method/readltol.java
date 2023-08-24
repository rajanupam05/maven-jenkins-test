package method;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readltol 
{
	
	public static void main(String[] args) throws IOException {
		int l=0, w=0, c=0;
		BufferedReader br=new BufferedReader(new FileReader(new File("../sec/test.txt")));
		String a;
		while((a=br.readLine()) != null)
		{
			System.out.println(a);
			l++;
			String[] n=a.split(" ");
			w=w+n.length;
			
			for(int i=0;i<n.length;i++)
			{
				c=c+n[i].length();
			}
		}
		System.out.println("line is: "+l);
		System.out.println("word is: "+w);
		System.out.println("character is: "+c);
	}
}
