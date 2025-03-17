package com.exp;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Leafground1403 {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("----headless");
		WebDriver dvr= new ChromeDriver();
		dvr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dvr.manage().window().maximize();
		dvr.get("https://demoqa.com/frames");
		WebElement iframeele = dvr.findElement(By.id("frame1"));
		dvr.switchTo().frame(iframeele);
		String Frame1 = dvr.findElement(By.id("sampleHeading")).getText();
		System.out.println("switch by locator : "+Frame1);
		
		dvr.switchTo().defaultContent();
		
		String mainpage = dvr.findElement(By.xpath("//div[@id='framesWrapper']//h1")).getText();
		System.out.println("Back to Main page : "+mainpage );
		Set<String>frame=dvr.getWindowHandles();
		System.out.println(frame.size());
		dvr.switchTo().frame(3);
		
		String Frame2 = dvr.findElement(By.id("sampleHeading")).getText();
		System.out.println("Switch by index : "+Frame2);
		
	}

}