import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Locators1 {

	public static void main(String[] args) throws Exception  
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.get("https://www.mortgagecalculator.org/");
		System.out.println(myD.getTitle());
		
		
		myD.manage().window().maximize();
		
		//1. Enter Home VALUE
		myD.findElement(By.id("homeval")).sendKeys("3000");
		
		
		Thread.sleep(3000);
		
				
		//2. Enter Down Payment
		myD.findElement(By.name("param[downpayment]")).sendKeys("1000");
		Thread.sleep(3000);
		
		//3. Enter Intrest Rate
		myD.findElement(By.id("intrstsrate")).sendKeys("2.1");
		Thread.sleep(3000);
		
		//4. Click on Calcultate Button
		myD.findElement(By.name("cal")).click();
		Thread.sleep(3000);
		
		//5. Capture and Print Total Monthly Payment
		String vMPayment=myD.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		
		
		//6. Check if the Monthly Payment is 300 USD
		if (vMPayment.equals("300 USD"))
		{
			System.out.println("PASS");
		}
		
		else
		{
			System.out.println("FAIL: The Monthly Payment is "+vMPayment);
		}
		

	}

}
