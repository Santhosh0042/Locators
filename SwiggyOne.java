package Swiggyhyd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwiggyOne {
		
		public static void main(String[] args) throws InterruptedException {
			
			ChromeDriver driver= new ChromeDriver();
	        driver.get("https://www.jiomart.com/");
	        String str_Title = driver.getTitle();
			System.out.println(str_Title);
	        driver.manage().window().maximize();
	        Thread.sleep(1000);
	        
	        WebElement txtElemSearch= driver.findElement(By.id("autocomplete-0-input"));
			txtElemSearch.sendKeys("paneer");
			txtElemSearch.click();
			String myText = txtElemSearch.toString();
			System.out.println(myText);
			Thread.sleep(1000);
			
			WebElement signbut=driver.findElement(By.id("sign_in_text"));
			String myclick=signbut.toString();
			signbut.click();
			System.out.println(myclick);
			driver.navigate().back();
			Thread.sleep(1000);
			
			WebElement Locationbutton= driver.findElement(By.id("delivery_city_pincode"));
			String myClick=Locationbutton.toString();
			Locationbutton.click();
			System.out.println(myClick);
			Thread.sleep(1000);
			
		    WebElement cartbut= driver.findElement(By.id("btn_minicart"));
			String Click=cartbut.toString();
			cartbut.click();
			System.out.println(Click);
			Thread.sleep(1000);
			
			WebElement Groceriesbut= driver.findElement(By.id("nav_link_2"));
			String locClick=Groceriesbut.toString();
			Groceriesbut.click();
			System.out.println(locClick);
			Thread.sleep(1000);
		    driver.close();
		}
    }