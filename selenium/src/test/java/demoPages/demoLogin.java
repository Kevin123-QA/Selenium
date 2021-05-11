package demoPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class demoLogin {
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[1]/td[2]/p/input")
	private WebElement UserLogin;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/form/div/center/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/p/input")
	private WebElement UserPassword; 
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/big/blockquote/blockquote/font/center/b")
	private WebElement message; 
	
	public void loginInfo(String uname, String password) {
		UserLogin.sendKeys(uname);
		UserPassword.sendKeys(password);
		UserPassword.submit();
	}

	public WebElement getUserLogin() {
		return UserLogin;
	}

	public WebElement getUserPassword() {
		return UserPassword;
	}

	public WebElement getMessage() {
		return message;
	}

}
