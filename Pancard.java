package SoftwareTesting;

		import java.io.IOException;
		import java.util.Set;

		import org.openqa.selenium.*;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.interactions.Actions;
		import org.openqa.selenium.support.ui.ExpectedCondition;
		import org.openqa.selenium.support.ui.Wait;
		import org.openqa.selenium.support.ui.WebDriverWait;



		public class Pancard {
		           
			public static void main(String [] args) throws IOException, InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.onlineservices.nsdl.com/paam/endUserRegisterContact.html");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			String ParentWindowhandle = driver.getWindowHandle();
			
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div[1]/div/ul/input[1]")).click();
			System.out.println("parentwindow");
			Thread.sleep(4000);
		
			//Set <string> windowHandles = driver.getwindowhandles();
			
			
			for(String childwindow : driver.getWindowHandles()) {
				
				driver.switchTo().window(childwindow);
			}
			driver.findElement(By.linkText("About us")).click();
			Thread.sleep(3000);
			driver.close();
			driver.switchTo().window(ParentWindowhandle);
			Thread.sleep(3000);
			driver.close();

			}	

}
