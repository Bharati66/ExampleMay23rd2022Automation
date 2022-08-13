package com.sgtesting.actitime.stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	public static WebDriver oBrowser=null;
	/**
	 * Auther:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Given("^I launch the chrome browser$")
	public void i_launch_the_chrome_browser()
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
	/**
	 * Auther:
	 * Created Date;
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */

	@And("^I navigate the Application url$")
	public void i_navigate_the_Application()
	{
		try
		{
			oBrowser.navigate().to("http://localhost/login.do");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Auther:
	 * Created Date;
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the username in username text field$")
	public void i_enter_the_username_in_username_text_field()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */

	@And("^I enter the password in password text field$")
	public void i_enter_the_password_in_password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on login button$")
	public void i_click_on_login_button() 
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I found the home page$")
	public void i_found_the_home_page()
	{
		WebElement oEle=null;
		try
		{
			oEle=oBrowser.findElement(By.xpath("//td[text()='Enter Time-Track']"));
			Assert.assertTrue(oEle.isDisplayed());
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on minimize flyout window$")
	public void i_click_on_minimize_flyout_window()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */

	@And("^I click on user icon")
	public void i_click_on_user_icon()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I click on Add User")
	public void i_click_on_Add_User()
	{
		try
		{
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the firstname in firstname text field")
	public void i_enter_the_firstname_in_firstname_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("firstName")).sendKeys("Zindal");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the lastname in lastname text field")
	public void i_enter_the_lastname_in_lastname_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("lastName")).sendKeys("Steels");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the email in email text field")
	public void i_enter_the_email_in_email_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("email")).sendKeys("zindal@gmail.com");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I enter the Username in Username text field")
	public void i_enter_the_Username_in_Username_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("username")).sendKeys("userdemo1");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I enter the Password in Password text field")
	public void i_enter_the_Password_in_Password_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("password")).sendKeys("Welcome123");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I enter password in retypepassword text field")
	public void i_enter_password_in_retypepassword_text_field()
	{
		try
		{
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("Welcome123");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I click on create user button")
	public void i_click_on_create_user_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I click on user$")
	public void i_click_on_user()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Steels, Zindal']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on email$")
	public void i_click_on_email()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_emailField")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I change the email$")
	public void i_change_the_email()
	{
		try
		{
			oBrowser.findElement(By.name("email")).clear();
			oBrowser.findElement(By.name("email")).sendKeys("steelszindal@gmail.com");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I click on save changes button$")
	public void i_click_on_save_changes_button()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I click on modifieduser$")
	public void i_click_on_modifiedUser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Steels, Zindal']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on delete user$")
	public void I_click_on_delete_user()
	{
		try
		{
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I click on delete alert button$")
	public void I_click_on_delete_alert_button()
	{
		try
		{
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@When("^I click on logout link$")
	public void i_click_on_logout_link()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@Then("^I found the login page$")
	public void i_found_the_login_page() 
	{
		String expected,actual;
		try
		{
			expected="actiTIME - Login";
			actual=oBrowser.getTitle();
			Assert.assertEquals(expected, actual);
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

	/**
	 * Author:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return value:
	 * Purpose:
	 * Description:
	 */
	@And("^I close Application$")
	public void I_close_Application() 
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();;
		}
	}

}
