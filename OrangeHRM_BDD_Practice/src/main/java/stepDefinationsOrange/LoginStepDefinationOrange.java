package stepDefinationsOrange;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import config.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class LoginStepDefinationOrange extends TestBase {

	public LoginStepDefinationOrange() throws IOException {
		super();
		// TODO Auto-generated constructor stub

	}

	// WebDriver driver;

	@Given("^User is already on login page$")
	public void user_is_already_on_login_page() throws IOException {

		// System.setProperty("webdriver.gecko.driver",
		// "C:/SeleniumJars/geckodriver.exe");
		// driver = new FirefoxDriver();
		// driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		initialization();
	}

	@When("^title of the page is OrangeHRM$")
	public void title_of_the_page_is_OrangeHRM() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Then("^user enters username \"([^\"]*)\" and user enters password \"([^\"]*)\"$")
	public void user_enters_username_and_user_enters_password(String arg1, String arg2) throws InterruptedException {

		// Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(arg1);
		driver.findElement(By.name("password")).sendKeys(arg2);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

	@Then("^user gets on Dashboard$")
	public void user_gets_on_Dashboard() throws InterruptedException {
		// Thread.sleep(2000);
		boolean flag1 = driver.findElement(By.xpath("//img[@class='oxd-userdropdown-img']")).isDisplayed();
		Assert.assertEquals(true, flag1);
	}

	@Then("^user quit$")
	public void user_quit() {

		driver.quit();

	}

}
