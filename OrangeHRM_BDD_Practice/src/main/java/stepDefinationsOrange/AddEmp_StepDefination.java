package stepDefinationsOrange;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import config.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class AddEmp_StepDefination {

	WebDriver driver;

	public AddEmp_StepDefination() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^User is already on LoggedIn$")
	public void user_is_already_on_LoggedIn() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:/SeleniumJars/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@When("^user click on PIM$")
	public void user_click_on_PIM() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
	}

	@Then("^user click on add employee$")
	public void user_click_on_add_employee() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.linkText("Add Employee")).click();
	}

	@Then("^user enters firstname and lastname and midname and empid$")
	public void user_enters_firstname_and_lastname_and_midname(DataTable arg1) throws InterruptedException {
		for (Map<String, String> data : arg1.asMaps(String.class, String.class)) {
			Thread.sleep(3000);
			driver.findElement(By.name("firstName")).sendKeys(data.get("fname"));
			driver.findElement(By.name("lastName")).sendKeys(data.get("lname"));
			driver.findElement(By.name("middleName")).sendKeys(data.get("midname"));
			driver.findElement(By.xpath("//div[@class='orangehrm-card-container']//form/div[1]/div[2]/div[1]/div[2]//input")).sendKeys("");
			driver.findElement(By.xpath("//div[@class='orangehrm-card-container']//form/div[1]/div[2]/div[1]/div[2]//input")).sendKeys(data.get("empid"));
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText("Add Employee")).click();
		}
	}

	@Then("^user exit$")
	public void user_exit() {
		driver.quit();
	}

}
