import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("From")).click();
        Thread.sleep(2000);
        
        driver.findElement(By.name("From Location")).click();
        
        driver.findElement(By.name("From Location")).sendKeys("Hyderabad");
	
	   
	
	
	}

}
