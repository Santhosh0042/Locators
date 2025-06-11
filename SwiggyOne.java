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
	        Thread.sleep(5000);
	        
//	        WebElement txtElemSearch= driver.findElement(By.id("autocomplete-0-input"));
//			txtElemSearch.sendKeys("paneer");
//			txtElemSearch.click();
//			String myText = txtElemSearch.toString();
//			System.out.println(myText);
//			Thread.sleep(3000);
//			
//			WebElement signbut=driver.findElement(By.id("sign_in_text"));
//			String myclick=signbut.toString();
//			signbut.click();
//			System.out.println(myclick);
//			driver.navigate().back();
//			Thread.sleep(3000);
//			
//			WebElement Locationbutton= driver.findElement(By.id("delivery_city_pincode"));
//			String myClick=Locationbutton.toString();
//			Locationbutton.click();
//			System.out.println(myClick);
//			Thread.sleep(3000);
//			
//		    WebElement cartbutton= driver.findElement(By.id("btn_minicart"));
//			String Click=cartbutton.toString();
//			cartbutton.click();
//			System.out.println(Click);
//			Thread.sleep(3000);
//			
//			WebElement Groceriesbut= driver.findElement(By.id("nav_link_2"));
//			String MyClick=cartbutton.toString();
//		    Groceriesbut.click();
//		    System.out.println(MyClick);
//			Thread.sleep(3000);
//		    
//			WebElement AllCategories = driver.findElement(By.className("header-nav-l1-item-link"));
//			String click=cartbutton.toString();
//			System.out.println(click);
//			AllCategories.click();
//		    Thread.sleep(3000);
//		    
//		    WebElement Categories = driver.findElement(By.className("sub_cat_nav text-truncate"));
//		    Categories.sendKeys("icecream");
//		    String mclick=cartbutton.toString();
//		    Categories.click();
//		    System.out.println(mclick);
//		    Thread.sleep(3000);
//		    driver.quit();
		    
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
		    	    
		    
		}
    }