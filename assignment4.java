package assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignment4 {
	
	
	static WebDriver driver;
	static WebDriverWait wait;
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\Pratiksha\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("(//a[@class='desktop-main'][normalize-space()='Men'])[1]"))).build().perform();
		
		driver.findElement(By.cssSelector(".desktop-categoryLink[href='/men-jackets']")).click();
		driver.findElement(By.className("common-checkboxIndicator")).click();
		driver.findElement(By.className("brand-num")).click();
        driver.findElement(By.xpath("(//div[@class='common-checkboxIndicator'])[4]")).click();
        //Thread.sleep(10);
        //driver.findElement(By.cssSelector("input[value='WROGN']")).click();
        //driver.findElement(By.xpath("//label[@class=\"common-customCheckbox vertical-filters-label\"]//input[@value='Shirts']"));
        
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@value='1199.0 TO 4062.0'][1]"))));
        driver.findElement(By.xpath("//input[@value='1199.0 TO 4062.0'][1]")).click();
        
	    driver.findElement(By.xpath("//label[@class='common-customRadio vertical-filters-label']//input[@value='50.0 TO 100.0']")).click();
	    a.moveToElement(driver.findElement(By.cssSelector("a[target='_blank'][href='jackets/puma/puma-men-navy-blue-solid-open-front-jacket/15119014/buy']"))).click();

	}
	

	
}