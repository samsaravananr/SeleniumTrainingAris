import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.out.println("Hello World");
		
		
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.linkedin.com/login");
		Thread.sleep(5000);
		System.out.println("Title is : "+myD.getTitle());
		myD.close();
	}

}
