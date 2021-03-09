package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class GmailLoginPage   extends BasePage{
		@FindBy(className="h-c-header__product-logo-text")
		WebElement gmaillogo;
		@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a")
		WebElement createAcc;
		public GmailLoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	public String validateTitleGmail() {
		return driver.getTitle();
	}
	public boolean gmailLogo() {
		return gmaillogo.isDisplayed();
	}
	public SignUpPage createAccount()
	{
	    createAcc.click();
	    return new SignUpPage();

	}


}
