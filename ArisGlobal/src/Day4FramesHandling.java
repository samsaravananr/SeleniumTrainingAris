import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day4FramesHandling {

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
		WebDriver myD = new ChromeDriver();
		myD.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		
		myD.navigate().to("");
		
		System.out.println(myD.findElements(By.tagName("iframe")).size());
				
		//myD.switchTo().frame(0);
		//myD.switchTo().frame("ID or NAME");
		myD.switchTo().frame(myD.findElement(By.xpath("//iframe[@class='demo-frame']")));

		System.out.println(myD.findElement(By.id("draggable")).getText());
		
		WebElement vDrag=myD.findElement(By.id("draggable"));
		WebElement vDrop=myD.findElement(By.id("droppable"));
		
		Actions act=new Actions(myD);
		act.dragAndDrop(vDrag, vDrop).build().perform();
		
		Thread.sleep(5000);
		
		myD.switchTo().defaultContent();
		
		System.out.println(myD.findElement(By.className("entry-title")).getText());
		
		myD.quit();

	}

}
