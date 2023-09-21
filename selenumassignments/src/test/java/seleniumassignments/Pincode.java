package seleniumassignments;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Pincode {
	
	WebDriver driver;
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://finkode.com/tn/chennai.html");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[5]/td[1]/a")).click();
		String Pincode1=driver.findElement(By.xpath("//*[@id=\"c760\"]/table/tbody/tr[4]/td[2]/a")).getText();
		String Place1=driver.findElement(By.xpath("//*[@id=\"c760\"]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println(Place1 +"-"+Pincode1);
		
		driver.findElement(By.xpath("//*[@id=\"c760\"]/p[1]/a[3]")).click();
		Set<String> windows=driver.getWindowHandles();
		
		for(String S: windows) {
			driver.switchTo().window(S);
			
		}
		driver.findElement(By.xpath("//*[@id=\"c760\"]/div[2]/table/tbody/tr[9]/td[1]/a")).click();
		String pincode2=driver.findElement(By.xpath("//*[@id=\"c760\"]/table/tbody/tr[4]/td[2]/a")).getText();
		String Place2=driver.findElement(By.xpath("//*[@id=\"c760\"]/table/tbody/tr[1]/td[2]")).getText();
		System.out.println( Place2+"-"+pincode2);
		
		Assert.assertFalse(Place1.equals(Place2));
		Assert.assertFalse(Pincode1.equals(pincode2));
		
		System.out.println("Hence The Pincodes are Not Same");
		
		
		
	}
	@AfterClass
	public void tearDown() {
		driver.close();
	}
	

}