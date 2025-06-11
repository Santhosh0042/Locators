
	package codes;

	import java.io.File;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import org.openqa.selenium.By;
	import org.apache.commons.io.FileUtils;
	import java.time.Duration;
    import java.util.Set;
    import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.Wait;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.WebElement;

	public class SwiggyCodes {

		public static void main(String[] args) throws InterruptedException, IOException {
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			String str = driver.getTitle();
			System.out.println(str);
			
			
			
		
			
			
			
			
			/* WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        // Wait for the "About" button to be clickable
		    WebElement aboutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'About')]")));
			String aboutButtonText = aboutButton.toString();
			System.out.println(aboutButtonText);
			aboutButton.click();
			*/
			
			
			/*WebElement LocationButton = driver.findElement(By.id("location-banner-button"
			 * ));
			String LocationButtonTxt = LocationButton.toString();
			System.out.println(LocationButtonTxt);
			LocationButton.click();
			driver.navigate().back();
			WebElement rideLnk = driver.findElement(By.className("css-ekbqzf"));
			System.out.println(rideLnk.toString());
			rideLnk.submit();*/
//			WebElement pricesLink = driver.findElement(By.linkText("loginbbhhhgh"));
//			//System.out.println(pricesLink.getText());
//			pricesLink.click();
//			WebElement phTextbox = driver.findElement(By.id("PHONE_NUMBER_or_EMAIL_ADDRESS"));
//			phTextbox.sendKeys("12345");
//			File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			File destFile = new File("./Screenshots/uberscreenshot.png");
//			FileUtils.copyFile(sourceFile, destFile);
//			System.out.println("Taken Screenshot of Uber see prices page");
//			//driver.navigate().refresh();
//			Thread.sleep(5000);
//			driver.navigate().back();
//			System.out.println("Application backward to uber.com");
//			Thread.sleep(3000);
//			driver.navigate().forward();
//			System.out.println("Application forwarded see prices page");
//			byte[] byteFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			File destFile2 = new File("./Screenshots/uberscreenshot2.bmp");
//			FileOutputStream fos = new FileOutputStream(destFile2);
//			fos.write(byteFile);		
//			System.out.println("Taken 2nd Screenshort of see prices successfully");
//			
//			Thread.sleep(3000);
//			driver.navigate().to("https://www.rapido.bike/Home");
//			Thread.sleep(3000);
//			driver.navigate().back();  
//			
//			String pinterestParenthandle = driver.getWindowHandle();
//			System.out.println("The Parent window handle & Title for Pinterest is :" + pinterestParenthandle + driver.getTitle());
//			driver.findElement(By.linkText("blackText font18 lineHeight22 appendBottom10 latoBlack")).click();
//			Thread.sleep(2000);
//			Set<String> pinterestChildhandles = driver.getWindowHandles();
//			String currentUrl = driver.getCurrentUrl();
//			System.out.println("the Current webpage is :"+ currentUrl);
//			for(String windowhandle : pinterestChildhandles)
//			{
//			System.out.println("The Child window handle & Title for pinterest is :" + windowhandle);
//			driver.switchTo().window(currentUrl);
//			System.out.println("the Current Url is :"+ driver.getTitle());
//			}
//			driver.switchTo().window(pinterestParenthandle);
//			System.out.println("the Current webpage is :"+ driver.getWindowHandle());
		    
			
			
	WebElement searchboxtxt = driver.findElement(By.name("q"))	;	
			
    if(searchboxtxt. isDisplayed())
{
	if(searchboxtxt. isEnabled())
{
	searchboxtxt.sendKeys("12345");
	Thread.sleep(2000);
}
else 
{
	System.out.println("The search box is not enabled");
  }
}
else
{
	System.out.println("The search box is not Displayed");
}

searchboxtxt.clear();
searchboxtxt.sendKeys("67890");
String displayedtxt = searchboxtxt.getAttribute("value");
System.out.println("The search box displayed text is : "+ displayedtxt);
WebElement brandchkbox = driver.findElement(By.className(displayedtxt));
brandchkbox.click();
if(brandchkbox.isSelected())
{


}

else
	
{
	System.out.println("The check box is not selected for acer");
	
}

Thread.sleep(2000);

driver.quit();  
			
		}
	}
	
	
	
	