package test_cases;

import org.testng.annotations.Test;

import pages.HomePage;

public class TestCase001_AddNewPost extends TestBase {

	@Test(priority = 2, groups = "smoke", description = "Create New Post")
	private void startApplication() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		homePage.addNewLinkedinPost();
		Thread.sleep(5000);
	}

}
