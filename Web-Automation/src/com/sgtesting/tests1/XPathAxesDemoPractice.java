package com.sgtesting.tests1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemoPractice {
	public static WebDriver oBrowser=null;
	public static void main(String [] args) {
		LaunchBrowser();
		Navigation();
		enterSalaryforSachinTendulkar();
		enterSalaryForPersonWhoIsNextToSachinTendulkar();
		//EnabletheStatusforDesignationIndianFreedomFighter();
		FromRahulDravidPreviousRecordSelectStatusasActive();
	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", ".\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}public static void Navigation()
	{
		try
		{
			oBrowser.navigate().to("file:///E:/HTML/WebTableHTML.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	/* Following Sibling
	 * Case1:Enter Salary for person Sachin Tendulkar
	 */
	public static void enterSalaryforSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td/following-sibling::td/following-sibling::td/following-sibling::td/input")).sendKeys("70000");
	}
	/**
	 *  following
	 *  Case 2: Enter the Salary for Person Who is next to Sachin Tendulkar
	 */
	public static void enterSalaryForPersonWhoIsNextToSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following::tr[1]/td[6]/input")).sendKeys("65000");
	}
	/**
	 *  preceding-sibling
	 *  Case 3: Enable the status for Designation Indian Freedom Fighter
	 */
	public static void EnabletheStatusforDesignationIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding-sibling::td[1]/input")).click();
	}
	/**
	 *  preceding
	 *  Case 4: From Rahul Dravid Previous Record select Status as Active
	 */
	public static void FromRahulDravidPreviousRecordSelectStatusasActive()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	/**
	 *  ancestor
	 *  Case 5: Based on Sachin Tendulkar Salary Edit Field Fetch the Table id Attribute Value
	 */
	public static void BasedOnSachinTendulkarSalaryEditFieldFetchTheTableidAttributeValue()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/ancestor::td/ancestor::tr/ancestor/table"));
				String content=oEle.getAttribute("id");
				System.out.println(content);
		
	}
}
