package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendKeyChar {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	
    driver.manage().window().maximize();
    
    WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
    
    StringBuilder string1 =new StringBuilder();
    string1.append("oneplus").append(" ");
    
    String string2 =" ";
    
    StringBuffer string3 = new StringBuffer();
    string3.append("earphones").append(" ").append("wireless");
    
    
    String string4 = " ";
    String string5 = "z";
   
//    Character sequence
    search.sendKeys(string1,string2,string3,string4,string5);
    
    Thread.sleep(2000);
    
   driver.findElement(By.id("nav-search-submit-button")).click();


	}

}
