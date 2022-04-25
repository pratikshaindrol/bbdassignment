package assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;



 
public class assignment1 {
	
	
             static WebDriver driver ;
             
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.edge.driver","C:\\Users\\Pratiksha\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		 WebDriver driver=new EdgeDriver();
		
	
	
	
		driver.get("http://qatechhub.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
		driver.get("https://www.facebook.com"); 
		driver.navigate();
		driver.get("http://qatechhub.com");
		driver.navigate();
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println(driver.getCurrentUrl());
		 	
		 	driver.close();
		
		
		
		}
	}
	