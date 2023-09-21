package seleniumassignments;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelSheet {
	WebDriver driver;
	String url=" https://accounts.google.com/signup";
	@SuppressWarnings("deprecation")
	@BeforeClass


	public void setUp() throws Exception{ 
		System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}

	@Test
	public void test() throws IOException

	{
		//create a path for excel
		String path = "\\C:\\Users\\USER\\Documents\\excelassign.xlsx";

		//create input stream for the excel using above path
		FileInputStream fileStream = new FileInputStream(path);

		//create a reference of the workbook using the input stream reference - POI jars
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook (fileStream);

		//create a sheet reference using the workbook reference -- POI Jars-- already added
		XSSFSheet sheet = workbook.getSheetAt(0);

		//get the last row num
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
		System.out.println(rowCount);
		for(int i=1; i<=rowCount; i++)
		{
			//get the user_name
			String FirstName = sheet.getRow(i).getCell(0).getStringCellValue();
			driver.findElement(By.id("firstName")).sendKeys(FirstName);
			//System.out.println(username);


			String LastName = sheet.getRow(i).getCell(1).getStringCellValue();
			driver.findElement(By.name("lastName")).sendKeys(LastName);
			

			String UserName = sheet.getRow(i).getCell(2).getStringCellValue();
			driver.findElement(By.name("Username")).sendKeys(UserName);


			//get the password
			String Password = sheet.getRow(i).getCell(3).getRawValue();
			driver.findElement(By.name("Passwd")).sendKeys(Password);

			//passing the password in the password field


			String ConfirmPassword = sheet.getRow(i).getCell(4).getRawValue();
			driver.findElement(By.name("ConfirmPasswd")).sendKeys(ConfirmPassword);

			//driver.findElement(By.name("current-password")).click();


		}
	}
	@AfterClass
	public void tearDown() {
		//driver.close();
	}
}



