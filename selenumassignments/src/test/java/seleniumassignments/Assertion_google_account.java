package seleniumassignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertion_google_account {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		WebElement attr = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		attr.sendKeys("arun");
		String firstname = attr.getAttribute("value");
		System.out.println("first name:"+firstname);
		
		WebElement attr1 = driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
		attr1.sendKeys("kumar");
		String lastname = attr1.getAttribute("value");
		System.out.println("Last name:"+lastname);
		
		WebElement attr3 = driver.findElement(By.name("Username"));
		attr3.sendKeys("arunkumar");
		String username = attr3.getAttribute("value");
		System.out.println("username:"+username);
		
		WebElement attr4 = driver.findElement(By.name("Passwd"));
		attr4.sendKeys("Ekvillain@1");
		
		WebElement attr5 = driver.findElement(By.name("ConfirmPasswd"));
		attr5.sendKeys("Ekvillain@1");
		
		//WebElement attr6= driver.findElement(By.id("i3"));
		//attr6.click();
		
		
		//driver.close();
		
		
	}

}
