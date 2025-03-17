package com.exp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://omayo.blogspot.com/");
        List<WebElement> t=driver.findElements(By.xpath("//*//table[@id=\"table1\"]//th"));
        System.out.println("size of list:"+t.size());
        for(WebElement b:t)
        {
        	System.out.println("the th:"+b.getText());
        }
        List<WebElement> body=driver.findElements(By.xpath("//table[@id=\"table1\"]//tbody"));
        System.out.println("size of list:"+t.size());
        for(WebElement data:body)
        {
        	System.out.println(data.getText());
        }
        System.out.println("\n");
        List<WebElement> rowsizes=driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
        
        
	}

}