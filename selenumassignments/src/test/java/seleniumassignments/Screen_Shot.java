package seleniumassignments;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","D:\\\\Edge\\\\Application\\\\msedgedriver.exe");

		WebDriver driver = new ChromeDriver();
		//driver.get("https://api.jquery.com/dblclick/");
		driver.get("https://fb.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		File screenshotFile =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(screenshotFile, new File("D:\\screen\\screen.png"));
		
		//driver.close();
		

	}

}
