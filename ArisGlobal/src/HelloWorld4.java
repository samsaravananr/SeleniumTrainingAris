import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelloWorld4 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.out.println("Hello World");
		System.setProperty("webdriver.gecko.driver","D:\\ArisGlobal\\geckodriver.exe");
		WebDriver myD=new FirefoxDriver();
		myD.get("https://www.linkedin.com/login");
		
		System.out.println("Title is "+myD.getTitle());
		System.out.println("Current URL is "+myD.getCurrentUrl());
		System.out.println("Page Should is "+myD.getPageSource());
		
		
		
		
		myD.close();
		
		
	}

}
