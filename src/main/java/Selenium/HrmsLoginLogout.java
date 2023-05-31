package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HrmsLoginLogout {

	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshokMarrapu\\eclipse-workspace\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Google Chrome is launched");
		driver.navigate().to("http://127.0.0.1/orangehrm-2.6/login.php");
		Thread.sleep(2000);
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.name("Submit")).click();
		System.out.println("Logged into Orange hrms website");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("Logged out from Orange hrms website");
		driver.close();	
		System.out.println("Google Chrome is closed");

	}


}
