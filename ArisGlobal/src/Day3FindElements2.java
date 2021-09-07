import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3FindElements2 {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://echoecho.com/htmlforms10.htm");
		int vSize=driver.findElements(By.xpath("//input[@type='radio']")).size();
		myPrint(vSize);
		
		
		int vGroup1=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for (int i=0;i<vGroup1;i++)
		{
			String vRadio=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			myPrint(vRadio);
			
			if(vRadio.equals("Cheese"))
			{
				driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
			}
			
			
		}
		
		
		
	}
	
	
	
	
	
	
	public static void myPrint(Object vText)
	{
		System.out.println(vText);
	}

}
