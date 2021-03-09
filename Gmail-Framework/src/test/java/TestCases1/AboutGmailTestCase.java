package TestCases1;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import pages.GmailLoginPage;
import pages.SignUpPage;

public class AboutGmailTestCase  extends  BasePage 
{    GoogleHomePageTest gloginpage;
       GmailLoginPage gmailloginpage;
       SignUpPage signuppage;

	
	@BeforeTest
	public void setup()
	{    initialization();
		gloginpage=new GoogleHomePageTest();
		gloginpage.gmailLinkclick();
		 gmailloginpage=new GmailLoginPage();
	}	
	@Test(priority=1)
	public void validateGmailUrl() {
	String gmailtitle=gmailloginpage.validateTitleGmail();
	System.out.println(gmailtitle);
	Assert.assertEquals(gmailtitle, "Gmail - Email from Google");
	}
	@Test(priority=2)
	public void clickcreateaccount()
	{      
		gmailloginpage.createAccount();
		
	}
}
