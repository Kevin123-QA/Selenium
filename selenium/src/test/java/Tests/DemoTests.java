package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import demoPages.demoHome;
import demoPages.demoLogin;
import demoPages.demoUser;

public class DemoTests {
public static final String URL = "http://thedemosite.co.uk";
	
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
	
	
	@After
	public void shutdown() {
		driver.close();
	}
	
	@Test
	public void testUserPage() {
		driver.get(URL + "/index.php");
		demoHome homePage = PageFactory.initElements(driver, demoHome.class);
		
		homePage.getUserLink().click();

		assertTrue(driver.getTitle().contains("Add a user"));
	}
	

	@Test
	public void testAddUser() {
		driver.get(URL + "/addauser.php");
		demoUser userPage = PageFactory.initElements(driver, demoUser.class);
		userPage.createUser("Test", "Test1");
		assertEquals(URL+"/savedata.php", driver.getCurrentUrl());
	}
	
	@Test 
	public void Login() {
		
		driver.get(URL+"/login.php");
		demoLogin LoginPage = PageFactory.initElements(driver, demoLogin.class);
		LoginPage.loginInfo("Test", "Test1");
		assertTrue(driver.getPageSource().contains("**Successful Login**"));
	}
}
