package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prog3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
        driver.manage().window().maximize();
        
        WebElement serch = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
        
        Actions action = new Actions(driver);
        
      Actions seriesActions=   action.moveToElement(serch).click().
    		  keyDown(Keys.SHIFT).sendKeys("Selenium").keyUp(Keys.SHIFT).sendKeys(" webdriver").contextClick();
      
      seriesActions.build().perform();
      
        
  

        
       

	}

}
