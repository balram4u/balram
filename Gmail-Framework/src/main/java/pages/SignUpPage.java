package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BasePage;

public class SignUpPage  extends BasePage {
		@FindBy(xpath="//input[@class='whsOnd zHQkBf'][@name='firstName']")
		WebElement fname;
		
		@FindBy(xpath="//input[@class='whsOnd zHQkBf'][@name='lastName']")
		WebElement lname;
		public SignUpPage()
		{
			
			PageFactory.initElements(driver,this);
		}   
		public String getTitleSignupPage()

		{
			return driver.getTitle();
		}
		public  void fillUp(String fnamee, String lnamee)
		{
			
			fname.sendKeys(fnamee);
			lname.sendKeys(lnamee);
		}
		

	}

