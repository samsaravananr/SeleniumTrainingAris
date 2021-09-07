import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Day2Locators5 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("12345");
		
		
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='email' and @id='email']")).clear();
		
		
				
		driver.quit();
				

	}

}
