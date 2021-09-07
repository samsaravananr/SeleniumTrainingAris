import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day2StaticDropDown {

	public static void main(String[] args) throws InterruptedException 
	{

			
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.cleartrip.com/");
		Thread.sleep(5000);
		
		Select select=new Select(driver.findElement(By.xpath("//Select[@class='bc-neutral-100 bg-transparent']")));
		select.selectByIndex(6);
		Thread.sleep(3000);
		
		select.selectByValue("3");
		Thread.sleep(3000);
		
		select.selectByVisibleText("8");
		Thread.sleep(3000);
		
		
		

	}

}
