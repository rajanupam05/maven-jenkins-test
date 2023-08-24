package method;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class xlsreading 
{
	public static void main(String[] args) throws BiffException, IOException {
		File f=new File("../sec/testing.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell ce=ws.getCell(j, i);
				System.out.println(ce.getContents());
			}
		}
	}
}
