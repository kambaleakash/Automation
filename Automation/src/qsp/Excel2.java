package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		int rc=wb.getSheet("invalidlogin").getLastRowNum();
		
		for (int i = 1; i <= rc; i++) 
		{
			String un=wb.getSheet("invalidlogin").getRow(i).getCell(0).toString();
			String pwd=wb.getSheet("invalidlogin").getRow(i).getCell(1).toString();
			System.out.println(un+" "+pwd);
		}

//		for (int i = 0; i <=rc; i++) 
//		{
//			int cc=wb.getSheet("invalidlogin").getRow(0).getLastCellNum();
//			
//			for(int j=0; j<cc; j++)
//			{
//				String data=wb.getSheet("invalidlogin").getRow(i).getCell(j).toString();
//				System.out.println(data);
//			
//			}
//		}

	}

}
