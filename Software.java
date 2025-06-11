package SoftwareTesting;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Software {

	public static void main(String[] args) throws InterruptedException {

		    WebDriver driver = new ChromeDriver();		 
	        driver.get("https://www.softwaretestinghelp.com/");	 
	        
	        String str_Title = driver.getTitle();	        
	        System.out.println(str_Title);	      
	        
	        WebElement searchBar = driver.findElement(By.name("q"));        
            String searchTerm = "Maven";            
            System.out.println(searchBar.getText());  
            searchBar.sendKeys("Maven");  
            
            String mainhandle = driver.getWindowHandle();
            System.out.println(mainhandle);
            
            WebElement searchButton = driver.findElement(By.name("sa"));            
            String btnText = searchButton.toString();           
            searchButton.click();
            
            driver.get("https://cse.google.com/cse?cx=partner-pub-4494420772031453:2717605672&ie=UTF-8&q=Maven&sa=Search&ref=www.google.com/");
            
            String childhandle = driver.getWindowHandle();
            System.out.println(childhandle);
            
            Set<String> hanldes = driver.getWindowHandles();
            System.out.println(hanldes);
                                   
            WebElement searchItem = driver.findElement(By.className("gs-title"));            
            System.out.println(searchItem.getText());   
            
            searchItem.click();            
		    driver.manage().window().maximize();
		    
		    Thread.sleep(3000);	    
		    driver.quit();
		
	}

}
