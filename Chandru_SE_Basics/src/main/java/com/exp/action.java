package com.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
   public static void main(String args[]) {
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://omayo.blogspot.com/");
	   WebElement blogsmenuElement= driver.findElement(By.id("blogsmenu"));
	   Actions action = new Actions(driver);
	   action.moveToElement(blogsmenuElement).perform();
	   WebElement Option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
	   action.moveToElement(Option2).click().build().perform();
   }

}
