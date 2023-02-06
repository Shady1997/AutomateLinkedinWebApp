package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "session_key")
	private WebElement userName;

	@FindBy(id = "session_password")
	private WebElement password;

	@FindBy(xpath = "//button[@class='sign-in-form__submit-button']")
	private WebElement signinButton;

	// sign in
	public void loginToLinkedin() {
		userName.sendKeys(PageBase.getExcelData(1, 0, "Sheet1"));
		password.sendKeys(PageBase.getExcelData(1, 1, "Sheet1"));
		signinButton.click();
	}

}
