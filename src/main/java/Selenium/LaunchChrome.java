package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome
{

public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AshokMarrapu\\eclipse-workspace\\Drivers\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println("Google Chrome is launched");
		
		
	}


}
