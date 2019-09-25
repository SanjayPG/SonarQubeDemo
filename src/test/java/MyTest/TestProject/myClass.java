package MyTest.TestProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class myClass {
	
	public static WebDriver driver=null;
	
	@BeforeMethod
	public void launchdriver()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjay.pg\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	     driver.manage().window();
	}
	
	@Test
	public void Test1()
	{

		System.out.println("Test Case two with Thread Id:- "
				+ Thread.currentThread().getId());
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.getTitle();
		System.out.println("Title of the page is Test1"+driver.getTitle());
		
	}
	
	@Test
	public void Test2()
	{
		System.out.println("Test Case two with Thread Id:- "
				+ Thread.currentThread().getId());
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.getTitle();
		System.out.println("Title of the page is Test1"+driver.getTitle());
	}
	
	@Test
	public void Test3()
	{
		System.out.println("Test Case two with Thread Id:- "
				+ Thread.currentThread().getId());
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.getTitle();
		System.out.println("Title of the page is Test1"+driver.getTitle());
	}

	
	
	
}
