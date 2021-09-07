import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2Locators2 {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String vFood="300";
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		
		driver.findElement(By.id("food")).sendKeys(vFood);
		driver.findElement(By.id("clothing")).sendKeys("100");
		driver.findElement(By.id("shelter")).sendKeys("300");
		driver.findElement(By.id("monthlyPay")).sendKeys("1000");
		driver.findElement(By.id("monthlyOther")).sendKeys("200");
		Thread.sleep(2000);
		
		String vMPay=driver.findElement(By.id("totalMonthlyExpenses")).getAttribute("value");
		String vMIncome=driver.findElement(By.id("totalMonthlyIncome")).getAttribute("value");
		
		System.out.println("Monthly Income is : "+vMPay);
		System.out.println("Monthly Income is : "+vMIncome);
		
		
		
		
		driver.quit();
				

	}

}
