package com.exp;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.co.in/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("document.querySelector('[title=\"Search\"]').value='Java Programming';");
        
        WebElement searchButton = driver.findElement(By.name("btnK"));
        javaScriptClick(driver, searchButton);
        
        System.out.println("Page Title: " + js.executeScript("return document.title;"));
        
        driver.quit();
	}
	
	public static void javaScriptClick(WebDriver driver, WebElement element) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", element);
	}
}
