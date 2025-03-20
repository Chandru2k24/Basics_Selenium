package com.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptFlash {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

        WebElement elementToFlash = driver.findElement(By.id("input-email"));
        flashElement(driver, elementToFlash);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        driver.quit();
    }

    public static void flashElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String originalColor = element.getCssValue("backgroundColor");
        
        for (int i = 0; i < 3; i++) {
            // Change to red
            js.executeScript("arguments[0].style.backgroundColor='red';", element);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            // Revert to original color
            js.executeScript("arguments[0].style.backgroundColor='" + originalColor + "';", element);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
