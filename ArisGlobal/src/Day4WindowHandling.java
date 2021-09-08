import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4WindowHandling 
{

	public static void main(String[] args) throws InterruptedException 
	{	
	System.setProperty("webdriver.chrome.driver","D:\\ArisGlobal\\chromedriver.exe");
	WebDriver myD = new ChromeDriver();
	myD.get("https://www.google.com/gmail/about/#");
	System.out.println(myD.getTitle());
	Thread.sleep(2000);
	
	//CLICKING ON HELP BUTTON
	myD.findElement(By.xpath("//ul/li[@class='h-c-footer__global-links-list-item h-c-footer__global-links-list-item--extra']/a[@class='h-c-footer__link']")).click();
	
	
	Set<String> wIDs=myD.getWindowHandles();
	//System.out.println(wIDs);
	
	
	Iterator<String> wIt=wIDs.iterator();
	
	String parentID=wIt.next();
	String childID=wIt.next();
	
	myD.switchTo().window(childID);
	
	
	//0th place
	//call it as a parent window -[CDwindow-DC77CD79EFBADF479763982AC0FA3D62 
	//call it as a child window - CDwindow-4A462C9E9A413E2DD07408242674C375]

	Thread.sleep(2000);
	System.out.println(myD.getTitle());
	
	myD.switchTo().window(parentID);
	
	
	
	myD.quit();
	

	}

}
