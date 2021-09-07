import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld3 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.out.println("Hello World");
		
		//Updating with gecko driver details
		System.setProperty("webdriver.gecko.driver","D:\\ArisGlobal\\geckodriver.exe");
		
		// Change it to Firefox Driver
		WebDriver myD=new FirefoxDriver();
		
		
		
		
		myD.get("https://www.linkedin.com/login");
		Thread.sleep(5000);
		String vTitle=myD.getTitle();
		if(vTitle.contains("Microsoft"))
		{
			System.out.println("TC001: PASS");
		}
		else
		{
			System.out.println("TC001: FAIL");
		}
		
		
		
		
		myD.close();
	}

}
