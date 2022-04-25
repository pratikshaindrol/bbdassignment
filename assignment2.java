package assignments;


import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class assignment2 {
	
	static WebDriver driver;
	public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver","C:\\Users\\Pratiksha\\Downloads\\edgedriver_win64 (1)\\msedgedriver.exe");
		driver=new EdgeDriver();
	
		
		driver.get("https://in.yahoo.com/");
		// String t = "Trending Now";
		//if ( driver.getPageSource().contains("Trending Now")){
	      //   System.out.println("Text: " + t + " is present. ");
	      //} else {
	        // System.out.println("Text: " + t + " is not present. ");
		
	
		System.out.println(driver.getPageSource().contains("Trending Now"));
		
	
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 
		 
		 for(WebElement link:allLinks){
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
		 driver.get("https://in.search.yahoo.com/search;_ylt=AwrxwXqYVVNiaHwADAC6HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Nj?ei=UTF-8&p=COVID-19+in+India&fr=sfp-tts&fr2=p%3Asfp%2Cm%3Atn%2Cct%3Aall%2Ckt%3Aorg");
		 
		
		 HashSet<String> hs= new  HashSet <String>();
		 {
		 hs.add("https://in.search.yahoo.com/search;_ylt=AwrxwXqYVVNiaHwADQC6HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Nj?ei=UTF-8&p=Ukraine-Russia+War&fr=sfp-tts&fr2=p%3Asfp%2Cm%3Atn%2Cct%3Aall%2Ckt%3Aorg");
		 hs.add("https://in.search.yahoo.com/search;_ylt=Awrxwv4xV1NiAggASgG6HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Nj?ei=UTF-8&p=Narendra+Modi&fr=sfp-tts&fr2=p%3Asfp%2Cm%3Atn%2Cct%3Aall%2Ckt%3Aorg");
		 hs.add("https://in.search.yahoo.com/search;_ylt=Awrxwv4xV1NiAggASwG6HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Nj?ei=UTF-8&p=Basavaraj+Bommai&fr=sfp-tts&fr2=p%3Asfp%2Cm%3Atn%2Cct%3Aall%2Ckt%3Aorg");
		 hs.add("https://in.search.yahoo.com/search;_ylt=Awrxwv4xV1NiAggATAG6HAx.;_ylu=Y29sbwNzZzMEcG9zAzEEdnRpZAMEc2VjA3Nj?ei=UTF-8&p=Sachin+Pilot&fr=sfp-tts&fr2=p%3Asfp%2Cm%3Atn%2Cct%3Aall%2Ckt%3Aorg");
		 }
		 System.out.println(hs);
		 
		 Iterator<String>i=hs.iterator();
		 while(i.hasNext())
		 {
			driver.navigate().to(i.next()) ;
		 }
		 for (int j=0;j<5;j++)
		 {
		 driver.navigate().back();
		 }
		 
		 
		 
		 
	   }
	      }

	






