package com.exp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;


public class Question3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username = driver.findElement(By.xpath("//input[contains(@class,\"oxd-input oxd-input--active\")]"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.xpath("//input[contains(@class,\"oxd-input oxd-input--active\")]"));
        password.sendKeys("admin123");
        WebElement loginButton = driver.findElement(By.xpath("//input[contains(@class,\"oxd-button oxd-button--medium oxd-button--main orangehrm-login-button\")]"));
        loginButton.click();
        driver.close();
          
    }
}

        
        