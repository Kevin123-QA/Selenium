package ShoppingPages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Home {


@FindBy(id = "search_query_top")
private WebElement SearchBar;


public void SearchInfo(String search) {
	SearchBar.sendKeys(search);
	SearchBar.submit();
}

public WebElement getSearchBar() {
	return SearchBar;
}
}
