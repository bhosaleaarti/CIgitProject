package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	 public WebDriver driver; 

  @Test
  public void openMyBlog() {
	  driver.get("https://www.softwaretestingmaterial.com/");
	  
  }	  
	  @BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\drivers\\geckodriver.exe");
	   driver = new FirefoxDriver();
	   System.out.println("Launching the browser..........1111");
	   System.out.println("Launching the browser..........1111");
	   System.out.println("Launching the browser..........1111");
	   System.out.println("Launching the browser..........1111");
	  }
	 
	  @AfterClass
	  public void afterClass() {
	   driver.quit();
	  }
}
