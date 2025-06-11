package Swiggyhyd;


		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.support.ui.WebDriverWait;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import java.time.Duration;

		public class SwiggyName {

		    public static void main(String[] args) throws InterruptedException {

		        // Start Chrome browser
		        ChromeDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();

		        // Navigate to JioMart
		        driver.get("https://www.jiomart.com/");
		        System.out.println("Page Title: " + driver.getTitle());

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        // Search for "paneer"
		        WebElement txtElemSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("autocomplete-0-input")));
		        txtElemSearch.sendKeys("paneer");
		        System.out.println("Search box input: " + txtElemSearch.getAttribute("value"));
		        Thread.sleep(3000);

		        // Click on Sign in
		        WebElement signBut = driver.findElement(By.id("sign_in_text"));
		        System.out.println("Sign in text: " + signBut.getText());
		        signBut.click();
		        Thread.sleep(3000);

		        // Go back
		        driver.navigate().back();
		        Thread.sleep(3000);

		        // Click on Location button
		        WebElement locationButton = driver.findElement(By.id("delivery_city_pincode"));
		        System.out.println("Location button: " + locationButton.getText());
		        locationButton.click();
		        Thread.sleep(3000);

		        // Click on Cart button
		        WebElement cartButton = driver.findElement(By.id("btn_minicart"));
		        System.out.println("Cart button: " + cartButton.getText());
		        cartButton.click();
		        Thread.sleep(3000);

		        // Click on Groceries
		        WebElement groceriesButton = driver.findElement(By.id("nav_link_2"));
		        System.out.println("Groceries button: " + groceriesButton.getText());
		        groceriesButton.click();
		        Thread.sleep(3000);

		        // Click on All Categories
		        WebElement allCategories = driver.findElement(By.className("header-nav-l1-item-link"));
		        System.out.println("All Categories: " + allCategories.getText());
		        allCategories.click();
		        Thread.sleep(3000);

		        // Click on a Category (corrected CSS selector)
		        WebElement categories = driver.findElement(By.cssSelector(".text-truncate"));
		        System.out.println("Category: " + categories.getText());
		        categories.click();
		        Thread.sleep(3000);
		        
		        // Quit the browser
		        driver.quit();
		    }
	}
		


