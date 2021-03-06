package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.jcip.annotations.ThreadSafe;

public class dragDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		   driver.manage().window().maximize();
		
		
		WebElement fram = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		driver.switchTo().frame(fram);
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement destination = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action  = new Actions(driver);
		Thread.sleep(2000);
		action.dragAndDrop(source, destination).perform();
		
		

	}

}
