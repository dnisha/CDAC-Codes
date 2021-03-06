package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\ChromeDriver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/?.src=search&.intl=in&.lang=en-IN&.done=https%3A%2F%2Fin.search.yahoo.com%2F%3Ffr2%3Dinr&pspid=2114723002&activity=header-signin");
		
		try {
			WebElement  searchBox = driver.findElement(By.id("login-signin"));
			System.out.println("Login  Found ");
		} catch (Exception e) {
			System.out.println("Login Not Found ");
		}
		

		try {
		driver.findElement(By.name("username"));
			System.out.println("Username  Found ");
		} catch (Exception e) {
			System.out.println("UseName Not Found ");
		}
		

		try {
		driver.findElement(By.xpath("//*[@id=\"login-username\"]"));
			System.out.println("Username  Found ");
		} catch (Exception e) {
			System.out.println("UseName Not Found ");
		}
		
		

		try {
		driver.findElement(By.cssSelector("#createacc"));
			System.out.println("Create Account  Found ");
		} catch (Exception e) {
			System.out.println("Create Account Not Found ");
		}
		

		try {
		driver.findElement(By.linkText("Forgotten username?"));
			System.out.println("Link Text  Found ");
		} catch (Exception e) {
			System.out.println("Link Text Not Found ");
		}
		
		
		try {
			driver.findElement(By.partialLinkText("Forgotten "));
				System.out.println("Paertil Link Text  Found ");
			} catch (Exception e) {
				System.out.println("Partial Link Text Not Found ");
			}
		
		try {
			driver.findElement(By.className("phone-no field-error "));
				System.out.println("Class Name Found ");
			} catch (Exception e) {
				System.out.println("Class Name Not Found ");
			}
		
		
		try {
			driver.findElement(By.tagName("input"));
				System.out.println("Tag Name Found ");
			} catch (Exception e) {
				System.out.println("Tag Name Not Found ");
			}
	}

}
