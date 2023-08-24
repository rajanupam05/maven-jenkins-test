package method;

import java.awt.Label;
import java.io.File;
import java.io.IOException;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class writexlsfile {
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		File f=new File("../sec/testing.xls");
		WritableWorkbook wb=Workbook.createWorkbook(f);
		WritableSheet ws=wb.createSheet("xyz", 0);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				jxl.write.Label l=new jxl.write.Label(j, i, "xyz");
				ws.addCell(l);
			}
		}
		wb.write();
		wb.close();
	}

}
