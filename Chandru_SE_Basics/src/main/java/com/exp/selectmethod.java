package com.exp;
import java.time.Duration;
import java.lang.*;
import java.lang.Iterable;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;
public class selectmethod {
	public static void main(String[] args){
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/selenium/web/formPage.html");
        WebElement UIAutomation = driver.findElement(By.xpath("//select[@name=\"multi\"]"));
        Select dropdown = new Select(UIAutomation);
        List<WebElement> list1 = dropdown.getOptions();
        System.out.println("size:"+list1.size());
        for(WebElement Is : list1) {
        	System.out.println("The dropdown options are:"+Is.getText());
        	
        }
        List<String> optionTextList=new ArrayList<>();
        for(WebElement option:list1) {
        	optionTextList.add(option.getText());
        }
        Collections.sort(optionTextList);
        System.out.println(optionTextList);
        
        Boolean multiple= dropdown.isMultiple();
        System.out.println("The multiple options available:"+multiple);
        
        //dropdown.selectByIndex(3);
        dropdown.selectByIndex(0);
        dropdown.selectByVisibleText("Onion gravy");
        List<WebElement> list = dropdown.getAllSelectedOptions();
        System.out.println("size:"+list.size());
        for(WebElement Is : list) {
        	System.out.println("The selected options are:"+Is.getText());
        	
        }
        
        dropdown.deselectByIndex(0);
        dropdown.deselectAll();
        
		
		
	}

}


