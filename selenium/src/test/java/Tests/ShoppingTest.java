package Tests;
import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import ShoppingPages.Home;

public class ShoppingTest {
	public static final String url ="http://automationpractice.com";
	private WebDriver driver; 
	
	@Before
	public void init() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		
		//options.setHeadless(true); 
		
		driver = new ChromeDriver(options);
		
		driver.manage().window().setSize(new Dimension(1360, 789));
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	}
	@Test
	public void testSearch() {
		driver.get(url+"/index.php");
		Home homepage = PageFactory.initElements(driver, Home.class);
		homepage.SearchInfo("dress");
		assertEquals(url + "/index.php?controller=search&orderby=position&orderway=desc&search_query=dress",
				driver.getCurrentUrl());
		
	}
}
