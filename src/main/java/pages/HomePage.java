package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ember33")
	private WebElement addNewPost;
	
	public void addNewLinkedinPost() {
		addNewPost.click();
		addNewPost.sendKeys("Welcome all linkedin members from automation project \r\n"
				+ "\r\n"
				+ "Created by Shady Ahmed Mohamed using selenium java , TestNG and Apach POI\r\n"
				+ "\r\n"
				+ "Thank you all.");
	}

}
