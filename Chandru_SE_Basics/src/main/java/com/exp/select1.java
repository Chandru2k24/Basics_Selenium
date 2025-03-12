package com.exp;

import java.time.Duration;
import java.lang.*;
import java.lang.Iterable;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
public class select1 {
	public static void main(String[] args){
		ChromeOptions options = new ChromeOptions();
	
		WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://bstackdemo.com/");
      driver.findElement(By.xpath("//select")).click();
      List<WebElement> allOptions=driver.findElements(By.cssSelector("select option"));
      System.out.println("Option Size:"+allOptions.size());
      String option = "Lowest to highest";
      for(int i =0;i<allOptions.size();i++) {
    	 if(allOptions.get(i).getText().contains(option)) {
    	  allOptions.get(i).click();
    	  System.out.println("clicked");
    	  break;
      }
      
	}
	}
}