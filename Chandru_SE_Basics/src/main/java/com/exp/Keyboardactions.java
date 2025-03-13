package com.exp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {
	 public static void main(String args[]) {
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		   
		   driver.get("https://omayo.blogspot.com/");
		   WebElement key = driver.findElement(By.xpath("//a[text()=\"jqueryui\"]"));
		   Actions actions = new Actions(driver);
		   actions.keyDown(Keys.CONTROL).moveToElement(key).click().keyUp(Keys.CONTROL).build().perform();
		   
		   
	 }
}
