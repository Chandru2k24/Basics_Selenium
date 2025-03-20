package com.exp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascriptninja2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("drchandru0@gmail.com");
        WebElement pass=driver.findElement(By.id("password"));
        pass.sendKeys("chandru@2004");
        driver.findElement(By.id("submit")).click();
        List<WebElement> t=driver.findElements(By.xpath("//thead//tr//th"));
        System.out.println("size of list:"+t.size());
        for(WebElement b:t)
        {
        	System.out.println("the th:"+b.getText());
        }
	}

}