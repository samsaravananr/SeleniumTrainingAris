import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.out.println("Hello World");
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
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
