package Swiggyhyd;

	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.*;

	public class CssSelector {

		public static void main(String[] args) throws InterruptedException {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D155259813513%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540019%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1903918951918682350%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062141%26hvtargid%3Dkwd-362216169274%26hydadcr%3D5620_2359471%26gad_source%3D1&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.manage().window().maximize();
	    
	    
	   
	    WebElement EmailTextBox = driver.findElement(By.cssSelector("input#ap_email_login"));
	    EmailTextBox.click();
	    EmailTextBox.sendKeys("1234567");
	    
	    //WebElement MobileTexBox1 = driver.findElement(By.cssSelector(input[id = "rmobile"]));
	    WebElement MobileTexBox = driver.findElement(By.cssSelector("input[id = 'rmobile']"));
	    MobileTexBox.sendKeys("9876543210");
	     
	   //class css selector
	    
	    
	    //1st method driver.findElement(by.cssSelector("tagname.(class value)"));
//	    WebElement CheckBox = driver.findElement(By.cssSelector("input.za-tos"));
//	    CheckBox.click();
	    WebElement CheckBoxLabel = driver.findElement(By.cssSelector("label[for='tos']"));
	    CheckBoxLabel.click();
	    System.out.println("checkbox is selected");
        
	    //2nd method driver.findElement(by.cssSelector(".class value"));
	    WebElement PasswordShowBtn = driver.findElement(By.cssSelector(".zpassword-show"));
	    PasswordShowBtn.click();
	    
	    //3rd method driver.findElement(by.cssSelector("tagName[class='classvalue']"));
	    WebElement TryNowBtn = driver.findElement(By.cssSelector("input[class = 'signupbtn']"));
	    TryNowBtn.submit();
	    
	    
	    Thread.sleep(2000);
	    driver.close();
	    
		}

	}

