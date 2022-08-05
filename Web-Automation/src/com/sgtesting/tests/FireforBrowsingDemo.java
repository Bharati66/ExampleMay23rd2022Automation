package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireforBrowsingDemo {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
			LaunchBrowser();
			 navigate();
			 closeApplication();
		}
		private static void LaunchBrowser()
		{
			try
			{
				System.setProperty("webdriver.gecko.driver", "E:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\Drivers\\geckodriver.exe");
				oBrowser=new FirefoxDriver();
			}catch (Exception e)
			{
				e.printStackTrace();	
			}
		}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/login.do");
				Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		private static void closeApplication()
		{
			try
			{
				oBrowser.get(null);
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}