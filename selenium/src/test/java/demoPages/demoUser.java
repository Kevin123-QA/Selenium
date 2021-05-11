package demoPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoUser {
	
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(name="password")
	private WebElement password;
	
	public void createUser(String user, String Password) {
		username.sendKeys(user);
		password.sendKeys(Password);
		password.submit();
	}

	public WebElement getUser() {
		return username;
	}

	public void setUser(WebElement user) {
		this.username = user;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	
}
