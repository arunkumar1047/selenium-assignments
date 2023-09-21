package seleniumassignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ClickPage {

    @BeforeMethod
    public void setUp() {
    	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Testing");

        driver.findElement(By.id("block-517e9e97-d25b-41b1-8108-463e0137df8c")).sendKeys("text");
        List<WebElement> results=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println(results.size());
        for (int i=0;i<results.size();i++)
        {
            if (results.get(i).getText().contains("testing  types"))
            {
                results.get(i).click();
                break;
            }
        }

    }

    @Test
    public void testresults() {
    }
}