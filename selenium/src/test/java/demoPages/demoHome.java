package demoPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoHome {
	@FindBy(linkText="3. Add a User")
	private WebElement UserLink;	
	
	@FindBy(linkText="4. Login")
	private WebElement LoginLink;
	
	public WebElement getUserLink() {
		return UserLink;
	}

	public WebElement getLoginLink() {
		return LoginLink;
	}

}
