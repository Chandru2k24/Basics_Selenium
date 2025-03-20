package com.exp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;

public class JavaScriptDemo1 {
    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

        WebElement searchBox = driver.findElement(By.name("q"));
        javaScriptClick(driver, searchBox);
    }

    public static void javaScriptClick(WebDriver driver, WebElement element) {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].value='java programming';", element);
        element.sendKeys(Keys.ENTER);
    }
}