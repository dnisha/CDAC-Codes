package Assignment;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Program2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://extendsclass.com/text-compare.html");
		
        driver.manage().window().maximize();
		WebElement  source = driver.findElement(By.xpath("//*[@id=\"dropZone\"]/div[2]/div/div[6]"));
		WebElement  destination = driver.findElement(By.xpath("//*[@id=\"dropZone2\"]/div[2]/div/div[6]"));
		Actions action=new Actions(driver);
	    Thread.sleep(2000);
		
		action.keyDown(source, Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		
		
		 Thread.sleep(2000);
		action.keyDown(destination, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		
		
		
	
	
		
		

	}

}
