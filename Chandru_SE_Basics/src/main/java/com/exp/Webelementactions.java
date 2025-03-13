package com.exp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Webelementactions {
    public static void main(String[] args) {
     ChromeDriver driver1= new org.openqa.selenium.chrome.ChromeDriver();
     driver1.manage().window().maximize();
     //driver1.manage().window().maximize();
     driver1.get("http://www.dhtmlgoodies.com/packages/dhtml-suite-for-applications/demos/demo-drag-drop-3.html");
    Actions action = new Actions(driver1);
    WebElement box1=driver1.findElement(By.id("box6"));
    WebElement box2=driver1.findElement(By.id("box106"));
    action.dragAndDrop(box1, box2).build().perform();
    System.out.println("bg-color:"+box2.getCssValue("background-color"));
    
     
    }
    
}
