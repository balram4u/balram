package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class G_Home_Page  extends BasePage {
		@FindBy(linkText= "Gmail")
		WebElement gmail;
		@FindBy(id= "hplogo")
		WebElement homelogo;
		@FindBy(name= "q")
		WebElement textfield;
		@FindBy(xpath= "//*[@class='gb_8e']")
		WebElement inlineElement;

		public G_Home_Page() 
		{
		PageFactory.initElements(driver, this);
		}
		public boolean gmailLink() {
			return gmail.isDisplayed();
		}
		public String gmailUrl() {
			return driver.getCurrentUrl();
		}
		public String gmailTitle() {
			return driver.getTitle();
		}
		public boolean gmailLogo() {
			return homelogo.isDisplayed();
		}
		public String logoText() {
			return homelogo.getText();
		}
		public void textField() {
			textfield.sendKeys( "dell laptop");
			textfield.sendKeys(Keys.ENTER);
		}
		public void inlineElemrnt1()
		{
			
		inlineElement.click();	
			}
		public GmailLoginPage gmailLinkClick()
		{
			 gmail.click();
			return new GmailLoginPage();

		}

	
	
	}
