package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testautomationpractice.blogspot.com/");
		
        driver.manage().window().maximize();
        

        WebElement name = driver.findElement(By.id("field2"));
        name.sendKeys("Deepak nishad");
        
        Select x = new Select(driver.findElement(By.id("speed")));
        x.selectByIndex(3);
        
     driver.findElement(By.name("RESULT_RadioButton-7")).click();

	}

}
