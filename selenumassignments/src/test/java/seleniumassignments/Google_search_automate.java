package seleniumassignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Google_search_automate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		 driver.findElement(By.name("q")).sendKeys("java"+Keys.ENTER);
		 

	        //driver.findElement(By.id("block-517e9e97-d25b-41b1-8108-463e0137df8c")).sendKeys("text");
	       
	       WebElement java = driver.findElement(By.partialLinkText("Java Tutorial"));
            java.click();
            driver.quit();
		
		
		/*driver.findElement(By.name("q")).sendKeys("Java"+Keys.ENTER);
		WebElement searchElement = driver.findElement(By.xpath("//*[@id=\"gsr\"]"));
		System.out.println(searchElement.getText());
		JavascriptExecutor js = (JavascriptExecutor) driver;  
		js.executeScript("arguments[0].click();",searchElement);
		Thread.sleep(1000); // just added time to make sure you will see the page navigation is successful.
		driver.quit();


		//driver.findElement(By.name("q")).sendKeys("java"+Keys.ENTER);
		WebElement a= driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		a.sendKeys("java"+Keys.ENTER);
		Thread.sleep(1000);
		
	//	driver.findElement( By.id("q")).sendKeys("java"+Keys.ENTER);
		//driver.findElement(By.id("input")).sendKeys("java"+Keys.ENTER);
		List <WebElement> list = driver.findElements(By.xpath("//*[@id=\"gsr\"]"));
		//System.out.println((list).getText());
		
		
		//List <WebElement> list= driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
		System.out.println("Total no of suggestions in search box::" +list.size());

        for(int i=0; i<list.size();i++) {
            System.out.println(list.get(i));

            if(list.get(i).getText().contains("Java Tutorial")) {
                list.get(i).click();
                break;
            }
        }

		//System.out.println(list);
		driver.close();*/
	}

}
