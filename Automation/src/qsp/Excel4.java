package qsp;

import java.io.IOException;

import com.actitime.generic.FileLib;

public class Excel4 
{

	public static void main(String[] args) throws IOException 
	{
		FileLib f=new FileLib();
		String data = f.getPropertyData("./data/commondata.property", "Un");
		System.out.println(data);
		
		System.out.println(f.getExcelData("./data/testscript.xlsx", "createcustomer", 1, 3));
		f.setExcelData("./data/testscript.xlsx", "createcustomer", 1, 5, "N/A");
	}

}
