import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3FindElements {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com/");
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("The Total Links from Google.com is "+links);
		
		//tagname[@attribute='value']
		int vButton=driver.findElements(By.xpath("//input[@type='submit']")).size();
		System.out.println("The Total Number of Buttons "+vButton);
		
		
		
		

	}

}
