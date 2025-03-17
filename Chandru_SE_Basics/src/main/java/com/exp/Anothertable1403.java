package com.exp;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anothertable1403 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://omayo.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

//        List<WebElement> tbody = driver.findElements(By.tagName("thead"));
//        for (int i = 0; i < tbody.size(); i++) {
//            System.out.println(tbody.get(i).getText());
//        }
//
//        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
//        for (int j = 0; j < rows.size(); j++) {
//            List<WebElement> cells = rows.get(j).findElements(By.tagName("td"));
//            for (int k = 0; k < cells.size(); k++) {
//                System.out.print(cells.get(k).getText() + " ");
//            }
//            System.out.println();
//        }
        List<WebElement> rowsizes=driver.findElements(By.xpath("//table[@id=\"table1\"]//tr"));
        int rowsize=rowsizes.size();
        List<WebElement> colsizes=driver.findElements(By.xpath("//table[@id=\"table1\"]//th"));
        int colsize=colsizes.size();
        System.out.println("row size:"+rowsize);
        System.out.println("col size:"+colsize);
        
        for(int i=1;i<=rowsize;i++)
        {
        	for(int j=1;j<=colsize;j++)
        	{
        		if(i==1)
        		{
        			WebElement data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+i+"]//th["+j+"]"));
        			System.out.print(data.getText()+"	");
        		}
        		else
        		{
        			WebElement data=driver.findElement(By.xpath("//table[@id=\"table1\"]//tr["+(i-1)+"]//td["+(j)+"]"));
        			System.out.print(data.getText()+"	");
        		}
        	}
        	System.out.println();
        }
        

        driver.quit();
    }
}