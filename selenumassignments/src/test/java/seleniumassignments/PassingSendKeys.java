package seleniumassignments;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class PassingSendKeys {
		WebDriver driver;
		String url="https://profile.w3schools.com/";
		@SuppressWarnings("deprecation")
		@BeforeClass
		public void before()
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\Program Files\\\\Google\\\\Chrome\\\\Application\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		@AfterClass
		public void after()
		{
			//driver.close();
		}
	  @Test
	  public void function() throws InterruptedException {
		  JavascriptExecutor JS = (JavascriptExecutor)driver;
		  JS.executeScript("document.getElementById('modalusername').value='arunkumar85.ak63@gmail.com'");
		  JS.executeScript("document.getElementById('current-password').value='Arun@1047'");
		 // driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[4]/div/div/div[4]/div[1]/button")).click();
		  //driver.findElement(By.xpath("//*[@id=\"navigation\"]/div/button")).click();  
	  }
	}


