package qsp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis=new FileInputStream("./data/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String data = wb.getSheet("createcustomer").getRow(1).getCell(3).getStringCellValue();
		System.out.println(data);
		
		wb.getSheet("createcustomer").getRow(1).getCell(4).setCellValue("HDFC_002");
		wb.getSheet("createcustomer").getRow(1).getCell(5).setCellValue("fail");
		FileOutputStream fos=new FileOutputStream("./data/testscript.xlsx");
		wb.write(fos);
		System.out.println("Data set succesfully");
		
		fis.close();
		fos.flush();
		fos.close();
	}

}
