package com.exp;


import java.time.Duration;
import java.lang.*;
import java.lang.Iterable;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
public class task1123{
	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
  
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
      driver.get("https://bstackdemo.com/");
      WebElement option2= driver.findElement(By.xpath("//select"));
//      JavascriptExecutor js = (JavascriptExecutor)driver;
//      js.executeScript("arguments[0].value='highestprice'",option2);
      Actions action = new Actions(driver);
      action.moveToElement(option2).perform();
      WebElement customOption=driver.findElement(By.xpath("//option[text()='Lowest to highest']"));
      customOption.click();
      
  
      
	}
}