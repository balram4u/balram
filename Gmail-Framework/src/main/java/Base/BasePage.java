package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	public static WebDriver driver;
	
	public BasePage()  {
		
	}
	//@Parameters("browser")
	//here we add a new comment
		public static void initialization() 
		{
			//if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
			 driver=new ChromeDriver();	
		/*}
			else if(browser.equals("ff")) {
				System.setProperty("webdriver.gecko.driver", "C:\\gecko\\geckodriver.exe");
				 driver=new FirefoxDriver();	
				}*/
			 driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("https://www.google.com");


}
}
