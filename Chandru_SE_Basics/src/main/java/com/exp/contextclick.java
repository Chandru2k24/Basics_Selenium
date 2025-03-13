package com.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {
    public static void main(String args[]) {
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://omayo.blogspot.com/");
    	WebElement blogspotmenuElement=driver.findElement(By.id("blogsmenu"));
    	Actions action = new Actions(driver);
    	WebElement searchfield = driver.findElement(By.xpath("//input[@class=\"gsc-input\"]"));
  	    action.contextClick(searchfield).perform();
    	
    }
}
