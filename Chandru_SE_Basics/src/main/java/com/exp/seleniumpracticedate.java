package com.exp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class seleniumpracticedate {
     public static void main(String args[]) {
    	 ChromeOptions options = new ChromeOptions();
 		WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
         WebElement send = driver.findElement(By.xpath("//*[@id=\"datepicker\"]"));
         send.click();
         
         
         
     }
}
