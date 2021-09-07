import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Day2Locators4 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		
		//1. //tagname[@attribue='value']
		driver.findElement(By.xpath("//a[@data-csa-c-content-id='nav_cs_mobiles_9292c6cb7b394d30b2467b8f631090a7']")).click();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("//span[text()='Mobile Accessories']")).click();
		
		
		//Absolute XPATH
		String vMobile=driver.findElement(By.xpath("//div[@id='s-refinements']/div[1]/ul/li[3]/span/a/span")).getText();
		
		System.out.println(vMobile);
		
		
		
		driver.quit();
				

	}

}
