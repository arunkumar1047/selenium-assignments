package demo;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Demo{
	@Test
public void test() throws InterruptedException, IOException
		{
			//create a path for excel
			String path = "\\C:\\Users\\USER\\Documents\\hi.xlsx";

			//create input stream for the excel using above path
			FileInputStream fileStream = new FileInputStream(path);

			//create a reference of the workbook using the input stream reference - POI jars
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook (fileStream);

			//create a sheet reference using the workbook reference -- POI Jars-- already added
			XSSFSheet sheet = workbook.getSheet("Sheet1");

			//get the last row num
			   int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println(rowCount);
			for(int i=1; i<=rowCount; i++)
			{
				//get the user_name
				String username = sheet.getRow(i).getCell(0).getStringCellValue();
				System.out.println(username);
			}
		}
}