package TestCases1;

import org.junit.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BasePage;
import pages.G_Home_Page;
import pages.GmailLoginPage;

public class GoogleHomePageTest extends BasePage {
	G_Home_Page gPage;
	GmailLoginPage gmailpage;
	GoogleHomePageTest()
	    {
		super();
		}
	@BeforeTest
	public void setup(){
		initialization();
		}
@Test(priority=1)
public void validateGmail()
{gPage=new G_Home_Page();
	boolean visibleLink=gPage.gmailLink();	
	Assert.assertTrue(visibleLink);
}
@Test(priority=2)
public void validateTitle(){
gPage=new G_Home_Page();
String  title=gPage.gmailTitle();	
System.out.println(title);
Assert.assertEquals(title,"Google");
}
@Test(priority=3)
public void validateUrl(){
gPage=new G_Home_Page();
String  url=gPage.gmailUrl();	
System.out.println(url);
Assert.assertEquals(url,"https://www.google.com/");
}
@Test(priority=4)
public void gmailLinkclick()
{
gPage=new G_Home_Page();
gmailpage=gPage.gmailLinkClick();	
String titlenextPage=driver.getTitle();
System.out.println(titlenextPage);
Assert.assertEquals(titlenextPage,"Gmail - Email from Google");


}

}
