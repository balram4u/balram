package TestCases1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import pages.GmailLoginPage;
import pages.SignUpPage;

public class SignupTestcase extends BasePage {
	 GoogleHomePageTest gloginpage;
     GmailLoginPage gmailloginpage;
     SignUpPage signuppage;
	
	@BeforeTest
	public void setup()
	{
		initialization();
		gloginpage=new GoogleHomePageTest();
		gloginpage.gmailLinkclick();
		 gmailloginpage=new GmailLoginPage();
		 gmailloginpage.createAccount();
		SignUpPage signuppage=new SignUpPage();
	}
	@Test(priority=1)
	public void validurl()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=2)
	public void username()
	
	{
		signuppage.fillUp("jjxdndd", "hfhufjid");
		
	}
	

}
