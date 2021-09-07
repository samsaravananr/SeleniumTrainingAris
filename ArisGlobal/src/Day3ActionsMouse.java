import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day3ActionsMouse {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		Thread.sleep(2000);
		myD.get("https://www.amazon.in/");
		
		
		Actions act=new Actions(myD);
		act.moveToElement(myD.findElement(By.id("nav-link-accountList"))).build().perform();
		
		Thread.sleep(4000);
		
		
		
		
		
			
		
	}
	
	
	
	
	
	
	
}
