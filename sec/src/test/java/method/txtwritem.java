package method;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class txtwritem 
{
	public static void main(String[] args) throws IOException {
		BufferedWriter b=new BufferedWriter(new FileWriter(new File("../sec/test1.txt"),true));
		b.newLine();
		b.write("foruth line");
		b.newLine();
		b.write("fifth line");
		b.newLine();
		b.write("sixth line");
		b.newLine();
		b.close();
		
	}
}
