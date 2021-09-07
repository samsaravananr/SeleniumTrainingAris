import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Locators3 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("samsaravananr");
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("123456");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Eng")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		
		driver.quit();
				

	}

}
