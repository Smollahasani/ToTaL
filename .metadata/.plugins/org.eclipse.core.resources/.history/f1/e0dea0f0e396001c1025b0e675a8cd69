package TestCase;

import org.testng.annotations.Test;

import cispackage.DataProviders;
import cispackage.element_Highlight;
import pageObject.PageObgectLogin;
import pageObject.PageObgect_AddTrapistService;
import pageObject.PageObgect_AddTrapistToClinic;
import pageObject.PageObject_AddPatient;
import pageObject.PageObject_Admit;
import pageObject.PageObject_Landing;
import pageObject.PageObject_ListPatient;
import pageObject.PageObject_MainMenu;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class TestCaseTrapistServiceAdd_Priority {
      String nationalCode;

      
      WebDriver driver;
	element_Highlight eh= new element_Highlight();


  @Test(dataProvider="Login",dataProviderClass=DataProviders.class)
  public void f(String URL ,String UserName ,String Password) throws Throwable {
	 
	  driver.navigate().to(URL);
	  driver.manage().window().maximize();


	  
	  //Login
	  PageObgectLogin admLoginPage = 
				PageFactory.initElements(driver, PageObgectLogin.class);
		admLoginPage.login(driver, URL ,UserName , Password);
		
		//Landing
		PageObject_Landing Icon = PageFactory.initElements(driver, PageObject_Landing.class);
		Icon.CIS_Icon(driver);
		
		  	  System.out.println(driver.getCurrentUrl());
	  for(String window : driver.getWindowHandles() ) {
		  driver.switchTo().window(window);
	  }
	   //EnterToAddClinicServicePage
	  PageObject_MainMenu menu = PageFactory.initElements(driver, PageObject_MainMenu.class);
	  menu.system_variable_menu(driver);
	  Thread.sleep(500);
	  menu.system_variable_add_terapist_Service(driver);
	  Thread.sleep(3000);
	 for(String window : driver.getWindowHandles() ) {
	  driver.switchTo().window(window);
	  }
	 PageObgect_AddTrapistService priority = PageFactory.initElements(driver, PageObgect_AddTrapistService.class);
	 priority.AddServicToTrapist(driver);
	  Thread.sleep(2000);
	  //priority in ClinicService page
	 priority.TrapistServicePriority(driver);


	 }
  
  @BeforeMethod
  
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\s.mollahasani\\webdriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
	  
	  	
  }
	   @AfterMethod
  public void afterMethod() {
	//	driver.quit();
	  
  }

}
