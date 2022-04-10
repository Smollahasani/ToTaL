package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cispackage.element_Highlight;

public class PageObgectLogin {
	

	element_Highlight eh= new element_Highlight();


    @FindBy(xpath="/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[1]/div/input")
	WebElement userName;
    
    @FindBy(xpath="/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[2]/div/input[1]")
	WebElement password;

    @FindBy(xpath="/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[3]/re-captcha/div/div/iframe")
	WebElement iframeSwitch;

    @FindBy(xpath="/html/body/app-root/div/app-login/div/div/div/div[3]/form/div[4]/button")
	WebElement loginbutton;
    
    

    public void login( WebDriver driver,String URL, String UserName , String Password) throws InterruptedException {
    	

    	element_Highlight eh= new element_Highlight();
    	
        eh.highlightElement(driver, userName);
		userName.sendKeys(UserName);
		eh.unhighlightLast(driver, userName);
		
    	eh.highlightElement(driver, password);
    	password.sendKeys(Password);
		eh.unhighlightLast(driver, password);

		
	    driver.switchTo().frame(iframeSwitch);
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div/div/span")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(60000);
		
    	eh.highlightElement(driver, loginbutton);
		loginbutton.click();
		eh.unhighlightLast(driver, loginbutton);
	    Thread.sleep(3000);


	}

}

