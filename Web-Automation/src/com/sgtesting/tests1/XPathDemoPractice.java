package com.sgtesting.tests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemoPractice {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		absoluteXPathDemo();
		relativeXPathUsingTagNameWithIndex();
		relativeXPathUsingTagNameWithAttributeNameValue();
	}
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.navigate().to("file:///E:/HTML/Sample.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
	}
	public static void absoluteXPathDemo()
	{
		oBrowser.findElement(By.xpath("html/body/div/form/input")).sendKeys("DemoUser1");
	}
	/**
	 * Case 1: Identify the Elemenet based on TagName Alone
	 * Syntax: //<tagName>
	 */
	public static void relativeXPathUsingTagNameAlone()
	{
		oBrowser.findElement(By.xpath("//input")).sendKeys("DemoUser1");
	}
	/**
	 * Case 2: Identify the Element based on TagName with Index
	 * Syntax: //<tagName>[index]
	 */
	private static void relativeXPathUsingTagNameWithIndex()
	{
		oBrowser.findElement(By.xpath("//input[2]")).sendKeys("Password");
	}
	/**
	 * Case 3: Identify the Element based on TagName with 
	 *         attributename and value combination
	 * Syntax: //<tagName>[@attributename='attributevalue']
	 */
	private static void relativeXPathUsingTagNameWithAttributeNameValue()
	{
		oBrowser.findElement(By.xpath("//input[@name='pass1word1']")).sendKeys("DemoUser1");
	}
}
