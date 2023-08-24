package assignmentsrevisiom;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class xlsmethod 
{
	public void method1() throws BiffException, IOException
	{
		File f=new File("../sec/testing1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the row: ");
		int r=s.nextInt();
		System.out.print("Enter the column: ");
		int c=s.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell ce=ws.getCell(j, i);
				System.out.print(ce.getContents()+" ");
			}
		}
	}
	public void method2() throws BiffException, IOException
	{
		File f=new File("../sec/testing1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		Scanner s=new Scanner(System.in);
		System.out.print("Row: ");
		int r=s.nextInt();
		int c=ws.getColumns();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell ce=ws.getCell(j, i);
				System.out.print(ce.getContents()+" ");
			}
		}
	}
	public void method3() throws BiffException, IOException
	{
		File f=new File("../sec/testing1.xls");
		Workbook wb=Workbook.getWorkbook(f);
		Sheet ws=wb.getSheet(0);
		Scanner s=new Scanner(System.in);
		System.out.print("intial row: ");
		int ir=s.nextInt();
		System.out.print("end row: ");
		int er=s.nextInt();
		int c=ws.getColumns();
		for(int i=ir;i<er;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell ce=ws.getCell(j, i);
				System.out.print(ce.getContents()+" ");
			}
		}
	}
	public void method4() throws IOException, RowsExceededException, WriteException
	{
		File f=new File("../sec/testing.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);
		WritableSheet es=wb.createSheet("sheet 1", 0);
		Scanner s=new Scanner(System.in);
		System.out.print("row: ");
		int r=s.nextInt();
		System.out.println("column: ");
		int c=s.nextInt();
		System.out.println("content: ");
	//////	String cont=s.next();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				String cont=s.next();
				Label l=new Label(j, i, cont);
				es.addCell(l);
			}
		}
		wb.write();
		wb.close();
	}
	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		xlsmethod x=new xlsmethod();
		x.method4();
	}
}
